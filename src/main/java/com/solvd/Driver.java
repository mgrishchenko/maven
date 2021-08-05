package com.solvd;


public class Driver {
    private int id;
    private String firstName;
    private String lastName;

    public Driver(long id, String firstName, String lastName) {
        this.id = (int) id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Driver() {

    }

    public void getDriver(int id) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
