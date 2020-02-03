package com.main.braincinema.repository.impl;

import com.main.braincinema.entity.User;
import com.main.braincinema.repository.UserRepository;
import com.main.braincinema.repository.db.connector.Connector;

import java.sql.*;

/**
 * Created by OFedorenko on 01/23/20 braincinema.
 */
public class H2UserRepositoryImpl implements UserRepository {
    private static final String INSERT_USERS_SQL = "INSERT INTO USERS" +
            "  (id, firstName, lastName, dateOfBirth) VALUES " +
            " (?, ?, ?, ?, ?);";

    private static final String SELECT_USER = "SELECT * from USERS where id = ?" +
            "  (id, firstName, lastName, dateOfBirth) VALUES " +
            " (?, ?, ?, ?, ?);";

    @Override
    public User createUser(User user) {

        try(Connection conn = Connector.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(INSERT_USERS_SQL);) {
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, user.getFirstName());
            preparedStatement.setString(3, user.getLastName());
            preparedStatement.setDate(4, new Date(user.getDateOfBirth().getTime()));

            System.out.println(preparedStatement);

        } catch(SQLException e) {

        }

        return user;
    }

    @Override
    public User deleteUser(long userId) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public User findUserById(long userId) {
        User user = new User();

        try(Connection conn = Connector.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(INSERT_USERS_SQL);) {

            preparedStatement.setLong(1, userId);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                user.setFirstName(rs.getString("firstName"));
                user.setLastName(rs.getString("lastName"));
                user.setDateOfBirth(rs.getDate("dateOfBirth"));
            }

        } catch(SQLException e) {

        }

        return user;
    }
}
