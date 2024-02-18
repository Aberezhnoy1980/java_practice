package ru.aberezhnoy.homework.impl;

import ru.aberezhnoy.homework.Saveable;
import ru.aberezhnoy.homework.entity.User;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Persister implements Saveable {
    @Override
    public void saveInDB(User user) {
        System.out.println("Save user in DB: " + user.getName());
    }

    @Override
    public void saveInMemory(User user) {
        System.out.println("Save user in memory: " + user.getName());
    }

    @Override
    public void saveInFile(User user) {
        try (FileWriter writer = new FileWriter(String.format("OOP-practice-SOLID/src/main/java/ru/aberezhnoy/homework/files/savedFile_%s.txt", LocalDateTime.now()))) {
            writer.write("Save user: " + user.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
