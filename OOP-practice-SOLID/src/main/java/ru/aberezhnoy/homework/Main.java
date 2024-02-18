package ru.aberezhnoy.homework;

import ru.aberezhnoy.homework.entity.User;
import ru.aberezhnoy.homework.handler.UserHandler;

public class Main {
    public static void main(String[] args) {
        final UserHandler userHandler = new UserHandler();

        userHandler
                .addUserToList(new User("Bob"))
                .addUserToList(new User("John"))
                .addUserToList(new User("Bill"))
                .addUserToList(new User("Jack"))
                .addUserToList(new User("Steve"));

        for (User u : userHandler.getUsers()) {
            userHandler.getPersister().saveInMemory(u);
            userHandler.getPersister().saveInDB(u);
            userHandler.getPersister().saveInFile(u);
            System.out.println();
            userHandler.getReporter().reportToDisplay(u);
            userHandler.getReporter().reportToFile(u);
        }

    }
}