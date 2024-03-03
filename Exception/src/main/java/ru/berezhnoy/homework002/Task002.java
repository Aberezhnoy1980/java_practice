package ru.berezhnoy.homework002;

import java.util.Arrays;

import static java.lang.Double.NaN;

public class Task002 {
    public static void main(String[] args) {
        int[] intArray;
        int d;

        if (args.length == 0) {
            intArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            d = 10; // По умолчанию используем 0, если аргумент не передан
        } else {
            intArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
            d = Integer.parseInt(args[1]); // Можно использовать значение по умолчанию или передать его как аргумент.
        }

        double result = Expr.expr(intArray, d);
        System.out.println(result);
    }

    public static class Expr {
        public static double expr(int[] intArray, int d) {
            double result = NaN;
            if (intArray.length < 9) {
                System.out.println("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
            } else if (d == 0) {
                System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
            } else {
                result = (double) intArray[8] / d;
                System.out.printf("intArray[8] / d = %d / %d = %s%n", intArray[8], d, result);
            }
            return result;
        }
    }

}
