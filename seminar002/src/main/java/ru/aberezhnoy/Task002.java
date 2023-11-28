package ru.aberezhnoy;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task002 {
    static Logger logger = Logger.getAnonymousLogger();
    static FileHandler fh;

    static {
        try {
            fh = new FileHandler("seminar002/log.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        logger.addHandler(fh);
        String str = RepeatStr("Hello", 10);
        WriteToFile(str);

    }

    static String RepeatStr(String str, int n) {
//      Напишите метод, который составит строку, состоящую из 100 повторений слова
//      TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
        final StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            stringBuilder.append(str).append("\n");
        }
        return stringBuilder.toString();
    }

    static void WriteToFile(String str) {
        String path = "g/g/g/g/g/seminar002/text.txt";
        try (FileWriter fw = new FileWriter(path)) {
            fw.write(str);
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
            logger.log(Level.INFO, e.getMessage());
        }
    }
}
