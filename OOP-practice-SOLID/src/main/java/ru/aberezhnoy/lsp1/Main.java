package ru.aberezhnoy.lsp1;

import ru.aberezhnoy.lsp1.shape.Quadrilateral;
import ru.aberezhnoy.lsp1.shape.Rectangle;
import ru.aberezhnoy.lsp1.shape.Square;
import ru.aberezhnoy.lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Quadrilateral square = new Square(5);
        ShapeView view = new ShapeView();
        square.getInfo();
        view.showArea(square);
        System.out.println();
        Quadrilateral rectangle = new Rectangle(5, 3);
        rectangle.getInfo();
        view.showArea(rectangle);
    }
}
