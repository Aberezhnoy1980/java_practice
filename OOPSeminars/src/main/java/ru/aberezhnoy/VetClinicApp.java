package ru.aberezhnoy;

import ru.aberezhnoy.animals.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class VetClinicApp {
    public static void main(String[] args) {
        final ArrayList<Animal> animals = new ArrayList<>(Arrays.asList(new Duck("Donald", new Illness("Grey"), LocalDate.now(), 2), new Duck(), new Dog(), new Cat(), new Fish(), new Fish(), new Snake("Elena Anatolevna")));

        for (Animal a : animals) {
            System.out.println(a);
            a.toWalk();
            a.toSwim();
            a.toFly();
            System.out.println("-------------");
        }
    }
}
