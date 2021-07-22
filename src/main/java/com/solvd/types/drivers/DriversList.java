package com.solvd.types.drivers;

import java.util.ArrayList;
import java.util.List;

public class DriversList implements Information {

    private String name;
    private String lastname;
    private int years;
    private List<String> experiencedList;

    public DriversList() {

    }

    public void AddValues() {
        experiencedList = new ArrayList<String>();
        experiencedList.add("Maria");
        experiencedList.add("John");
        experiencedList.add("Alan");
        experiencedList.add("Scott");
        experiencedList.add("Vasya");

    }

    public DriversList(String name, String lastname, int years) {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getYears() {
        return this.years;
    }

    public void setExperienced(String experienced){
        experiencedList.add(experienced);
    }
    public List<String> getExperiencedList(){
        return experiencedList;
    }

    @Override
    public void ride() {

    }

    @Override
    public void removeCarBody() {

    }
}


