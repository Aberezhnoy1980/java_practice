package ru.aberezhnoy.srp1.figure;

import java.util.ArrayList;
import java.util.List;

public abstract class Figure {
    final List<Point> points;
    final int side;

    public Figure(Point point, int side) {
        this.side = side;
        this.points = new ArrayList<>();
    }

    public List<Point> getPoints() {
        return points;
    }

    public int getSide() {
        return side;
    }

}
