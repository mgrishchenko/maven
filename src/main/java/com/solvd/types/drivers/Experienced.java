package com.solvd.types.drivers;

import com.solvd.body.Sedan;

public class Experienced extends DriversList {

    public Experienced(String name, String lastname, int years) {
        super();
        setName(name);
        setLastname(lastname);
        setYears(years);

    }
    @Override
    public String toString() {
        return ("Driver information:"+"\n"
                +"Driver name: " + getName()+"\n"
                +"Driver lastname: "+ getLastname()+"\n"
                +"Driver age: "+ getYears()+"\n");
    }
    @Override
    public void ride() {

    }

    public void setSedan(Sedan sedan) {
    }
}
