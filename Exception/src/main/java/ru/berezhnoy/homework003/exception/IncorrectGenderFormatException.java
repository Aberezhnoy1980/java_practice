package ru.berezhnoy.homework003.exception;

public class IncorrectGenderFormatException extends Throwable {
    public IncorrectGenderFormatException() {
        super("Gender format error: bad symbol");
    }
}
