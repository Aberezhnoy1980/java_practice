package ru.aberezhnoy.vetclinic.animals.impl;

import ru.aberezhnoy.vetclinic.animals.Animal;
import ru.aberezhnoy.vetclinic.animals.Swimable;
import ru.aberezhnoy.vetclinic.animals.Walkable;
import ru.aberezhnoy.vetclinic.illnesses.Illness;

import java.time.LocalDate;

public class Snake extends Animal implements Walkable, Swimable {

    static {
        animalIdx = 1;
    }

    public Snake(String name, Illness illness, LocalDate birthday) {
        super(name, illness, birthday);
    }

    public Snake(String name) {
        this(name, new Illness("Osteochondrosis"), LocalDate.of(2000, 6, 13));
    }

    public Snake() {
        this(String.format("Snake_#%d", animalIdx++));
    }

    @Override
    public double swim() {
        return 3D;
    }

    @Override
    public double run() {
        return 2D;
    }
}
