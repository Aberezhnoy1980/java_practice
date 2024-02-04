package ru.aberezhnoy.lesson009.ex03;

import ru.aberezhnoy.lesson009.ex03.exbeverage.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String... args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(12);
        nums.add(123);
        nums.add(1234);
        nums.add(12345);

        Iterator<Integer> iter = nums.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        Worker worker = new Worker("Name", "Surname", 23, 4567);

        Iterator<String> components = worker;

        while (components.hasNext()) {
            System.out.println(components.next());
        }

        Coffee latte = new Coffee();
        latte.addComponent(new Water("Water"));
        latte.addComponent(new Milk("Milk"));
        latte.addComponent(new Beans("Beans"));

        Iterator<Ingredient> iterator = latte;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
