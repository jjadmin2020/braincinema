package com.main.braincinema.repository.impl;

import com.main.braincinema.entity.Auditorium;
import com.main.braincinema.repository.AuditoriumRepository;
import com.main.braincinema.repository.Connector.h2.DbConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class H2AuditoriumRepositoryImpl implements AuditoriumRepository {

    private static final String INSERT_AUDITORIUM = "INSERT INTO AUDITORIUM" +
            "  (id, name, ranks, placesInRank, freeSeats, occupiedSeats) VALUES " +
            " (?, ?, ?, ?, ?);";

    private static final String SELECT_AUDITORIUM = "SELECT * from AUDITORIUM where id = ?" +
            "  (id, name, ranks, placesInRank, freeSeats, occupiedSeats) VALUES " +
            " (?, ?, ?, ?, ?, ?);";

    private static final String DELETE_AUDITORIUM = "DELETE FROM AUDITORIUM WHERE ID=?";

    private static final String UPDATE_AUDITORIUM = "UPDATE AUDITORIUM SET NAME=?, RANKS=?, PLACESINRANKS=?," +
            " FREESEATS=?, OCCUPIEDSEATS=? WHERE ID=?";

    @Override
    public void createAuditorium(Auditorium auditorium) {

        try(Connection conn = DbConnector.getConnection();
            PreparedStatement ps = conn.prepareStatement(INSERT_AUDITORIUM)) {
            ps.setLong(1, 1L);
            ps.setString(2, auditorium.getName());
            ps.setInt(3, auditorium.getRanks());
            ps.setInt(4, auditorium.getPlacesInRank());
            ps.setInt(5, auditorium.getFreeSeats());
            ps.setInt(6, auditorium.getOccupiedSeats());

            ps.executeUpdate();

        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Auditorium deleteAuditorium (Auditorium auditorium) {
        try (Connection conn = DbConnector.getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement(DELETE_AUDITORIUM)){
            preparedStatement.setLong(1, auditorium.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Auditorium updateAuditorium(Auditorium auditorium) {
        try (Connection conn = DbConnector.getConnection();
             PreparedStatement preparedStatement = conn.prepareStatement(UPDATE_AUDITORIUM)){
            preparedStatement.setLong(1, auditorium.getId());
            preparedStatement.setString(2, auditorium.getName());
            preparedStatement.setInt(3, auditorium.getRanks());
            preparedStatement.setInt(4, auditorium.getPlacesInRank());
            preparedStatement.setInt(5, auditorium.getFreeSeats());
            preparedStatement.setInt(6, auditorium.getOccupiedSeats());
            preparedStatement.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Auditorium getAuditoriumById(long id) {
        Auditorium auditorium = new Auditorium();

        try(Connection conn = DbConnector.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(SELECT_AUDITORIUM)) {

            preparedStatement.setLong(1, id);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                auditorium.setId(rs.getLong("id"));

            }

        } catch(SQLException e) {
            e.printStackTrace();
        }

        return auditorium;
    }
}
