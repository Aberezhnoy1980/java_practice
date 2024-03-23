package ru.aberezhnoy;

import java.util.Scanner;

public class ConsoleHandler {
    private static final Scanner scanner = new Scanner(System.in);

    public static String prompt(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}
