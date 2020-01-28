package com.main.braincinema;

import com.main.braincinema.controller.FilmController;
import com.main.braincinema.repository.db.utils.H2UtilsFilm;

/**
 * Created by OFedorenko on 01/16/20 braincinema.
 */
public class Main {
    public static void main(String[] args) {
        H2UtilsFilm.initializeDb();
        FilmController filmController=new FilmController();
       filmController.AddFilmInfo();




    }
}
