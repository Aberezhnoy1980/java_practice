package ru.aberezhnoy.notebook;

import ru.aberezhnoy.notebook.controller.UserController;
import ru.aberezhnoy.notebook.model.dao.impl.FileOperation;
import ru.aberezhnoy.notebook.model.repository.GBRepository;
import ru.aberezhnoy.notebook.model.repository.impl.UserRepository;
import ru.aberezhnoy.notebook.view.UserView;

import static ru.aberezhnoy.notebook.util.DBConnector.DB_PATH;
import static ru.aberezhnoy.notebook.util.DBConnector.createDB;

public class Main {
    public static void main(String[] args) {
        createDB();
        FileOperation fileOperation = new FileOperation(DB_PATH);
        GBRepository repository = new UserRepository(fileOperation);
        UserController controller = new UserController(repository);
        UserView view = new UserView(controller);
        view.run();

    }
}
