package ru.aberezhnoy.lesson009.ex03;

import java.util.Iterator;

public class Worker implements Iterator<String> {
    private String firstName;
    private String lastName;
    private int age;
    private int salary;
    private int index;

    public Worker(String firstName, String lastName, int age, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public boolean hasNext() {
        return index++ < 4;
    }

    @Override
    public String next() {
        return switch (index) {
            case 1 -> String.format("FirstName: %s", firstName);
            case 2 -> String.format("LastName: %s", lastName);
            case 3 -> String.format("Age: %d", age);
            default -> String.format("Salary: %d", salary);
        };
    }
}
