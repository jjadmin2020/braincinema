package com.main.braincinema.entity;
import lombok.Data;
@Data
public class Film {
    private int filmId;
    private String title;
    private String genre;
    private String country;
    private int year;
    public Film(){}
    public Film(int FilmId){
        this.filmId=FilmId;
    }
}
