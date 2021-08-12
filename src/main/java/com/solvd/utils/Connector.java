package com.solvd.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    private final String url = "dbc:postgresql://localhost/mgrishchenko";
    private final String user = "mgrishchenko";
    private final String password = "Grisha1234-";

    private Connection connection;
    public Connector() {
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost/mgrishchenko", "mgrishchenko",
                    "Grisha1234-");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

        public Connection getConnection() {
            return connection;
        }

    }

