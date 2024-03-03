package ru.berezhnoy.homework003.util;

import ru.berezhnoy.homework003.exception.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Application {

    public static void run() {
        String data = Prompt.prompt() + "\n";
        String path = new File("Exception/src/main/java/ru/berezhnoy/homework003/out").getAbsolutePath();
        try {
            if (Validator.validate(data)) {
                path += File.separator + data.split("\\s")[0];
                File file = new File(path);
                try (FileWriter writer = new FileWriter(file, true)) {
                    writer.write(data);
                }
            }
        } catch (IncorrectNameFormatException | IncorrectNumberOfArguments | IOException |
                 IncorrectDateFormatException | IncorrectPhoneNumberFormatException | IncorrectGenderFormatException e) {
            e.printStackTrace();
        }
    }
}
