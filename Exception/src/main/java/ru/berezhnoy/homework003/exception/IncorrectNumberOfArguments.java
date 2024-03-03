package ru.berezhnoy.homework003.exception;

public class IncorrectNumberOfArguments extends Throwable {
    public IncorrectNumberOfArguments(int argsCount) {
        super(argsCount > 6 ? "You entered more arguments" : "You input more args");
    }
}
