package ru.berezhnoy.homework003.exception;

public class IncorrectNameFormatException extends Throwable {
    public IncorrectNameFormatException() {
        super("you entered an incorrect expression for your full name");
    }
}
