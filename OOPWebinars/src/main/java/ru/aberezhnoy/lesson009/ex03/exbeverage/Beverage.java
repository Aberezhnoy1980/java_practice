package ru.aberezhnoy.lesson009.ex03.exbeverage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Beverage implements Iterator<Ingredient> {
    private List<Ingredient> components;
    private int index;

    public Beverage() {
        components = new ArrayList<>();
        index = 0;
    }

    public void addComponent(Ingredient component) {
        components.add(component);
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Ingredient next() {
        return components.get(index++);
    }
}
