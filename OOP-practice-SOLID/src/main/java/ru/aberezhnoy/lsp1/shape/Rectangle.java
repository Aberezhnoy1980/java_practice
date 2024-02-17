package ru.aberezhnoy.lsp1.shape;

public class Rectangle extends Quadrilateral {

    public Rectangle(int sideA, int sideB) {
        super(sideA, sideB);
    }

    @Override
    public int getArea() {
        return sideA * sideB;
    }
}
