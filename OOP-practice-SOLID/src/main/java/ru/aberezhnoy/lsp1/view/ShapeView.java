package ru.aberezhnoy.lsp1.view;

import ru.aberezhnoy.lsp1.shape.Quadrilateral;

public class ShapeView {
    public void showArea(Quadrilateral quadrilateral) {
        System.out.printf("Area of %s equal:", quadrilateral.getClass().getSimpleName());
        System.out.println(quadrilateral.getArea());
    }
}
