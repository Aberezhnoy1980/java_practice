package ru.aberezhnoy.lsp1.shape;

public class Square extends Quadrilateral {

    public Square(int side) {
        super(side, side);
    }

    @Override
    public int getArea() {
        return (int) Math.pow(sideA, 2);
    }
}
