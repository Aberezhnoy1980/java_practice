package ru.aberezhnoy.lesson009.ex05;

public class Worker implements Comparable<Worker> {
    private String firstName;
    private String lastName;
    private int age;
    private int salary;

    public Worker(String firstName, String lastName, int age, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }
    public int getSalary() {
        return salary;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public String toString() {
        return String.format("\n%s %d %d", fullName(), age, salary);
    }

    @Override
    public int compareTo(Worker o) {
//        if (this.age > o.age) return 1;
//        else if (this.age < o.age) return -1;
//        else return 0;
        return Integer.compare(this.age, o.age);
    }
}
