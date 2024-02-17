package ru.aberezhnoy.lsp1;

import ru.aberezhnoy.lsp1.shape.Quadrilateral;
import ru.aberezhnoy.lsp1.shape.Rectangle;
import ru.aberezhnoy.lsp1.shape.Square;
import ru.aberezhnoy.lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Quadrilateral square = new Square(5);
        System.out.printf("In a square side A = %d, side B = %d\n", square.getSideA(), square.getSideB());
        ShapeView view = new ShapeView();
        view.showArea(square);

        System.out.println();

        Quadrilateral rectangle = new Rectangle(3, 5);
        System.out.printf("In a rectangle side A = %d, side B = %d\n", rectangle.getSideA(), rectangle.getSideB());
        view.showArea(rectangle);
    }
}
