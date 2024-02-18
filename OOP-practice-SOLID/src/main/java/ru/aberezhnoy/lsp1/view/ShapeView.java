package ru.aberezhnoy.lsp1.view;

import ru.aberezhnoy.lsp1.shape.Quadrilateral;

public class ShapeView {

    public ShapeView() {
    }

    public void showArea(Quadrilateral figure) {
        System.out.printf("Area of %s equal: ", figure.getClass().getSimpleName());
        System.out.println(figure.getArea());
    }
}
