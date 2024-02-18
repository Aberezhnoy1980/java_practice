package ru.aberezhnoy.srp1;

import ru.aberezhnoy.srp1.draw.Drawer;
import ru.aberezhnoy.srp1.draw.SquareDrawer;
import ru.aberezhnoy.srp1.figure.Figure;
import ru.aberezhnoy.srp1.figure.Point;
import ru.aberezhnoy.srp1.figure.Square;

public class Main {
    public static void main(String[] args) {
        Figure square = new Square(new Point(1,1), 5);
        System.out.printf("Square area: %d \n", square.getArea());
        Drawer squareDrawer = new SquareDrawer();
        squareDrawer.draw(square);
    }
}
