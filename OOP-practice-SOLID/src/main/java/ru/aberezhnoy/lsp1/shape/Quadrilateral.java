package ru.aberezhnoy.lsp1.shape;

public abstract class Quadrilateral {
    int sideA;
    int sideB;

    public Quadrilateral(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public abstract int getArea();

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }
}
