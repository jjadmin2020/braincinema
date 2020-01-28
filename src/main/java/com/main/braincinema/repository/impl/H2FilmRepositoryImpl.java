package com.main.braincinema.repository.impl;

import com.main.braincinema.entity.Film;
import com.main.braincinema.repository.FilmRepository;
import com.main.braincinema.repository.db.connector.Connector;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class H2FilmRepositoryImpl implements FilmRepository {
    private static final String INSERT_FILMS_SQL = "INSERT INTO FILMS" +
            "  (id, title, genre,country, year) VALUES " +
            " (?, ?, ?, ?, ?,?);";


    @Override
    public Film addFilm(Film film) {
        try(Connection conn = Connector.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(INSERT_FILMS_SQL);) {
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, film.getTitle());
            preparedStatement.setString(3, film.getGenre());
            preparedStatement.setString(4, film.getCountry());
            preparedStatement.setInt(5, film.getYear());

            System.out.println(preparedStatement);

        } catch(SQLException e) {

        }

        return film;
    }

    @Override
    public Film findFilmById(int filmId) {
        return null;
    }

    @Override
    public Film updateFilm(Film film) {
        return null;
    }
}
