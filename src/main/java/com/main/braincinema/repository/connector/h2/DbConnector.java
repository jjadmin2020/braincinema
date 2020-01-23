package com.main.braincinema.repository.connector.h2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnector {
    private static final String  DB_URL = "jdbc:h2:mem:brain_cinema_db";
    private static final String  USER = "admin";
    private static final String  PASSWORD = "admin";

    public static Connection getDbConnection() {
        Connection connection = null;
        Statement statement = null;

        try {
             connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
