package ru.aberezhnoy.ocp1;

import ru.aberezhnoy.ocp1.shape.Shape;
import ru.aberezhnoy.ocp1.shape.impl.Rectangle;
import ru.aberezhnoy.ocp1.shape.impl.RightTriangle;
import ru.aberezhnoy.ocp1.shape.impl.Square;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RightTriangle(2, 3));
        shapes.add(new Square(4));
        shapes.add(new Rectangle(2, 3));
        double sumArea = 0;
        for (Shape shape : shapes) {
            sumArea += shape.getArea();

        }
        System.out.printf("Sum of areas equals %f \n", sumArea);
    }
}
