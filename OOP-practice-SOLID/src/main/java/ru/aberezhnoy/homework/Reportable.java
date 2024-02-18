package ru.aberezhnoy.homework;

import ru.aberezhnoy.homework.entity.User;

public interface Reportable {
    void reportToFile(User user);

    void reportToDisplay(User user);
}
