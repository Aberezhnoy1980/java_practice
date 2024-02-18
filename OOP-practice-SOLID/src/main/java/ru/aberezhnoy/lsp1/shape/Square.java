package ru.aberezhnoy.lsp1.shape;


public class Square implements Quadrilateral {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return (int) Math.pow(side, 2);
    }

    @Override
    public void getInfo() {
        System.out.printf("In a %s side = %d\n", this.getClass().getSimpleName(), side);
    }
}
