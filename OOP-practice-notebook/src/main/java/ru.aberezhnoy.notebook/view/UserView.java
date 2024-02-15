package ru.aberezhnoy.notebook.view;

import ru.aberezhnoy.notebook.controller.UserController;
import ru.aberezhnoy.notebook.model.User;
import ru.aberezhnoy.notebook.model.repository.impl.UserRepository;
import ru.aberezhnoy.notebook.util.Commands;

import static ru.aberezhnoy.notebook.util.Prompt.prompt;

public class UserView {
    private final UserController userController;

    public UserView() {
        this.userController = new UserController(new UserRepository());
    }

    public void run() {
        Commands com;

        while (true) {
            String command = prompt("Введите команду: ").toUpperCase().trim();
            com = Commands.valueOf(command);
//            if (com == Commands.EXIT) return;
            switch (com) {
                case CREATE:
                    userController.saveUser(userController.createUser());
                    break;
                case READ:
                    String id = prompt("Идентификатор пользователя: ");
                    try {
                        User user = userController.readUser(Long.parseLong(id));
                        System.out.println(user);
                        System.out.println();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case LIST:
                    System.out.println(userController.readAll());
                    break;
                case UPDATE:
                    String userId = prompt("Enter user id: ");
                    userController.updateUser(userId, userController.createUser());
                    break;
                case DELETE:
                    String deleteId = prompt("Enter user id: ");
                    userController.delete(Long.valueOf(deleteId));
                case EXIT:
                    String leaveReq = prompt("Are you sure you want to leave the application? ");
                    if (leaveReq.equalsIgnoreCase("yes")) {
                        String saveReq = prompt("Do you want to save changes? ");
                        if (saveReq.equalsIgnoreCase("yes")) {
                            userController.saveAll();
                            return;
                        }
                        if (saveReq.equalsIgnoreCase("no")) return;
                        else System.out.println("Please, type \"yes\" or \"no\"");
                    }
                    if (leaveReq.equalsIgnoreCase("no")) run();
                    else System.out.println("Please, type \"yes\" or \"no\"");
                    break;
            }
        }
    }
}
