package com.main.braincinema.repository.utils;

import com.main.braincinema.repository.connector.h2.DbConnector;

import java.sql.*;

public class H2DbUtils {
    private final static String CREATE_USER_TABLE = " CREATE TABLE USERS (" +
            "id BIGINT," +
            "firstName varchar(50)," +
            "lastName varchar(50)," +
            "dateOfBirth date," +
            "PRIMARY KEY (id)); ";


    public static boolean initDB() {
        try(Connection conn = DbConnector.getDbConnection();
            Statement statement = conn.createStatement()) {

            statement.execute(CREATE_USER_TABLE);

            ResultSet rs = statement.executeQuery("Select * from users;");

            ResultSetMetaData metaData = rs.getMetaData();

            System.out.println(metaData.getColumnCount());
            System.out.println(metaData.getColumnLabel(1));
            System.out.println(metaData.getColumnLabel(2));
            System.out.println(metaData.getColumnLabel(3));
            System.out.println(metaData.getColumnLabel(4));



        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return true;
    }
}
