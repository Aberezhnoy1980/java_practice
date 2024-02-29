package ru.aberezhnoy.compnumcalc.UI;

import ru.aberezhnoy.compnumcalc.core.model.impl.SubModel;
import ru.aberezhnoy.compnumcalc.core.model.impl.SumModel;
import ru.aberezhnoy.compnumcalc.core.presenter.Presenter;
import ru.aberezhnoy.compnumcalc.core.view.View;
import ru.aberezhnoy.compnumcalc.util.Operations;

import java.util.Scanner;

import static ru.aberezhnoy.compnumcalc.util.Prompt.prompt;

public class App {

    public static void run() {
        System.out.println("\033[H\033[J");
        Presenter presenter = new Presenter(new View());
        Operations ops;
        boolean flag = true;

        try (Scanner sc = new Scanner(System.in)) {
            while (flag) {
                System.out.println("Available operations: ADD, SUB, MUL, DIV");
                String operation = prompt("Input operation: ").toUpperCase().trim();
                ops = Operations.valueOf(operation);
                System.out.println("\033[H\033[J");
                switch (ops) {
                    case ADD -> presenter.clickButton(presenter.getModels()[0]);
                    case SUB -> presenter.clickButton(presenter.getModels()[1]);
                    case MUL -> presenter.clickButton(presenter.getModels()[2]);
                    case DIV -> presenter.clickButton(presenter.getModels()[3]);
                    case EXIT -> flag = false;
                    default -> throw new RuntimeException("No such operation");
                }
            }
        }
    }
}
