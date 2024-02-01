package ru.aberezhnoy.drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterator<Component> {
    private List<Component> components;
    private int idx;

    public Pharmacy() {
        this.components = new ArrayList<>();
        this.idx = 0;
    }

    public Pharmacy addComponent(Component item) {
        components.add(item);
        return this;
    }

    @Override
    public boolean hasNext() {
        return idx < components.size();
    }

    @Override
    public Component next() {
        return components.get(idx++);
    }
}
