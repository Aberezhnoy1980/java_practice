package ru.aberezhnoy.editor.format;

import ru.aberezhnoy.editor.document.TextDocument;
import ru.aberezhnoy.editor.interfaces.Saveable;

import java.io.FileWriter;
import java.io.IOException;

public class Txt extends TextFormat {
    @Override
    public void saveAs(TextDocument document, String path) {
        try (FileWriter writer = new FileWriter(path + ".txt", false)) {
            writer.write("Txt Format\n");
            writer.write(document.getData());
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
