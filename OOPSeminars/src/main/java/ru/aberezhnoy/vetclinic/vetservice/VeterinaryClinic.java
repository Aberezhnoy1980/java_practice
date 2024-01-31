package ru.aberezhnoy.vetclinic.vetservice;

import ru.aberezhnoy.vetclinic.animals.Animal;
import ru.aberezhnoy.vetclinic.animals.Flyable;
import ru.aberezhnoy.vetclinic.animals.Swimable;
import ru.aberezhnoy.vetclinic.animals.Walkable;
import ru.aberezhnoy.vetclinic.medicalstaff.Employee;
import ru.aberezhnoy.vetclinic.medicalstaff.impl.Doctor;
import ru.aberezhnoy.vetclinic.medicalstaff.impl.Nurse;

import java.util.List;
import java.util.Set;

public interface VeterinaryClinic {
    void getPatients();

    Animal getPatientByName(String name);

    void getProfiles();

    Set<String> getTypes();

    void getWalkables();

    List<Flyable> getFlyables();

    void getSwimables();

    void getEmployees();

    Employee getEmployeeByName(String name);

    List<Doctor> getDoctors();

    List<Nurse> getNurses();

    void registerNewPatient(Animal patient);

    void dischargePatient(Animal patient);

    void hireEmployee(Employee employee);

    void fireEmployee(Employee employee);
}
