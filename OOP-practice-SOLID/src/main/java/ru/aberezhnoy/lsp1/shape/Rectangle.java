package ru.aberezhnoy.lsp1.shape;

public class Rectangle implements Quadrilateral {
    private final int sideA;
    private final int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int getArea() {
        return sideA * sideB;
    }

    @Override
    public void getInfo() {
        System.out.printf("In a %s side A = %d, side B = %d\n", this.getClass().getSimpleName(), sideA, sideB);
    }
}
