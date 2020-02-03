package com.main.braincinema.repository.impl;

import com.main.braincinema.entity.Ticket;
import com.main.braincinema.repository.TicketRepository;
import com.main.braincinema.repository.db.Connector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySqlTicketRepositoryImpl implements TicketRepository {
    private Ticket ticket;

    private static final String ADD_TICKET = "insert into ticket (filmName, sessionDate, sessionTime, hall, " +
            "rowInHall, placeInRow, cost) values  (?, ?, ?, ?, ?, ?, ?);";
    private static final String SHOW_ALL_TICKET = "select * from ticket";
    private static final String DELETE_TICKET_BY_ID = "delete from ticket where id = ?;";
    private static final String FIND_TICKET_BY_ID = "select * from ticket where id = ?;";

    @Override
    public void findTicket(long id) {
        try(Connection conn = Connector.getConnection();
            PreparedStatement ps = conn.prepareStatement(FIND_TICKET_BY_ID)) {
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            int columns = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= columns; i++){
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.getMessage();
        }
    }

    @Override
    public void showAllTicket() {
        try(Connection conn = Connector.getConnection();
            PreparedStatement ps = conn.prepareStatement(SHOW_ALL_TICKET)) {
            ResultSet rs = ps.executeQuery();
            int columns = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= columns; i++){
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.getMessage();
        }
    }

    @Override
    public void removeTicket(long id) {
        try(Connection conn = Connector.getConnection();
            PreparedStatement ps = conn.prepareStatement(DELETE_TICKET_BY_ID)) {
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.getMessage();
        }
    }

    @Override
    public void addTicket(Ticket ticket) {
        try(Connection conn = Connector.getConnection();
            PreparedStatement ps = conn.prepareStatement(ADD_TICKET)) {
            ps.setString(1, ticket.getFilmName());
            ps.setString(2, ticket.getDate());
            ps.setString(3, ticket.getTime());
            ps.setString(4, ticket.getHall());
            ps.setInt(5, ticket.getRow());
            ps.setInt(6, ticket.getPlace());
            ps.setBigDecimal(7, ticket.getCost());

            ps.executeUpdate();
            System.out.println("Ticket successfully added");
        } catch(SQLException ex) {
            ex.getMessage();
        }
    }

    @Override
    public Ticket updateTicket(Ticket ticket) {

        return null;
    }
}
