package ru.aberezhnoy.mylist;

import ru.aberezhnoy.drugstore.components.Component;
import ru.aberezhnoy.drugstore.components.Penicillin;
import ru.aberezhnoy.drugstore.components.Salt;
import ru.aberezhnoy.drugstore.components.Water;
import ru.aberezhnoy.mylist.impl.MyLinkedListImpl;

public class Main {
    public static void main(String[] args) {
        MyLinkedListImpl<Component> components = new MyLinkedListImpl<>();
        components
                .addFirst(new Penicillin("Penicillin", 10, 100))
                .addFirst(new Water("Water", 20, 200))
                .addFirst(new Salt("Salt", 5, 50))
                .addLast(new Water("LastWater", 200, 2000))
                .addLast(new Water("LastSalt", 1, 30))
                .addFirst(new Water("FirstWater", 5, 89));

//        System.out.println(components + "\n");
//
//        System.out.println(components.get(0));
//        System.out.println(components.get(1));
//        System.out.println(components.get(2));
//        System.out.println(components.get(3));

        for (Component c : components) {
            System.out.println(c);
        }

        System.out.println(components.getSize());
    }
}
