package ru.berezhnoy.homework002;

public class MyArithmeticException extends ArithmeticException {
    public MyArithmeticException() {
        super("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
    }
}
