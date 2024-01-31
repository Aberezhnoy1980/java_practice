package ru.aberezhnoy.vetclinic;

import ru.aberezhnoy.vetclinic.animals.Huntable;
import ru.aberezhnoy.vetclinic.animals.impl.*;
import ru.aberezhnoy.vetclinic.factory.Factory;
import ru.aberezhnoy.vetclinic.illnesses.Illness;
import ru.aberezhnoy.vetclinic.medicalstaff.Employee;
import ru.aberezhnoy.vetclinic.medicalstaff.Gender;
import ru.aberezhnoy.vetclinic.medicalstaff.impl.Doctor;
import ru.aberezhnoy.vetclinic.medicalstaff.impl.Nurse;
import ru.aberezhnoy.vetclinic.vetservice.VeterinaryClinic;

import java.time.LocalDate;

public class VetClinicApp {
    public static void main(String[] args) {
        final VeterinaryClinic clinic = Factory.getVetService();

        clinic.registerNewPatient(new Duck("Donald", new Illness("Grey"), LocalDate.now(), 2));
        clinic.registerNewPatient(new Duck());
        clinic.registerNewPatient(new Dog());
        clinic.registerNewPatient(new Cat());
        clinic.registerNewPatient(new Fish());
        clinic.registerNewPatient(new Fish());
        clinic.registerNewPatient(new Snake("Elena Anatolevna"));

        clinic.getPatients();

        System.out.println("\nHere types of patients: " + clinic.getTypes());

        clinic.getProfiles();

        clinic.getWalkables();

        clinic.getSwimables();

        System.out.println("\nFlyables are: " + clinic.getFlyables());

        clinic.dischargePatient(clinic.getPatientByName("Duck_#1"));
        clinic.dischargePatient(clinic.getPatientByName("Fish_#1"));

        System.out.println();

        clinic.getPatients();
        final Nurse amanda = new Nurse("Amanda", 23, Gender.Female);
        final Nurse lenka = new Nurse("Lenka zmeya", 23, Gender.Female);
        final Doctor alex = new Doctor("Alex", 43, Gender.Male);
        clinic.hireEmployee(amanda);
        clinic.hireEmployee(lenka);
        clinic.hireEmployee(alex);
        clinic.hireEmployee(new Nurse("Svetka", 20, Gender.Female));
        clinic.hireEmployee(new Doctor("Steve", 34, Gender.Male, amanda));
        clinic.hireEmployee(new Doctor("Slava", 63));

        Employee slava = clinic.getEmployeeByName("Slava");
        ((Doctor) slava).setAssistant((Nurse) clinic.getEmployeeByName("Svetka"));

        clinic.getEmployees();

        clinic.fireEmployee(slava);
        alex.setAssistant(lenka);
        System.out.println("\nnew staff: ");
        clinic.getEmployees();

        System.out.println("Doctors: ");
        System.out.println(clinic.getDoctors());

        System.out.println("Nurses: ");
        System.out.println(clinic.getNurses());

        System.out.println(clinic.getPatientByName("Donald"));

        alex.makeDiagnosis(clinic.getPatientByName("Donald"), "Lame");
        lenka.makeVaccination(clinic.getPatientByName("Donald"));

        System.out.println(clinic.getPatientByName("Donald"));

        lenka.makeVaccination(clinic.getPatientByName("Donald"));

        System.out.println(clinic.getPatientByName("Donald"));

        alex.makeDiagnosis(clinic.getPatientByName("Serega"), "Pervert");
        lenka.makeVaccination(clinic.getPatientByName("Serega"));

        final Cat barsik = new Cat("Barsik");
        final Duck pigeon = new Duck("Pigeon");

        Huntable harvest = (predator, victim) -> System.out.printf("%s the %s overtook and devoured the %s %s\n",
                predator.getName(), predator.getType(), victim.getType(), victim.getName());

        harvest.hunt(barsik, pigeon);
    }
}

