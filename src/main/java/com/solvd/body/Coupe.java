package com.solvd.body;

import java.util.ArrayList;
import java.util.List;

public class Coupe extends Carbody {

    private int speed;
    private String brand;


    public void showCoupeNames () {
        for (int i = 0; i < addCoupeValues().size(); i++) {
            System.out.println((i + 1) + addCoupeValues().get(i));
        }
    }
    public List <String> addCoupeValues() {
        List<String> SedanList = new ArrayList<String>();
        SedanList.add("Nissan");
        SedanList.add("Rools-Royce");
        SedanList.add("Toyota");
        SedanList.add("Acura");
        SedanList.add("Maserati");
        return SedanList;
    }

    public Coupe(int speed, String brand) {
        this.speed = speed;
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;

    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(){
        this.brand = brand;
    }

    public Coupe(){

        }

    @Override
    public void ride() {
        System.out.println("Three doors car");

    }

    @Override
    public void removeCarBody() {

    }
}

