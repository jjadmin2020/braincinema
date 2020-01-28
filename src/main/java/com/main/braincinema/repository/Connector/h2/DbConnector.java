package com.main.braincinema.repository.Connector.h2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnector {

    private static final String DB_URL = "jdbc:h2:mem:brain_cinema_db;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE";
    private static final String DB_USERNAME = "admin";
    private static final String DB_PASSWORD = "admin";

    public static Connection getConnection() {
        Connection connection = null;
        Statement statement = null;
        try{
            connection = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
        } catch(SQLException e){
            e.printStackTrace();
        }
        return connection;
    }
}
