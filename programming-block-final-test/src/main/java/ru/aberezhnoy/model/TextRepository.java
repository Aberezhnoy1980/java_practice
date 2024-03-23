package ru.aberezhnoy.model;

import ru.aberezhnoy.handler.FileHandler;

import static ru.aberezhnoy.handler.ConsoleHandler.prompt;

public class TokenRepository {
    private final FileHandler fileHandler;

    public TokenRepository() {
        this.fileHandler = new FileHandler("../../application.properties");
        String inputText = prompt("Enter words separated by spaces");
        fileHandler.writefile(inputText);
    }

    public String getText() {
        return fileHandler.readFile();
    }
}
