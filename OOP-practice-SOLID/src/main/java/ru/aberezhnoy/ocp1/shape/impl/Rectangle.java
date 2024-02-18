package ru.aberezhnoy.ocp1.shape.impl;

import ru.aberezhnoy.ocp1.shape.Shape;

public class Rectangle implements Shape {
    private double leg1;
    private double leg2;

    public Rectangle(int leg1, int leg2) {
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    @Override
    public double getArea() {
        return leg1 * leg2;
    }
}

