package com.main.braincinema.controller;

import com.main.braincinema.entity.Film;

import java.io.FileInputStream;
import java.util.Scanner;

public class FilmController {
      private    Film film=new Film();
    public boolean AddFilmInfo(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Введите название фильма:");
        film.setTitle(sc.nextLine());
        System.out.println("Введите жанр фильма:");
        film.setGenre(sc.nextLine());
        System.out.println("Введите страну фильма:");
        film.setCountry(sc.nextLine());
        System.out.println("Введите год фильма:");
        film.setYear(sc.nextInt());
    return true;}
    public boolean ShowFilmInfo(){

        System.out.println(film.toString());
        return true;
    }

}
