package ru.berezhnoy.homework003.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class User {
    private String firstname;
    private String lastname;
    private String surname;
    private LocalDate birthdate;
    private long phoneNumber;
    private Gender gender;

    public User() {
    }

//    private User(String firstname, String lastname, String surname, String birthdate, int phoneNumber, String gender) {
//        this.firstname = firstname;
//        this.lastname = lastname;
//        this.surname = surname;
//        this.birthdate = LocalDate.parse(birthdate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//        this.phoneNumber = phoneNumber;
//        this.gender = Gender.valueOf(gender.toUpperCase());
//    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return String.format("User full name: %s %s %s%nDate of birth: %s%nPhone number: %d%nMale: %s%n", surname, firstname, lastname, birthdate, phoneNumber, gender
        );
    }

    public static class Builder {
        User user;

        public Builder() {
            this.user = new User();
        }

        public Builder setFirstname(String firstname) {
            this.user.firstname = firstname;
            return this;
        }

        public Builder setLastname(String lastname) {
            this.user.lastname = lastname;
            return this;
        }

        public Builder setSurname(String surname) {
            this.user.surname = surname;
            return this;
        }

        public Builder setBirthdate(String birthdate) {
            this.user.birthdate = LocalDate.parse(birthdate, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            return this;
        }

        public Builder setPhoneNumber(long phoneNumber) {
            this.user.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setGender(String gender) {
            this.user.gender = Gender.valueOf(gender.toUpperCase());
            return this;
        }

        public User build() {
            return this.user;
        }
    }

    enum Gender {
        F, M
    }
}
