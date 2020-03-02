package com.main.braincinema.repository.utils;

import com.main.braincinema.repository.Connector.h2.DbConnector;

import java.sql.*;

public class H2DbUtils {
    private static final String CREATE_AUDITORIUM_TABLE =   "CREATE TABLE AUDITORIUM (\r\n" +
                                                            "  id  BIGINT NOT NULL AUTO_INCREMENT,\r\n" +
                                                            " name varchar(20),\r\n" +
                                                            " ranks int,\r\n" +
                                                            " placesInRank int,\r\n" +
                                                            " freeSeats int,\r\n" +
                                                            " occupiedSeats int,\r\n" +
                                                            " PRIMARY KEY (id));";

    public static boolean initializeDb() {
        try(Connection connection = DbConnector.getConnection();
            Statement statement = connection.createStatement()) {

            statement.execute(CREATE_AUDITORIUM_TABLE);

            ResultSet rs = statement.executeQuery("Select * from auditorium;");

            ResultSetMetaData metaData = rs.getMetaData();

            System.out.println(metaData.getColumnCount());
            System.out.println(metaData.getColumnLabel(1));
            System.out.println(metaData.getColumnLabel(2));
            System.out.println(metaData.getColumnLabel(3));
            System.out.println(metaData.getColumnLabel(4));
            System.out.println(metaData.getColumnLabel(5));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }
}
