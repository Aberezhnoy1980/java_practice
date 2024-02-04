package ru.aberezhnoy.lesson009.ex04;

import ru.aberezhnoy.lesson009.ex04.exbeverage.*;

public class Main {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("Water"));
        latte.addComponent(new Milk("Milk"));
        latte.addComponent(new Beans("Beans"));

        for (var ingredient : latte) {
            System.out.println(ingredient);
        }
    }
}
