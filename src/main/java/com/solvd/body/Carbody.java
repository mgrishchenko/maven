package com.solvd.body;

import com.solvd.types.drivers.Information;

public abstract class Carbody implements Information {
    private String name;
    private String driver;
    private int year;

    public Carbody() {
    }

    public Carbody (String name, String driver, int year) {
        this.name = name;
        this.driver = driver;
        this.year = year;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setDriver(String driver){
        this.driver = driver;
    }
    public String getDriver(){
        return this.driver;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return this.year;
    }

    public void printInfo(){
        System.out.println(getName());
        System.out.println(getDriver());
        System.out.println(getYear());
    }

    @Override
    public void ride(){
        System.out.println();

    }

    public abstract void removeCarBody();
}

