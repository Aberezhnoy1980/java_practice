package ru.aberezhnoy.phonebook.UI;

import ru.aberezhnoy.phonebook.core.mvp.View;
import ru.aberezhnoy.phonebook.Config;
import ru.aberezhnoy.phonebook.core.mvp.Presenter;

import java.util.Scanner;

public class App {
    public static void buttonClick() {
        System.out.println("\033[H\033[J"); // ru.stackoverflow.com/questions/1315049/Как-очистить-консоль-в-java-во-время-действия-программы
        View view = new NewConsoleView();
        Presenter presenter = new Presenter(view, Config.pathDb);
        presenter.loadFromFile();

        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("1 - prev 2 - next 3 - add 4 - save 5 - remove");
                String key = sc.next();
                System.out.println("\033[H\033[J");
                switch (key) {
                    case "1" -> presenter.prev();
                    case "2" -> presenter.next();
                    case "3" -> presenter.add();
                    case "4" -> presenter.saveToFile();
                    case "5" -> presenter.remove();
                    default -> System.out.println("No such command");
                }
            }
        }
    }
}
