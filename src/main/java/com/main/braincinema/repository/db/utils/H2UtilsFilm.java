package com.main.braincinema.repository.db.utils;

import com.main.braincinema.repository.db.connector.Connector;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class    H2UtilsFilm {
    private static final String createFilmTableSQL = "create table FILMS (\r\n" + "  id  BIGINT NOT NULL AUTO_INCREMENT,\r\n" +
            "  title varchar(20),\r\n" + "  genre varchar(20),\r\n" + "  country varchar(20),\r\n"+"  year BIGINT NOT NULL,\r\n" + " PRIMARY KEY (FilmID));";

    public static boolean initializeDb() {
        try(Connection connection = Connector.getConnection();
            Statement statement = connection.createStatement()) {

            statement.execute(createFilmTableSQL);

        } catch (SQLException e) {

        }
        return true;
    }
}
