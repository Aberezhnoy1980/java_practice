package ru.aberezhnoy.srp1.figure;

import java.util.ArrayList;
import java.util.List;

public abstract class Figure {

    final List<Point> points;
    final int side;

    public Figure(int side) {
        this.side = side;
        this.points = new ArrayList<>();
    }

    public int getSide() {
        return side;
    }

    public List<Point> getPoints() {
        return points;
    }

    public abstract int getArea();
}
