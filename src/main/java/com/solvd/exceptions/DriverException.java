package com.solvd.exceptions;

public class DriverException extends Exception {
    public int age;

    public int getAge() {
        return age;
    }

    public DriverException(String message) {
        super(message);
        age = age;
    }

    public static void getDriverException(int age) throws DriverException {
        if (age < 18) {
            throw new DriverException("You must be at least 18 years old");
        }
        else {
            System.out.println("You are good to go!");
        }


}}