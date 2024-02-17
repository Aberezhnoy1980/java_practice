package ru.aberezhnoy.notebook.controller;

import ru.aberezhnoy.notebook.model.User;
import ru.aberezhnoy.notebook.model.repository.GBRepository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

    public void saveAll() {
        repository.saveAll();
    }

    public User readUser(Long userId) {
        return repository.findById(userId).orElseThrow(() -> new RuntimeException("User with id  " + userId + " not found"));
    }

    public void updateUser(String userId, User update) {
        update.setId(Long.parseLong(userId));
        repository.update(Long.parseLong(userId), update);
    }

    public boolean delete(Long id) {
        return repository.delete(id);
    }

    public List<User> showAll() {
        return repository.getUsers();
    }
}
