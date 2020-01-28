package com.main.braincinema.repository.db.utils;

import com.main.braincinema.repository.db.connector.Connector;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

;

/**
 * Created by OFedorenko on 01/23/20 braincinema.
 */

public class H2Utils {
    private static final String createUserTableSQL = "create table USERS (\r\n"
            + "  id  BIGINT NOT NULL AUTO_INCREMENT,\r\n"
            + "  firstName varchar(20),\r\n"
            + "  lastName varchar(20),\r\n"
            + "  dateOfBirth date,\r\n"
            + "  PRIMARY KEY (UserID));";

    public static boolean initializeDb() {
        try(Connection connection = Connector.getConnection();
            Statement statement = connection.createStatement()) {

            statement.execute(createUserTableSQL);

        } catch (SQLException e) {

        }
        return true;
    }

//    public String generateCreateUserTableSqlQuery() {
//        Class<User> user = User.class;
//        Field[] userFields = user.getFields();
//
//        String createUserSqlQuery = "create table USERS (";
//
//        for(Field userField : userFields) {
//            createUserSqlQuery = createUserSqlQuery + userField.getName();
//        }
//    }
}
