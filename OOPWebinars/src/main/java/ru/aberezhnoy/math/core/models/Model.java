package ru.aberezhnoy.math.core.models;

import ru.aberezhnoy.math.mathematics.calculatearea.Calculate;
import ru.aberezhnoy.math.mathematics.shapes.Canvas;
import ru.aberezhnoy.math.mathematics.shapes.Shape;

public class Model {
    Shape panel;
    Calculate calc;

    public Model(Calculate calc, String canvasName) {
        this.panel = new Canvas(canvasName);
        this.calc = calc;
    }

    public void append(Shape shape) {
        panel.shapes.add(shape);
    }

    public double area() {
        return calc.visit(panel);
    }

    public String show() {
        return panel.toString();
    }
}
