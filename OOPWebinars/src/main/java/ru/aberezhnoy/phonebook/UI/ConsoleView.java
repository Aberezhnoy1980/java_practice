package ru.aberezhnoy.phonebook.UI;

import ru.aberezhnoy.phonebook.core.mvp.View;

import java.util.Scanner;

public class ConsoleView implements View {

    private final Scanner sc;

    public ConsoleView() {
        sc = new Scanner(System.in);
    }

    @Override
    public String getFirstName() {
        System.out.print("First name: ");
        return sc.nextLine();
    }

    @Override
    public void setFirstName(String value) {
        System.out.printf("First name: %s\n", value);
    }

    @Override
    public String getLastName() {
        System.out.print("Last name: ");
        return sc.nextLine();
    }

    @Override
    public void setLastName(String value) {
        System.out.printf("Last name: %s\n", value);
    }

    @Override
    public String getDescription() {
        System.out.print("Description: ");
        return sc.nextLine();
    }

    @Override
    public void setDescription(String value) {
        System.out.printf("Description: %s\n", value);
    }
}
