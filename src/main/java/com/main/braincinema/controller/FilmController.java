package com.main.braincinema.controller;

import com.main.braincinema.entity.Film;
import com.main.braincinema.entity.FilmComments;
import com.main.braincinema.repository.FilmRepository;
import com.main.braincinema.repository.impl.H2FilmRepositoryImpl;


import java.util.Scanner;

public class FilmController {
   // private Film film = new Film();
   // private FilmComments filmComments = new FilmComments();
FilmRepository filmRepository =new H2FilmRepositoryImpl();
    public boolean AddFilmInfo() {
Film film=new Film();
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите название фильма:");
        film.setTitle(sc.nextLine());
        System.out.println("Введите жанр фильма:");
        film.setGenre(sc.nextLine());
        System.out.println("Введите страну фильма:");
        film.setCountry(sc.nextLine());
        System.out.println("Введите год фильма:");
        film.setYear(sc.nextInt());
        filmRepository.addFilm(film);
        return true;
    }

    public boolean ShowFilmInfo() {
        Film film=new Film();

        System.out.println(film.toString());
        return true;
    }

    public boolean UpdateFilm() {
        Film film=new Film();

        int z = 5;

       while (z!=0){

           System.out.println("Выберите, что необходимо обновить:");
           System.out.println("1-Название");
           System.out.println("2-Жанр");
           System.out.println("3-Страну");
           System.out.println("4-Год");
           System.out.println("0 - Выход");
           Scanner sc = new Scanner(System.in);
           z = sc.nextInt();

                if(z==1) {
                    System.out.println("Введите новое название фильма:");
                    film.setTitle(sc.next());
                    ShowFilmInfo();
                }

                if(z==2){
                    System.out.println("Введите новый жанр фильма:");
                    film.setGenre(sc.next());
                    ShowFilmInfo();
                    }
                if(z==3){
                    System.out.println("Введите новую страну фильма:");
                    film.setCountry(sc.next());
                    ShowFilmInfo();
                    }
                if(z==4){
                    System.out.println("Введите новый год фильма:");
                    film.setYear(sc.nextInt());
                    ShowFilmInfo();}



            }

        return true;
    }

    public boolean AddComent() {
FilmComments filmComments=new FilmComments();
        System.out.println("Введите комментарий:");
        Scanner sc = new Scanner(System.in);
        filmComments.setComment(sc.nextLine());

        return true;
    }

    public boolean ChangeComent() {
        FilmComments filmComments=new FilmComments();

        System.out.println("Изменить комментарий:");
        Scanner sc = new Scanner(System.in);
        filmComments.setComment(sc.nextLine());

        return true;
    }


}
