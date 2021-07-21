package com.solvd.types;

public class SuperCar implements Sport {

    String name = "Lamborghini";

    public SuperCar(String name,String driver, int year) {
    }


    @Override
    public void printInfo() {
        System.out.println("This is Super Car!");
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

