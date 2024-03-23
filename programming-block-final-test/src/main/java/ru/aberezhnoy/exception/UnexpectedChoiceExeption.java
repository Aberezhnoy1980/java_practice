package ru.aberezhnoy.exception;

public class UnexpectedChoiceExeption extends RuntimeException {
    public UnexpectedChoiceExeption(int choice) {
        super(String.format("Your choice %d doesn't match any presented", choice));
    }
}
