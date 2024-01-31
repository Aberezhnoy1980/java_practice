package ru.aberezhnoy.vetclinic.repository;

import ru.aberezhnoy.vetclinic.animals.Animal;
import ru.aberezhnoy.vetclinic.medicalstaff.Employee;

import java.util.List;

public interface Repository {
    List<Animal> getAnimals();

    List<Employee> getEmployees();

    void addAnimal(Animal animal);

    void removeAnimal(Animal animal);

    void addEmployee(Employee employee);

    void removeEmployee(Employee employee);
}
