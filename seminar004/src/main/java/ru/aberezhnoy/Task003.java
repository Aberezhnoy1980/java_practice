package ru.aberezhnoy;

import java.util.*;

/* Реализовать консольное приложение, которое:
Принимает от пользователя и запоминает строки
Если введено print, выводит строки так, чтобы последняя введенная была первой, а первая последней
Если введено revert, удаляет предыдущую введенную из памяти
*
* */
public class Task003 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
//        List<String> strings = new ArrayList<>();
        LinkedList<String> strings = new LinkedList<>();
        boolean flag = true;
//        while (flag) {
//            System.out.println("Please, input your expression: ");
//            String exp = sc.next();
//            if (exp.equals("print")) {
//                for (int i = strings.size() - 1; i >= 0 ; i--) {
//                    System.out.print(strings.get(i) + " ");
//                }
//                System.out.println();
//            }
//            if (exp.equals("revert")) strings.remove(strings.size() - 2);
//            strings.add(exp);
//            if (exp.equals("exit"))  {
//                flag = false;
//            }
//        }
        while (flag) {
            System.out.println("Please, input your expression: ");
            String exp = sc.next();
            if (exp.equals("print")) {
                ListIterator<String> iterator = strings.listIterator(strings.size());
                while (iterator.hasPrevious()) {
                    System.out.print(iterator.previous() + " ");
                }
                System.out.println();
            }
            if (exp.equals("revert")) strings.removeLast();
            strings.add(exp);
            if (exp.equals("exit")) {
                flag = false;
            }
        }
    }
}
