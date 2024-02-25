package ru.aberezhnoy.math.client;

import ru.aberezhnoy.math.core.views.View;

import java.util.Scanner;

public class ConsoleView implements View {
    Scanner sc = new Scanner(System.in);

    @Override
    public String get() {
        return sc.next();
    }

    @Override
    public void set(String value) {
        System.out.println(value);
    }
}
