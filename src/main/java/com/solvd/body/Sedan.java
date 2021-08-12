package com.solvd.body;

import java.util.ArrayList;
import java.util.List;

public class Sedan  {


    public Sedan() {
    }

    public void showSedanNames() {
        for (int i = 0; i < addValues().size(); i++) {
            System.out.println((i + 1) + addValues().get(i));
        }
    }

    public List<String> addValues() {
        List<String> SedanList = new ArrayList<>();
        SedanList.add("Mazda");
        SedanList.add("Honda");
        SedanList.add("BMW");
        SedanList.add("Citroen");
        SedanList.add("Opel");
        return SedanList;

    }
}

