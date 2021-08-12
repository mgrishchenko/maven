package com.solvd;

import com.solvd.body.Carbody;
import com.solvd.utils.Connector;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBOperations {

    public void  loadOperations() {

    Connector connector = new Connector();
        String query1 = "select * from carbody ";

        try {
            Statement statement = connector.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query1);
            while (resultSet.next()) {
                Carbody carbody = new Carbody();
                carbody.setCar_id(resultSet.getInt("car_id"));
                carbody.setYear(resultSet.getInt(2));
                carbody.setName(resultSet.getString(3));
                carbody.setDriver(resultSet.getString(4));

                System.out.println(carbody);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }


    }
    public void addValues() {
        Connector connector = new Connector();
        String query = ("INSERT INTO drivers (driver_id, name, surname, experience) VALUES ('1','Bob', 'Johnson', '15');");
        try {
            Statement statement = connector.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);

        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void updateValues() throws SQLException {
        Connector connector = new Connector();
        Statement statement = connector.getConnection().createStatement();
        try{
            int res = statement.executeUpdate("UPDATE carbody SET name ='jeep' WHERE car_id=2;");
            System.out.println(res);
        }
catch (SQLException e) {
            e.printStackTrace();
}
    }
    }


