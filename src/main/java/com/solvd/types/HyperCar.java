package com.solvd.types;

public abstract class HyperCar implements Sport {

    String name = "MacLaren";

    public HyperCar(String name, String driver, int year){
    }

    @Override
    public void printInfo() {
        System.out.println("This is Hyper Car");
    }

    @Override
    public String getName() {
        return this.name;

    }

    @Override
    public boolean getSpeed() {
        return false;
    }
}