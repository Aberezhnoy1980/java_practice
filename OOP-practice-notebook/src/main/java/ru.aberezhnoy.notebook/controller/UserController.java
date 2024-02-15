package ru.aberezhnoy.notebook.controller;

import ru.aberezhnoy.notebook.model.User;
import ru.aberezhnoy.notebook.model.repository.GBRepository;

import java.util.List;
import java.util.Objects;

public class UserController {
    private final GBRepository repository;

    public UserController(GBRepository repository) {
        this.repository = repository;
    }

    public User createUser() {
        return repository.createUser();
    }

    public void saveUser(User user) {
        repository.create(user);
    }

    public void saveAll(List<String> data) {
        repository.saveAll(data);
    }

    public void saveAll() {
        repository.saveAll();
    }

    public User readUser(Long userId) throws Exception {
        List<User> users = repository.findAll();
        for (User user : users) {
            if (Objects.equals(user.getId(), userId)) {
                return user;
            }
        }

        throw new RuntimeException("User not found");
    }

    public void updateUser(String userId, User update) {
        update.setId(Long.parseLong(userId));
        repository.update(Long.parseLong(userId), update);
    }

    public boolean delete(Long id) {
        return repository.delete(id);
    }

    public List<User> readAll() {
        return repository.findAll();
    }

    public List<User> showAll() {
        return repository.getUsers();
    }
}
