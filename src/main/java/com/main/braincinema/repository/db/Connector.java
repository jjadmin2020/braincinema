package com.main.braincinema.repository.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    private static String URL = "jdbc:mysql://localhost:3306/";
    private static String dbName = "braincinema";
    private static String dbUsername = "root";
    private static String dbPassword = "1111";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL + dbName, dbUsername, dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
