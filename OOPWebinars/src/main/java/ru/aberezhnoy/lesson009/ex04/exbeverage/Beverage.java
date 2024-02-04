package ru.aberezhnoy.lesson009.ex04.exbeverage;

import java.util.ArrayList;
import java.util.List;

public abstract class Beverage implements Iterable<Ingredient> {
    private List<Ingredient> components;
    private int index;

    public Beverage() {
        components = new ArrayList<>();
        index = 0;
    }

    public List<Ingredient> getComponents() {
        return components;
    }

    public void addComponent(Ingredient component) {
        components.add(component);
    }
}
