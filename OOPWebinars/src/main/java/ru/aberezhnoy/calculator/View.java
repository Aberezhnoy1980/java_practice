package ru.aberezhnoy.calculator;

import java.util.Scanner;

public class View {

    private final Scanner sc;

    public View() {
        this.sc = new Scanner(System.in);
    }

    public int getValue(String title) {
        System.out.printf("%s", title);
        return sc.nextInt();
    }

    public void print(int data, String title) {
        System.out.printf("%s %d\n", title, data);
    }
}
