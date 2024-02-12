package ru.aberezhnoy.notebook.util.mapper.impl;

import ru.aberezhnoy.notebook.model.User;

public class UserValidator {
    public User userValidate(User user) {
        // A N N A
        user.setFirstName(user
                .getFirstName()
                .replaceAll(" ", "")
                .trim());
        user.setLastName(user
                .getLastName()
                .replaceAll(" ", "")
                .trim());
        return user;
    }
}
