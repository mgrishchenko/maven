package com.solvd;

import com.solvd.utils.Connector;
import org.apache.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Executor {
    private final static Logger LOGGER = Logger.getLogger((Executor.class));

    public static void main(String[] args) {

        String query = "Select * FROM carbody";
        Connector connector = new Connector();
        try {
            PreparedStatement pst = connector.connect().prepareStatement(query);

                ResultSet resultSet = pst.executeQuery();
                while (resultSet.next()) {
                    LOGGER.info(resultSet.getString("name"));
                }

        } catch (SQLException throwables){
                throwables.printStackTrace();



        Menu menu1 = new Menu();
        menu1.showMenu();


    }


}
}
















