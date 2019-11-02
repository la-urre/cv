package com.laurre.cv.person.details;

public class EmailAddress {
    public static EmailAddress email(String address) {
        return new EmailAddress(address);
    }

    private EmailAddress(String address) {
        this.address = address;
    }

    private final String address;
}
