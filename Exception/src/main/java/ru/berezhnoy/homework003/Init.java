package ru.berezhnoy.homework003;

import ru.berezhnoy.homework003.exception.*;
import ru.berezhnoy.homework003.util.Prompt;
import ru.berezhnoy.homework003.util.Validator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Init {

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
