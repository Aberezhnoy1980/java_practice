package ru.aberezhnoy.srp1.figure.draw;

import ru.aberezhnoy.srp1.figure.Figure;

public class SquareDrawer extends Drawer {
    @Override
    public void draw(Figure square) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < square.getSide(); i++) {
            builder.append("* ");
        }
        System.out.println(builder);
        for (int i = 0; i < square.getSide(); i++) {
            if (i < square.getSide() - 2) {
                System.out.print("*");
            } else {
                continue;
            }

            for (int j = 1; j < square.getSide() - 1; j++) {
                System.out.print(" *");
            }
            System.out.println(" *");
        }

        System.out.println(builder);
    }
}
