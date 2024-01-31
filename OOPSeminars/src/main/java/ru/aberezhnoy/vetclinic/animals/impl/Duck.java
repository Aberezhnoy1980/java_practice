package ru.aberezhnoy.vetclinic.animals.impl;

import ru.aberezhnoy.vetclinic.animals.Animal;
import ru.aberezhnoy.vetclinic.animals.Flyable;
import ru.aberezhnoy.vetclinic.animals.Swimable;
import ru.aberezhnoy.vetclinic.animals.Walkable;
import ru.aberezhnoy.vetclinic.illnesses.Illness;

import java.time.LocalDate;

public class Duck extends Animal implements Walkable, Flyable, Swimable {
    private final int wingCount;

    static {
        animalIdx = 1;
    }

    public Duck(String name, Illness illness, LocalDate birthday, int wingCount) {
        super(name, illness, birthday);
        this.wingCount = wingCount;
    }

    public Duck(String name) {
        this(name, new Illness("Lame"), LocalDate.of(2020, 1, 1), 2);
    }

    public Duck() {
        this(String.format("Duck_#%d", animalIdx++));
    }

    private int getWingCount() {
        return wingCount;
    }

    @Override
    public double run() {
        return 1D;
    }

    @Override
    public double fly() {
        return 10D;
    }

    @Override
    public double swim() {
        return 3D;
    }
}
