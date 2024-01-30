package ru.aberezhnoy.editor.interfaces;

import ru.aberezhnoy.editor.document.TextDocument;

public interface Saveable {
    void saveAs(TextDocument document, String path);
}
