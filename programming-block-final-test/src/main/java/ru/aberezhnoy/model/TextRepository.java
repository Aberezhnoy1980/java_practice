package ru.aberezhnoy.model;

import ru.aberezhnoy.handler.FileHandler;

import static ru.aberezhnoy.handler.ConsoleHandler.prompt;

public class TextRepository {
    private final FileHandler fileHandler;

    public TextRepository() {
        this.fileHandler = new FileHandler("../../../application.properties");
        String inputText = prompt("List the words you want to work with. If you want to use default word list, just press Enter");
        fileHandler.writefile(inputText);
    }

    public String getText() {
        return fileHandler.readFile();
    }
}
