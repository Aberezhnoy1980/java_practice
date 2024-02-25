package ru.aberezhnoy.phonebook.core.mvp;

import ru.aberezhnoy.phonebook.core.models.Contact;

public class Presenter {
    private final Model model;
    private final View view;

    public Presenter(View view, String pathDb) {
        this.view = view;
        model = new Model(pathDb);
    }

    public void loadFromFile() {
        model.load();

        if (model.getCurrentBook().count() > 0) {
            model.setCurrentIndex(0);
            Contact contact = model.getCurrentContact();

            view.setFirstName(contact.getFirstName());
            view.setLastName(contact.getLastName());
            view.setDescription(contact.getDescription());
        }
    }

    public void add() {
        model.getCurrentBook().add(
                Contact.builder()
                        .setFirstName(view.getFirstName())
                        .setLastName(view.getLastName())
                        .setDescription(view.getDescription())
                        .build());
    }

    public void remove() {
        Contact contact = Contact.builder()
                .setFirstName(view.getFirstName())
                .setLastName(view.getLastName())
                .setDescription(view.getDescription())
                .build();
        model.getCurrentBook().remove(contact);

        if (model.getCurrentBook().count() < 1) {
            model.setCurrentIndex(-1);

            view.setFirstName("");
            view.setLastName("");
            view.setDescription("");
        } else {
            model.setCurrentIndex(model.getCurrentIndex() - 1);
            if (model.getCurrentIndex() < 0)
                model.setCurrentIndex(0);

            Contact temp = model.getCurrentContact();
            view.setFirstName(temp.getFirstName());
            view.setLastName(temp.getLastName());
            view.setDescription(temp.getDescription());
        }
    }

    public void saveToFile() {
        model.save();
    }

    public void next() {
        if (model.getCurrentBook().count() > 0) {
            if (model.getCurrentIndex() + 1 < model.getCurrentBook().count()) {
                model.setCurrentIndex(model.getCurrentIndex() + 1);
                Contact contact = model.getCurrentContact();
                view.setFirstName(contact.getFirstName());
                view.setLastName(contact.getLastName());
                view.setDescription(contact.getDescription());
            }
        }
    }

    public void prev() {
        if (model.getCurrentBook().count() > 0) {
            if (model.getCurrentIndex() - 1 > -1) {
                model.setCurrentIndex(model.getCurrentIndex() - 1);
                Contact contact = model.getCurrentContact();
                view.setFirstName(contact.getFirstName());
                view.setLastName(contact.getLastName());
                view.setDescription(contact.getDescription());
            }
        }
    }
}
