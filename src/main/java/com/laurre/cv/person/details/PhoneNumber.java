package com.laurre.cv.person.details;

public class PhoneNumber {
    public PhoneNumber(String number) {

    }

    public static PhoneNumber mobile(String number) {
        return new PhoneNumber(number);
    }
}
