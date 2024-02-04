package ru.aberezhnoy.lesson009.ex05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(1, 20));
        }

        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);

        final ArrayList<Worker> workers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            workers.add(new Worker("Name " + i, "Surname " + i, random.nextInt(18, 60), random.nextInt(10000)));
        }

        Collections.sort(workers);
        System.out.println(workers);

        workers.sort(new SalaryComparator());
        System.out.println(workers);

        workers.sort(Comparator.comparingInt(Worker::getAge));
        System.out.println(workers);
    }
}
