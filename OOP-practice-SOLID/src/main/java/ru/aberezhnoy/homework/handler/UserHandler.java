package ru.aberezhnoy.homework.handler;

import ru.aberezhnoy.homework.Reportable;
import ru.aberezhnoy.homework.Saveable;
import ru.aberezhnoy.homework.entity.User;
import ru.aberezhnoy.homework.impl.Persister;
import ru.aberezhnoy.homework.impl.Reporter;

import java.util.ArrayList;
import java.util.List;

public class UserHandler {
    private final Reportable reporter;
    private final Saveable persister;
    private final List<User> users;

    public UserHandler() {
        this.reporter = new Reporter();
        this.persister = new Persister();
        this.users = new ArrayList<>();
    }

    public Reportable getReporter() {
        return reporter;
    }

    public Saveable getPersister() {
        return persister;
    }

    public List<User> getUsers() {
        return users;
    }

    public UserHandler addUserToList(User user) {
        users.add(user);
        return this;
    }
}
