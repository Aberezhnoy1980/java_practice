package ru.aberezhnoy.calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    static Map<Character, Calculable> map = new HashMap<>();

    static {
        map.put('+', arr -> arr[0] + arr[1]);
        map.put('-', arr -> arr[0] - arr[1]);
        map.put('*', arr -> arr[0] * arr[1]);
        map.put('/', arr -> arr[0] / arr[1]);
        map.put('s', arr -> Math.sqrt(arr[0]));
    }

    public static void main(String... args) {
//        System.out.println(calculate(1, 2, '/'));
        System.out.println(calculateWithMap(9, 2, 's'));
    }

    public static double calculateWithMap(double a, double b, char op) {
        return map.get(op).calculate(a, b);
    }

    public static double calculate(double a, double b, char op) {
        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            default -> throw new UnsupportedOperationException("Not implemented");
        };
    }
}

interface Calculable {
    double calculate(double... args);
}
