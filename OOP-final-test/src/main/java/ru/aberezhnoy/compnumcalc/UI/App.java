package ru.aberezhnoy.compnumcalc.UI;

import ru.aberezhnoy.compnumcalc.core.model.Model;
import ru.aberezhnoy.compnumcalc.core.model.impl.SumModel;
import ru.aberezhnoy.compnumcalc.core.presenter.Presenter;
import ru.aberezhnoy.compnumcalc.core.view.View;
import ru.aberezhnoy.compnumcalc.util.Operations;

import java.util.Scanner;

import static ru.aberezhnoy.compnumcalc.util.Prompt.prompt;

public class App {

    public static void run() {
        System.out.println("\033[H\033[J");
        Presenter presenter = new Presenter(new SumModel(), new View());
        Operations ops;
        boolean flag = true;

        try (Scanner sc = new Scanner(System.in)) {
            String operation = prompt("Введите команду: ").toUpperCase().trim();
            ops = Operations.valueOf(operation);
            while (flag) {
                System.out.println("\033[H\033[J");
                switch (ops) {
                    case ADD -> presenter.buttonClick();
                    case EXIT -> flag = false;
                    default -> System.out.println("No such command");
                }
            }
        }
    }
}
