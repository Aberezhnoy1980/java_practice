package ru.aberezhnoy.srp1.figure;

public class Square extends Figure {
    public Square(Point point1, int side) {
        super(point1, side);

        Point point2 = new Point(point1.getX() + side, point1.getY());
        Point point3 = new Point(point1.getX() + side, point1.getY() + side);
        Point point4 = new Point(point1.getX(), point1.getY() + side);

        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);
    }

    public int getArea() {
        return side * side;
    }
}
