package ru.aberezhnoy.srp1.figure;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
    private final List<Point> points;
    private final int side;

    public Shape(int side) {
        this.side = side;
        this.points = new ArrayList<>();
    }

    public void draw() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < side; i++) {
            builder.append("* ");
        }
        System.out.println(builder);
        for (int i = 0; i < side; i++) {
            if (i < side - 2) {
                System.out.print("*");
            } else {
                continue;
            }

            for (int j = 1; j < side - 1; j++) {
                System.out.print(" *");
            }
            System.out.println(" *");
        }

        System.out.println(builder);
    }
}
