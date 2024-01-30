package ru.aberezhnoy.editor.format;

import ru.aberezhnoy.editor.document.TextDocument;

import java.io.FileWriter;
import java.io.IOException;

public class Doc extends TextFormat {

    @Override
    public void saveAs(TextDocument document, String path) {
        try (FileWriter writer = new FileWriter(path + ".doc", false)) {
            writer.write("<?Doc Format>\n");
            writer.write(document.getData());
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
