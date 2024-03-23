package ru.aberezhnoy.view;

import ru.aberezhnoy.exception.UnexpectedChoiceExeption;
import ru.aberezhnoy.presenter.Presenter;

import static ru.aberezhnoy.handler.ConsoleHandler.intPrompt;;

public class View {
    private final Presenter presenter;

    public View() {
        this.presenter = new Presenter();
    }

    boolean flag = true;

    public void run() {
        while (flag) {
            int choice = intPrompt("""
                    Please select what you want to do:
                    1. Get word list
                    2. Count the number of words
                    3. Find the longest word
                    4. Calculate word frequency
                    5. Leave the application
                    Enter a number from the list above
                       """);
            switch (choice) {
                case 1:
                    presenter.getTokens();
                    break;
                case 2:
                    System.out.printf("The file contain %d words, including repeats%n", presenter.getWordCount());
                    break;
                case 3:
                    System.out.printf("The longest word is %s%n", presenter.findTheLongestWord());
                    break;
                case 4:
                    presenter.getWordFrequency();
                    break;
                case 5:
                    System.out.println("Bye");
                    flag = false;
                    break;
                default:
                    throw new UnexpectedChoiceExeption(choice);
            }
        }
    }
}
