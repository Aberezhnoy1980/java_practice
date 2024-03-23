package ru.aberezhnoy;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class AppConfig {
    private final String path;
    private final String name;

    public AppConfig(String filename) {
        final Properties properties = new Properties();

        try {
            properties.load(getClass().getResourceAsStream(filename));
        } catch (IOException e) {
            throw new RuntimeException();
        }
        this.path = properties.getProperty("path").replaceAll("/", File.separator) + File.separator;
        this.name = properties.getProperty("name");
    }

    public String getPath() {
        return path;
    }
    public String getName() {
        return name;
    }
}
