package ru.aberezhnoy.phonebook.core.models;

import java.time.LocalDate;
import java.util.Objects;

public class Contact implements Comparable<Contact> {
    private LocalDate date;
    private String firstName;
    private String lastName;
    private String company;
    private String phone;
    private String email;
    private String description;

    public Contact() {
    }

    public LocalDate getDate() {
        return date;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int compareTo(Contact contact) {
        return contact.getDate().compareTo(this.getDate());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact contact)) return false;
        return Objects.equals(firstName, contact.firstName)
                && Objects.equals(lastName, contact.lastName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final Contact contact;

        public Builder() {
            this.contact = new Contact();
        }

        public Builder setDate(LocalDate date) {
            this.contact.date = date;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.contact.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.contact.lastName = lastName;
            return this;
        }

        public Builder setCompany(String company) {
            this.contact.company = company;
            return this;
        }

        public Builder setPhone(String phone) {
            this.contact.phone = phone;
            return this;
        }

        public Builder setEmail(String email) {
            this.contact.email = email;
            return this;
        }

        public Builder setDescription(String description) {
            this.contact.description = description;
            return this;
        }

        public Contact build() {
            return this.contact;
        }
    }
}
