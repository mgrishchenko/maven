package com.solvd.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost/mgrishchenko", "mgrishchenko",
                    "Grisha1234-");
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}

