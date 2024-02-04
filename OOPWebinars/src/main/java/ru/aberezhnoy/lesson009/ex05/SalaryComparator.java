package ru.aberezhnoy.lesson009.ex05;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Worker> {
    @Override
    public int compare(Worker w1, Worker w2) {
        return Integer.compare(w1.getSalary(), w2.getSalary());
    }
}
