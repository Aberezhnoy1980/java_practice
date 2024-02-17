package ru.aberezhnoy.ocp1.shape.impl;

import ru.aberezhnoy.ocp1.shape.Shape;

public class Square  implements Shape {
    private final int side;
    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getSquare() {
        return Math.pow(this.side, 2);
    }
}
