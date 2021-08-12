package com.solvd.body;

import java.util.ArrayList;
import java.util.List;

public class Minivan extends Carbody {
    private String Information;

    public Minivan(Integer car_id, Integer year, String name, String driver) {
        super(car_id, year, name, driver);
    }

    public Minivan() {
        super();
    }


    public void showMinivanNames () {
        for (int i = 0; i < addMiniValues().size(); i++) {
            System.out.println((i + 1) + addMiniValues().get(i));
        }
    }
    public List <String> addMiniValues() {
        List<String> SedanList = new ArrayList<String>();
        SedanList.add("Volkswagen");
        SedanList.add("Mercedes");
        SedanList.add("Renault");
        SedanList.add("Fiat");
        SedanList.add("Geely");
        return SedanList;

    }



    }

