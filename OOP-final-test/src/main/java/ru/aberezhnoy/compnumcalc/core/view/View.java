package ru.aberezhnoy.compnumcalc.core.view;

import ru.aberezhnoy.compnumcalc.core.model.ComplexNumber;

import java.util.Scanner;

public class View {
    private final Scanner sc;

    public View() {
        this.sc = new Scanner(System.in);
    }

    public ComplexNumber getValue(String title) {
        System.out.printf("%s", title);
        return new ComplexNumber(sc.nextLine());
    }

    public void print(String title) {
        System.out.printf("%s\n", title);
    }
}
