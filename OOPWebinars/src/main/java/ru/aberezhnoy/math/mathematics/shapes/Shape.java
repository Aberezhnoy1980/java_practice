package ru.aberezhnoy.math.mathematics.shapes;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
    protected double area;
    protected String name;

    public double getArea() {
        return area;
    }

    protected void setArea(double value) {
        area = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        name = value;
    }

    public List<Shape> shapes = new ArrayList<>();

    private void print(StringBuilder sb, String indent) {
        sb.append(String.format("%s %s %s\n", indent, name, getArea()));

        for (Shape shape : shapes) {
            shape.print(sb, indent + " ");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        print(sb, "");
        return sb.toString();
    }
}
