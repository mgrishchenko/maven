package com.solvd.body;

import java.util.ArrayList;
import java.util.List;

public class Cabriolet extends Carbody {

    private int speed;
    private String name;
    private String city;


    public void showCabrioletNames () {
        for (int i = 0; i < addCabrioletValues().size(); i++) {
            System.out.println((i + 2) + addCabrioletValues().get(i));
        }
    }
    public List <String> addCabrioletValues() {
        List<String> SedanList = new ArrayList<String>();
        SedanList.add("Lexus");
        SedanList.add("Audi");
        SedanList.add("Mini");
        SedanList.add("Peugeot");
        SedanList.add("Porshe");
        return SedanList;
    }


    public Cabriolet(int speed, String name, String city) {
        this.name = name;
        this.speed = speed;
        this.city = city;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;

    }

    public Cabriolet() {

    }
    public Cabriolet(String name, String driver, int year){
        super(name, driver, year);

    }

    @Override
    public void removeCarBody() {

    }
}


