package ru.aberezhnoy.vetclinic.medicalstaff.impl;

import ru.aberezhnoy.vetclinic.animals.Animal;
import ru.aberezhnoy.vetclinic.medicalstaff.Employee;
import ru.aberezhnoy.vetclinic.medicalstaff.Gender;

public class Nurse extends Employee {

    public Nurse(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    public void makeVaccination(Animal patient) {
        if (patient != null && !patient.getIsVaccinated())
            patient.setIsVaccinated(true);
        else System.out.println("Vaccination is not possible");
    }
}
