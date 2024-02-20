package ru.berezhnoy;

public class Task003 {
    public static void main(String[] args) {
        Integer[] arr = {1, null, 3, 67, null};
        checkArray(arr);
        System.out.println("----------------------");
        checkArray(null);
    }

    public static void checkArray(Integer[] ints) {
        if (ints == null) {
            System.out.println("Array is Empty");
        } else {
            for (int i = 0; i < ints.length; i++) {
                if (ints[i] == null) {
                    System.out.println("Найдено значение null на позиции " + i);
                }
            }
        }
    }
}
