package ru.aberezhnoy.homework;

import ru.aberezhnoy.homework.entity.User;

public interface Saveable {
    void saveInDB(User user);
    void saveInFile(User user);
    void saveInMemory(User user);
}
