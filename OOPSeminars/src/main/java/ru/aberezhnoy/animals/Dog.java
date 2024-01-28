package ru.aberezhnoy.animals;

import java.time.LocalDate;

public class Dog extends Animal {

    static {
        Dog.animalIdx = 1;
    }

    public Dog(String name, Illness illness, LocalDate birtDay) {
        super(name, illness, birtDay);
    }

    public Dog(String name) {
        this(name, new Illness("Fleas"), LocalDate.of(2020, 1, 1));
    }

    public Dog() {
        this(String.format("Dog_#%d", animalIdx++));
    }

    @Override
    public void toFly() {
        System.out.println(this.getType() + " can't fly");
    }

    @Override
    public String toString() {
        return String.format("Animal: %s, %s, %s, %s", this.getType(), getName(), getIllness(), getBirthDay());
    }

}
