package com.solvd;

import com.solvd.utils.Connector;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.sql.SQLException;

public class Executor {
    private final static Logger LOGGER = Logger.getLogger((Executor.class));

    public static void main(String[] args) throws SQLException {

        PropertyConfigurator.configure("src/main/resources/log4j.properties");
        LOGGER.info("Success!");
        Connector connector = new Connector();
        DBOperations dbOperations = new DBOperations();
        dbOperations.loadOperations();
        dbOperations.addValues();
        dbOperations.updateValues();


                Menu menu = new Menu();
                menu.showMenu();
            }

        }














