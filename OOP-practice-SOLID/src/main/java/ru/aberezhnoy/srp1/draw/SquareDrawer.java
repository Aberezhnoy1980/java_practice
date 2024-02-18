package ru.aberezhnoy.srp1.draw;

import ru.aberezhnoy.srp1.figure.Figure;

public class SquareDrawer extends Drawer {
    @Override
    public void draw(Figure fig) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < fig.getSide(); i++) {
            builder.append("* ");
        }
        System.out.println(builder);
        for (int i = 0; i < fig.getSide(); i++) {
            if (i < fig.getSide() - 2) {
                System.out.print("*");
            } else {
                continue;
            }

            for (int j = 1; j < fig.getSide() - 1; j++) {
                System.out.print(" *");
            }
            System.out.println(" *");
        }
        System.out.println(builder);
    }
}
