package com.solvd.body;

import java.util.ArrayList;
import java.util.List;

public class Sedan extends Carbody {

    public Sedan(String name, String driver, int year) {
        super(name, driver, year);
    }
    public void showSedanNames () {
        for (int i = 0; i < addValues().size(); i++) {
            System.out.println((i + 1) + addValues().get(i));
        }
    }
           public List <String> addValues() {
               List<String> SedanList = new ArrayList<>();
               SedanList.add("Mazda");
               SedanList.add("Honda");
               SedanList.add("BMW");
               SedanList.add("Citroen");
               SedanList.add("Opel");
               return SedanList;

            }
    public Sedan(){
    }


    @Override
    public void ride() {
        System.out.println("Speed riding");


    }

    @Override
    public void removeCarBody() {

    }
}

