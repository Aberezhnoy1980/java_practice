package ru.aberezhnoy.handler;

import java.util.Scanner;

public class ConsoleHandler {
    private static final Scanner scanner = new Scanner(System.in);

    public static String prompt(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
    public static int intPrompt(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }
}
