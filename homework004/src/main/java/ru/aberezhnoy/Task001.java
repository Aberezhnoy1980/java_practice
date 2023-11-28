package ru.aberezhnoy;

import java.util.LinkedList;
import java.util.ListIterator;

public class Task001 {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();

        if (args.length == 0 || args.length != 4) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            ll.add(1);
            ll.add("One");
            ll.add(2);
            ll.add("Two");
        } else {
            ll.add(Integer.parseInt(args[0]));
            ll.add(args[1]);
            ll.add(Integer.parseInt(args[2]));
            ll.add(args[3]);
        }

        LLTasks answer = new LLTasks();
        System.out.println(ll);
        LinkedList<Object> reversedList = answer.revert(ll);
        System.out.println(reversedList);
    }

    static class LLTasks {
        public static LinkedList<Object> revert(LinkedList<Object> ll) {
            // Напишите свое решение ниже
            final LinkedList<Object> reversedList = new LinkedList<>();
            ListIterator<Object> iterator = ll.listIterator(ll.size());
            while (iterator.hasPrevious()) {
                reversedList.add(iterator.previous());
            }
            return reversedList;
        }
    }
}
