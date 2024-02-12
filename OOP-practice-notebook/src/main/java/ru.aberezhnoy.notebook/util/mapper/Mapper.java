package ru.aberezhnoy.notebook.util.mapper;

import ru.aberezhnoy.notebook.model.User;

public interface Mapper {
    String toInput(User e);
    User toOutput(String str);
}
