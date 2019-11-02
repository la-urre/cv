package com.laurre.cv.person;

import com.laurre.cv.person.details.EmailAddress;
import com.laurre.cv.person.details.Nationality;
import com.laurre.cv.person.details.PhoneNumber;

public class PersonBuilder {
    public static PersonBuilder personWith() {
        return new PersonBuilder();
    }

    public PersonBuilder name(String name) {
        return this;
    }

    public PersonBuilder surname(String surname) {
        return this;
    }

    public PersonBuilder age(int age) {
        return this;
    }

    public PersonBuilder contact(EmailAddress emailAddress) {
        return this;
    }

    public PersonBuilder contact(PhoneNumber phoneNumber) {
        return this;
    }

    public PersonBuilder nationality(Nationality nationality) {
        return this;
    }

    public Person network(String network) {
        return new Person();
    }
}
