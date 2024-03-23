package ru.aberezhnoy.handler;

import ru.aberezhnoy.config.AppConfig;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandler {
    private final Path filePath;
    private final String defaultText;

    public FileHandler(String filename) {
        AppConfig config = new AppConfig(filename);
        this.filePath = Path.of(config.getPath() + config.getName());
        if (!Files.exists(filePath)) {
            try {
                Files.createFile(filePath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        this.defaultText = config.getDefaultText();
    }

    public void writefile(String text) {
        try (Writer writer = Files.newBufferedWriter(filePath, StandardCharsets.UTF_8)) {
            if (text.equalsIgnoreCase("")) {
                writer.write(defaultText);
            } else {
                writer.write(text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readFile() {
        String text = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()))) {
            text = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}
