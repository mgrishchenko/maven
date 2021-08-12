package com.solvd.body;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Carbody implements Menu {
    private Integer car_id;
    private Integer year;
    private String name;
    private String driver;


    public Carbody(Integer car_id, Integer year, String name, String driver) {
        this.car_id = this.car_id;
        this.year = this.year;
        this.name = this.name;
        this.driver = this.driver;
    }

    public Carbody() {

    }


    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getCar_id() {
        return car_id;
    }

    public void setCar_id(Integer car_id) {
        this.car_id = car_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    private Carbody extractCarbodyFromResultSet(ResultSet rs) throws SQLException {
        Carbody carbody = new Carbody(car_id, year, name, driver);

        carbody.setCar_id(rs.getInt("car_id"));
        carbody.setYear(rs.getInt("year"));
        carbody.setName(rs.getString("name"));
        carbody.setDriver(rs.getString("driver"));

        return carbody;


    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{ car_id: " + car_id
                + ", year: " + year
                + ", name: " + name
                + ", driver: " + driver
                + "}";
    }


    @Override
    public void loadOperations() {

    }

}

