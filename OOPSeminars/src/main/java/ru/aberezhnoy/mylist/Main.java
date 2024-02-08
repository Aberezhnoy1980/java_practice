package ru.aberezhnoy.mylist;

import ru.aberezhnoy.mylist.impl.MyArrayList;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> integers = new MyArrayList<>();
        integers.addElement(5);
        integers.addElement(3);
        integers.addElement(1);

        System.out.println(integers);
        System.out.println(integers.getSize());
        System.out.println(integers.getElement(1));
//        integers.sort();
        System.out.println(integers);
        integers.removeElement(1);
        System.out.println(integers);
    }
}
