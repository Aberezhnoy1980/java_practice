package ru.berezhnoy.homework001;

public class Task001 {
    public static void main(String... args) {
        try {
            arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }

    public static void arrayOutOfBoundsException() {
        int[] ints = {1, 2, 3};
        for (int i = 0; i <= ints.length; i++) {
            ints[i] += 12;
        }
    }

    public static void divisionByZero() {
        System.out.println(12 / 0);
    }

    public static void numberFormatException() {
        String str = "124O";
        System.out.println(Integer.parseInt(str));
    }
}
