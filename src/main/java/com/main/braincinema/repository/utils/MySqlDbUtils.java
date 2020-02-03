package com.main.braincinema.repository.utils;

import com.main.braincinema.repository.db.Connector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlDbUtils {
    private final static String CREATE_TICKET_TABLE = "CREATE TABLE `braincinema`.`ticket` (\n" +
            "  `id` INT NOT NULL AUTO_INCREMENT," +
            "  `filmName` VARCHAR(45) NOT NULL," +
            "  `date` VARCHAR(45) NOT NULL," +
            "  `time` VARCHAR(45) NOT NULL," +
            "  `hall` VARCHAR(20) NOT NULL," +
            "  `row` INT NOT NULL," +
            "  `place` INT NOT NULL," +
            "  PRIMARY KEY (`id`)," +
            "  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);";

    public static boolean initDB() {
        try (Connection conn = Connector.getConnection();
             Statement statement = conn.createStatement())  {

            statement.execute(CREATE_TICKET_TABLE);
            ResultSet rs = statement.executeQuery("SELECT * FROM TIKET;");
        } catch (SQLException e) {
            e.getMessage();
        }
        return true;
    }
}
