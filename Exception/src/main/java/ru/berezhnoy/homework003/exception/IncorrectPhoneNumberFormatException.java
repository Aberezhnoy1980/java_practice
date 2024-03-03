package ru.berezhnoy.homework003.exception;

public class IncorrectPhoneNumberFormatException extends Throwable {
    public IncorrectPhoneNumberFormatException(String exp) {
        super("Error in phone number format: " + (exp.length() != 11 ? "incorrect digit counts" : "unacceptable symbols"));
    }
}
