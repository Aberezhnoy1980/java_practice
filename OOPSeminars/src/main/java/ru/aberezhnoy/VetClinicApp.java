package ru.aberezhnoy;

import ru.aberezhnoy.animals.Animal;
import ru.aberezhnoy.animals.Dog;
import ru.aberezhnoy.animals.Duck;
import ru.aberezhnoy.animals.Illness;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VetClinicApp {
    public static void main(String[] args) {
        Animal cat = new Animal("Barsik", new Illness("Bronchitis"), LocalDate.of(2023, 3, 15));

        Animal animal = new Animal();

        cat.setIllness(new Illness("Live"));

        System.out.println(cat.getName());
        System.out.println(cat);
        System.out.println(animal);

        final Dog dog = new Dog("Sharik", new Illness("Blind"), LocalDate.of(2022, 1,10));

        final Animal duck = new Duck("Donald", new Illness("Ugly"), LocalDate.now(), 2);

        System.out.println(dog);
        System.out.println(duck);

        final ArrayList<Animal> animals = new ArrayList<>(List.of(dog, duck, cat));

        System.out.println(animals);

        animals.add(new Duck("Kesha", new Illness("Attractive"), LocalDate.now(), 7));

        System.out.println(animals);

        dog.lifeCycle();

    }
}
