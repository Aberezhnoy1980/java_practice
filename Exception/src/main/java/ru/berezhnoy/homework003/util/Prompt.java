package ru.berezhnoy.homework003.util;

import java.util.Scanner;

public class Prompt {
    private static Scanner sc = new Scanner(System.in);

    private Prompt() {
        sc = new Scanner(System.in);
    }

    public static String prompt() {
        System.out.println("Please, enter your surname, " +
                "firstname, " +
                "lastname, " +
                "date of birth (use dd.mm.yyyy format), " +
                "phone number, " +
                "male separated by a space: ");
        return sc.nextLine();
    }
}
