package ru.berezhnoy.seminar003;

import java.io.IOException;

public class Task001 {
    public static void main(String[] args) {
        /*
        Создайте метод doSomething(), который может быть источником одного из
типов checked exceptions (тело самогометода прописывать не обязательно).
Вызовите этот метод из main и обработайте в нем исключение, которое
вызвал метод doSomething().
         */
        try {

            doSomething();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void doSomething() throws IOException {
        System.out.println("Process...");
    }
}
