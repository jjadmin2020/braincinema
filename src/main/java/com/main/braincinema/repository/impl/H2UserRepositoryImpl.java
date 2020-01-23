package com.main.braincinema.repository.impl;

import com.main.braincinema.entity.User;
import com.main.braincinema.repository.UserRepository;
import com.main.braincinema.repository.connector.h2.DbConnector;

import java.sql.*;

public class H2UserRepositoryImpl implements UserRepository {

    private static final String SELECT_USER_BY_ID = "SELECT * FROM USERS WHERE userId = ?";
    private static final String INSERT_USER = "INSERT INTO USERS (id, firstName, lastName, dateOfBirth) VALUES (?, ?, ?, ?);";

    @Override
    public User findUser(long id) {
        User user = new User();
        try(Connection conn = DbConnector.getDbConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(SELECT_USER_BY_ID)) {

            preparedStatement.setLong(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                user.setId(resultSet.getLong("userId"));

            }


        } catch (SQLException e) {

        }


        return null;
    }

    @Override
    public User removeUser(User user) {
        return null;
    }

    @Override
    public void addUser(User user) {
        try(Connection conn = DbConnector.getDbConnection();
            PreparedStatement ps = conn.prepareStatement(INSERT_USER)) {

            ps.setLong(1, 1L);
            ps.setString(2, user.getFirstName());
            ps.setString(3, user.getLastName());
            ps.setDate(4, new Date(user.getDateOfBirth().getTime()));

            ps.executeUpdate();

        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public User updateUser(User user) {
        return null;
    }
}
