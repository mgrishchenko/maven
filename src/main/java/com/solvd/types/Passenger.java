package com.solvd.types;

public class Passenger {
    public int year;

    public Passenger(String s) {

    }

    public void transportation(){
        System.out.println("People transportation");
    }

    private String name;
    private int age;
    private String type;

    public Passenger(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public Passenger(int year) {
        this.year = year;

    }

    public String getName() {
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age = age;
    }
    public String getType(){
        return type;
    }
    public void setType(){
        this.type = type;


    }

}


