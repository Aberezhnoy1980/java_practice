package ru.aberezhnoy.point;

/**
 * It is point 2D
 */
public class Point2D {
    private int x;
    private int y;

    /**
     * It is constructor
     *
     * @param valueX it's x coordinate
     * @param valueY it's y coordinate
     */
    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public Point2D(int value) {
        this(value, value);
    }

    public Point2D() {
        this(0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static double getDistance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    private String getInfo() {
        return String.format("x: %d; y: %d", x, y);
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
