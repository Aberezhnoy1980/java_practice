package ru.aberezhnoy.phonebook.core.mvp;

import ru.aberezhnoy.phonebook.core.infrastructure.Phonebook;
import ru.aberezhnoy.phonebook.core.models.Contact;

import java.io.*;

public class Model {
    private final Phonebook currentBook;
    private int currentIndex;
    private final String path;

    public Model(String path) {
        currentBook = new Phonebook();
        currentIndex = 0;
        this.path = path;
    }

    public Phonebook getCurrentBook() {
        return currentBook;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(int value) {
        this.currentIndex = value;
    }

    public Contact getCurrentContact() {
        if (currentIndex >= 0) {
            return currentBook.getContact(currentIndex);
        } else {
            return null;
        }
    }

    public void load() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(path)));
            String fname = reader.readLine();
            while (fname != null) {
                String lname = reader.readLine();
                String description = reader.readLine();
                this.currentBook.add(Contact.builder()
                        .setFirstName(fname)
                        .setLastName(lname)
                        .setDescription(description)
                        .build());
                fname = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void save() {
        try (FileWriter writer = new FileWriter(path, false)) {
            for (int i = 0; i < currentBook.count(); i++) {
                Contact contact = currentBook.getContact(i);
                writer.append(String.format("%s\n", contact.getFirstName()));
                writer.append(String.format("%s\n", contact.getLastName()));
                writer.append(String.format("%s\n", contact.getDescription()));
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}
