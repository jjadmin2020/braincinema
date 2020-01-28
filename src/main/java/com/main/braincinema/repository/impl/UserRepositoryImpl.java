package com.main.braincinema.repository.impl;

import com.main.braincinema.entity.User;
import com.main.braincinema.repository.UserRepository;
import com.main.braincinema.repository.db.Connector;

import java.sql.*;

/**
 * Created by OFedorenko on 01/28/20 braincinema.
 */
public class UserRepositoryImpl implements UserRepository {
    private static final String REGISTRATION_QUERY = "INSERT INTO USERS" +
            "  (firstName, lastName, dateOfBirth, email, login, password) VALUES " +
            " (?, ?, ?, ?, ?, ?);";


    @Override
    public User checkIfUserExists(String userName, String password) {
        try(Connection conn = Connector.getConnection()) {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM USERS WHERE login=" + userName + "and password=" + password);

            if(resultSet == null) {

            }

            User user = new User();
            while (resultSet.next()) {
                user.setFirstName(resultSet.getString("firstName"));
                user.setLastName(resultSet.getString("lastName"));
                user.setEmail(resultSet.getString("email"));
                user.setPassword(resultSet.getString("password"));
                user.setLogin(resultSet.getString("login"));
                user.setDateOfBirth(resultSet.getDate("dateOfBirth"));
            }

        } catch(SQLException e) {

        }
        return null;
    }

    @Override
    public boolean register(User user) {
        try(Connection conn = Connector.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(REGISTRATION_QUERY);) {

            preparedStatement.setString(1, user.getFirstName());
            preparedStatement.setString(2, user.getLastName());
            preparedStatement.setDate(3, new Date(user.getDateOfBirth().getTime()));
            preparedStatement.setString(4, user.getEmail());
            preparedStatement.setString(5, user.getLogin());
            preparedStatement.setString(6, user.getPassword());

            return preparedStatement.execute();

        } catch(SQLException e) {
            return false;
        }
    }
}
