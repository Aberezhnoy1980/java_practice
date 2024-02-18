package ru.aberezhnoy.notebook.model.repository;

import ru.aberezhnoy.notebook.model.User;

import java.util.List;
import java.util.Optional;

public interface GBRepository {
    List<User> findAll();

    User createUser();
    User create(User user);
    Optional<User> findById(Long id);

    List<String> readAll();

    List<User> getUsers();

    void saveAll();
    Optional<User> update(Long userId, User update);
    boolean delete(Long id);
}
