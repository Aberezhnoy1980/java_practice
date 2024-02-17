package ru.aberezhnoy.notebook.util;

import ru.aberezhnoy.notebook.view.UserView;

import java.util.ArrayList;
import java.util.List;

import static ru.aberezhnoy.notebook.util.DBConnector.createDB;

public class ApplicationRunner {

    private ApplicationRunner() {
        createDB();
        UserView view = new UserView();
        view.run();
    }

    public static void run() {
        new ApplicationRunner();
    }
}
