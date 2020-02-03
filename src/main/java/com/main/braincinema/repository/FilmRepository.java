package com.main.braincinema.repository;

import com.main.braincinema.entity.Film;

public interface FilmRepository {
    Film addFilm(Film film);
    Film findFilmById(int filmId);
    Film updateFilm(Film film);
}
