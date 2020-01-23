package com.main.braincinema.entity;
import lombok.Data;
@Data
public class Film {
    private int FilmId;
    private String Title;
    private String Genre;
    private String Country;
    private int Year;
    public Film(){}
    public Film(int filmId){
        this.FilmId=filmId;
    }
}
