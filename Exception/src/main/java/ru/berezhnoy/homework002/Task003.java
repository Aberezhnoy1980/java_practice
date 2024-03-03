package ru.berezhnoy.homework002;

public class Task003 {
    public static void main(String[] args) {
        int a;
        int b;

        if (args.length == 0) {
            a = 90;
            b = 0; // Default values if no arguments are provided
        } else {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        }

        double result = Expr.expr(a, b);
        System.out.println(result);
    }

    public static class Expr {
        public static double expr(int a, int b) {
                printSum(a, b);
            return b == 0 ? 0 : (double) a / b;
        }

        public static void printSum(int a, int b) {
            System.out.println(a + b);
        }
    }
}
