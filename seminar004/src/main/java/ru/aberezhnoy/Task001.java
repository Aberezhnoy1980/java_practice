package ru.aberezhnoy;

import java.util.ArrayList;
import java.util.LinkedList;

/*
Замерьте время за которое в ArrayList добавятся 10 000 элементов.
Замерьте время за которое в LinkedList добавятся 10 000 элементов
*/
public class Task001 {
    public static void main(String[] args) {
        timer();
    }

    static void timer() {
        final ArrayList<Integer> integerArrayList = new ArrayList<>();
        final LinkedList<Integer> integerLinkedList = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            integerArrayList.add(0, i);
        }
        long middle = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            integerLinkedList.add(0, i);
        }
        long finish = System.currentTimeMillis();

        System.out.println("ArrayList time for adding 1_000_000 elements " + (middle - start));
        System.out.println("LinkedList time for adding 1_000_000 elements " + (finish - middle));
        System.out.println("Difference b/w ArrayList and LinkedList time for adding 1_000_000 elements " + ((middle - start )- (finish - middle)));
    }
}
