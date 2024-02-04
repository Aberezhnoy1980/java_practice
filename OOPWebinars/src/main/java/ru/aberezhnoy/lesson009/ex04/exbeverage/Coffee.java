package ru.aberezhnoy.lesson009.ex04.exbeverage;

import java.util.Iterator;

public class Coffee extends Beverage {

    @Override
    public Iterator<Ingredient> iterator() {
        Iterator<Ingredient> ingredientIterator = new Iterator<>() {
            private int index;

            @Override
            public boolean hasNext() {
                return index < getComponents().size();
            }

            @Override
            public Ingredient next() {
                return getComponents().get(index++);
            }
        };
        return ingredientIterator;

    }
}
