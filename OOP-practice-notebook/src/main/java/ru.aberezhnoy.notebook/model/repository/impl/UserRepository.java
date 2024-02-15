package ru.aberezhnoy.notebook.model.repository.impl;

import ru.aberezhnoy.notebook.model.User;
import ru.aberezhnoy.notebook.model.repository.GBRepository;
import ru.aberezhnoy.notebook.util.DBConnector;
import ru.aberezhnoy.notebook.util.mapper.impl.UserMapper;
import ru.aberezhnoy.notebook.util.mapper.impl.UserValidator;

import java.io.*;
import java.util.*;

import static ru.aberezhnoy.notebook.util.Prompt.prompt;

public class UserRepository implements GBRepository {
    private final UserMapper mapper;
    private final List<User> users;

    public UserRepository() {
        this.mapper = new UserMapper();
        this.users = new ArrayList<>();
//        this.users = findAll() == null ? new ArrayList<>() : findAll();
    }

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public List<String> readAll() {
        List<String> lines = new ArrayList<>();
        try {
            File file = new File(DBConnector.DB_PATH);
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            if (line != null) {
                lines.add(line);
            }
            while (line != null) {
                // считываем остальные строки в цикле
                line = reader.readLine();
                if (line != null) {
                    lines.add(line);
                }
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    @Override
    public List<User> findAll() {
        List<String> lines = readAll();
        for (String line : lines) {
            users.add(mapper.toOutput(line));
        }
        return users;
    }

    @Override
    public User createUser() {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        return new User(firstName, lastName, phone);
    }

    @Override
    public User create(User user) {
        user = new UserValidator().userValidate(user);
//        List<User> users = findAll();
        long max = 0L;
        for (User u : users) {
            long id = u.getId();
            if (max < id) {
                max = id;
            }
        }
        long next = max + 1;
        user.setId(next);
        users.add(user);
//        write(users);
        return user;
    }

    @Override
    public void saveAll(List<String> data) {
        try (FileWriter writer = new FileWriter(DBConnector.DB_PATH, false)) {
            for (String line : data) {
                // запись всей строки
                writer.write(line);
                // запись по символам
                writer.append('\n');
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void saveAll() {
        try (FileWriter writer = new FileWriter(DBConnector.DB_PATH, false)) {
            for (User u : users) {
                // запись всей строки
                writer.write(mapper.toInput(u));
                // запись по символам
                writer.append('\n');
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public Optional<User> findById(Long id) {
        User findUser = users.stream()
                .filter(u -> u.getId()
                        .equals(id))
                .findFirst().orElseThrow(() -> new RuntimeException("User not found"));
        return Optional.of(findUser);
    }

    @Override
    public Optional<User> update(Long userId, User update) {
//        List<User> users = findAll();
//        User editUser = users.stream()
//                .filter(u -> u.getId()
//                        .equals(userId))
//                .findFirst().orElseThrow(() -> new RuntimeException("User not found"));
        if (findById(userId).isPresent()) {
            User editUser = findById(userId).get();

            if (!update.getFirstName().isEmpty()) {
                editUser.setFirstName(update.getFirstName());
            }
            if (!update.getLastName().isEmpty()) {
                editUser.setLastName(update.getLastName());
            }
            if (!update.getPhone().isEmpty()) {
                editUser.setPhone(update.getPhone());
            }
        }
//        write(users);
        return Optional.of(update);
    }

    @Override
    public boolean delete(Long id) {
        if (findById(id).isPresent()) {
//            users.remove(id);
            users.remove(findById(id).get());
//            write(users);
            return true;
        }
        return false;
    }

    private void write(List<User> users) {
        List<String> lines = new ArrayList<>();
        for (User u : users) {
            lines.add(mapper.toInput(u));
        }
        saveAll(lines);
    }
}
