package com.solvd.types.drivers;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Drivers {
    private Integer driver_id;
    private String name;
    private String surname;
    private Integer experience;


    public Drivers (Integer driver_id, String name, String surname, Integer experience) {
        this.driver_id = this.driver_id;
        this.name = this.name;
        this.surname = this.surname;
        this.experience = this.experience;
    }

    public Drivers() {

    }
    public Integer getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(Integer driver_id) {
        this.driver_id = driver_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) { this.surname = surname;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

private Drivers extractDriversFromResultSet(ResultSet rs) throws SQLException {
    Drivers drivers = new Drivers(driver_id, name, surname, experience);

    drivers.setDriver_id(rs.getInt("driver_id"));
    drivers.setName(rs.getString("name"));
    drivers.setSurname(rs.getString("surname"));
    drivers.setExperience(rs.getInt("experience"));

    return drivers;
}
    @Override
    public String toString() {
        return getClass().getSimpleName() + "{ driver_id: " + driver_id
                + ", name: " + name
                + ", surname: " + surname
                + ", experience: " + experience
                +"}";
    }
}
