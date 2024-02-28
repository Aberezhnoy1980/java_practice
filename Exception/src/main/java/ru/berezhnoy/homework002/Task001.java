package ru.berezhnoy.homework002;

import java.io.LineNumberReader;

public class Task001 {
    public static void main(String[] args) {
        String input;

// При отправке кода на Выполнение, вы можете варьировать эти параметры
        if (args.length == 0) {
            input = "4"; // По умолчанию используем "3.14", если аргумент не передан
        }
        else {
            input = args[0];
        }

        System.out.println(isFloat(input));
    }

    public static float isFloat(String input) {
        float result = Float.NaN;
        try {
            result = Float.parseFloat(input);
        } catch (NumberFormatException e) {
            System.out.println("Your input is not a float number. Please, try again.");
        }
        return result;
    }
}
