package ru.aberezhnoy.editor;

import ru.aberezhnoy.editor.application.Notepad;
import ru.aberezhnoy.editor.format.Doc;
import ru.aberezhnoy.editor.format.Md;
import ru.aberezhnoy.editor.format.Txt;

public class MainApp {
    public static void main(String[] args) {
        final Notepad notes = new Notepad();
        notes.newFile();
        notes.currentDocument().addAllText("text1");
        notes.currentDocument().addAllText("text2");
        notes.currentDocument().addAllText("text3");
        notes.saveAs("OOPWebinars/src/main/java/ru/aberezhnoy/editor/out/file1", new Txt());
        notes.saveAs("OOPWebinars/src/main/java/ru/aberezhnoy/editor/out/file2", new Md());
        notes.saveAs("OOPWebinars/src/main/java/ru/aberezhnoy/editor/out/file3", new Doc());
    }
}
