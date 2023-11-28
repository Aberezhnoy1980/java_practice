package ru.aberezhnoy;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/* Реализовать консольное приложение, которое:
Принимает от пользователя строку вида text~num
Нужно рассплитить строку по ~ сохранить текст в связный список на позицию num
Если введено print~num, выводит строку из позиции num ии удаляет ее ииз списка
*
* */
public class Task002 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        List<String> strings = new LinkedList<>();

        boolean flag = true;
        while (flag) {
            System.out.println("Input an expression: ");
            String text;
            int idx;
            String line = sc.nextLine();
            if (line.contains("~")) {
                String[] exp = line.split("~");
                text = exp[0];
                idx = Integer.parseInt(exp[1]);
                if (text.equals("print")) System.out.println(strings.remove(idx));
                strings.add(idx, text);
            }

            if (line.equals("exit")) flag = false;
        }
    }
}
