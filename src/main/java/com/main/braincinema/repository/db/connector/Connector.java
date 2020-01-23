package com.main.braincinema.repository.db.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by OFedorenko on 01/23/20 braincinema.
 */
public class Connector {
    private static String URL = "jdbc:h2:mem:";
    private static String dbName = "braincinema";
    private static String dbUsername = "sa";
    private static String dbPassword = "";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL + dbName, dbUsername, dbPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }

}
