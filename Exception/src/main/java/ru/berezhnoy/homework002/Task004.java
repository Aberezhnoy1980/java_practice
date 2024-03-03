package ru.berezhnoy.homework002;

public class Task004 {
    public static void main(String[] args) {
        char a;

        if (args.length == 0) {
            a = ' '; // Значение по умолчанию, если аргументы не были предоставлены
        } else {
            a = args[0].charAt(0); // Преобразуйте первый аргумент командной строки в символ
        }

        try {
            String result = Expr.expr(a);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static class Expr {
        public static String expr(char a) {
            if (a == ' ')
                throw new IllegalArgumentException("Empty string has been input.");

            return String.format("Your input was - %s", a);
        }
    }

}
