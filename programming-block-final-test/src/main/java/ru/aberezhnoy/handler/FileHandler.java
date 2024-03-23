package ru.aberezhnoy;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandler {
    private final Path filePath;


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
    }

    public void writefile(String text) {
        try (Writer writer = Files.newBufferedWriter(filePath, StandardCharsets.UTF_8)) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String readFile() {
        String text = "";
        try (Reader reader = Files.newBufferedReader(filePath)) {
            text = reader.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}
