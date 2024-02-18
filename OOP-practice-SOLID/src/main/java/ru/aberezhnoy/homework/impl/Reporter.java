package ru.aberezhnoy.homework.impl;

import ru.aberezhnoy.homework.Reportable;
import ru.aberezhnoy.homework.entity.User;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Reporter implements Reportable {
    @Override
    public void reportToFile(User user) {
        try (FileWriter writer = new FileWriter(String.format("OOP-practice-SOLID/src/main/java/ru/aberezhnoy/homework/files/report_%s.txt", LocalDateTime.now()))) {
            writer.write("Report for user: " + user.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void reportToDisplay(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}
