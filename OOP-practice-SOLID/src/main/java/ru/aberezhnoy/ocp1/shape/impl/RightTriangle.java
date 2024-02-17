package ru.aberezhnoy.ocp1.shape.impl;

import ru.aberezhnoy.ocp1.shape.Shape;

public class RightTriangle implements Shape {
    private final int leg1;
    private final int leg2;
    private final double hypotenuse;

    public RightTriangle(int leg1, int leg2) {
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.hypotenuse = Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));
    }

    @Override
    public double getSquare() {
        return this.leg1 * this.leg2 / 2.0;
    }
}
