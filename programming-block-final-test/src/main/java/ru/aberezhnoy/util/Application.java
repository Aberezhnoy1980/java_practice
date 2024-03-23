package ru.aberezhnoy;

import static ru.aberezhnoy.ConsoleHandler.prompt;

public class Application {
    private static final FileHandler fileHandler = new FileHandler("../../application.properties");

    public static void run() {
        String text = prompt("Enter words separated by spaces");
        fileHandler.writefile(text);
    }
}
