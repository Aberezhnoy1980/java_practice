package ru.aberezhnoy.animals;

import java.time.LocalDate;

public class Duck extends Animal {
    private int wingCount;

    public Duck(String name, Illness illness, LocalDate birtDay, int wingCount) {
        super(name, illness, birtDay);
        this.wingCount = wingCount;
    }

    private int getWingCount() {
        return wingCount;
    }

    @Override
    public String toString() {
        return String.format("Animal: %s, %s, %s, %s, %d", this.getType(), getName(), getIllness(), getBirthDay(), this.getWingCount());
    }
}
