package ru.aberezhnoy.phonebook.core.infrastructure;

import ru.aberezhnoy.phonebook.core.models.Contact;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private List<Contact> contacts;

    public Phonebook() {
        this.contacts = new ArrayList<>();
    }

    public boolean add(Contact contact) {
        boolean flag = false;
        if (!contacts.contains(contact)) {
            contacts.add(contact);
            flag = true;
        }
        return flag;
    }

    public Contact getContact(int index) {
        return contains(index) ? contacts.get(index) : null;
    }

    public boolean update() {
        boolean flag = false;

        return flag;
    }

    public boolean remove(Contact contact) {
        boolean flag = false;
        if (contacts.indexOf(contact) != -1) {
            contacts.remove(contact);
            flag = true;
        }
        return flag;
    }

    private boolean contains(int index) {
        return contacts != null && contacts.size() > index;
    }

    public List<Contact> getContact() {
        if (contacts == null || contacts.isEmpty()) throw new RuntimeException("PhoneBook is empty");
        return contacts;
    }

    public int count() {
        return contacts.size();
    }
}
