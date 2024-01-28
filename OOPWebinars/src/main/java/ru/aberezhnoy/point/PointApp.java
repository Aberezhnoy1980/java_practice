package ru.aberezhnoy.point;

public class PointApp {
    public static void main(String... args) {
        final Point2D a = new Point2D(0,2 );

        System.out.println(a.getX());
        System.out.println(a.getY());

        final Point2D b = new Point2D(0);

        System.out.println(b);

        var dis = Point2D.getDistance(a, b);
        System.out.println(dis);
    }
}
