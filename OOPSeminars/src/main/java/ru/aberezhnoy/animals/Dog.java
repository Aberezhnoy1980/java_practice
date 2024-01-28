package ru.aberezhnoy.animals;

import java.time.LocalDate;

public class Dog extends Animal {

    public Dog(String name, Illness illness, LocalDate birtDay) {
        super(name, illness, birtDay);
    }

    @Override
    public String toString() {
        return String.format("Animal: %s, %s, %s, %s", this.getType(), getName(), getIllness(), getBirthDay());
    }

}
