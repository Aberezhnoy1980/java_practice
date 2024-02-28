package ru.berezhnoy.seminar002;

import java.io.*;

public class Task004 {
    public static void main(String[] args) {

        try (InputStream inputStream = new FileInputStream("assfgh");) {
            String[] strings = {"asdf", "asdf"};
            String string1 = strings[1];
            test();
            int a = 1 / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | IOException throwable) {
            throwable.printStackTrace();
        } finally {
            System.out.println("I completed it anyway");
        }
        System.out.println("I am alive!");
    }

    public static void test() throws IOException {
        final File file = new File("1.txt");
//        file.createNewFile();
        try (FileReader fileReader = new FileReader(file)) {
            fileReader.read();
        }
//        test();
    }
}
