package com.main.braincinema.controller;

import com.main.braincinema.entity.ShowTime;

import java.util.Calendar;
import java.util.Date;

public class ShowTimeController {
    public Calendar showCalendar() {
        ShowTime showTime = new ShowTime();
        return showTime.getCalendar();
    }

    public String showFilmImageUrl() {
        ShowTime showTime = new ShowTime();
        return showTime.getImageUrl();
    }

    public String showFilmTitle() {
        ShowTime showTime = new ShowTime();
        return showTime.getFilmTitle();
    }

    public Integer showFilmAgeLimit() {
        ShowTime showTime = new ShowTime();
        return showTime.getFilmAgeLimit();
    }

    public String showFilmTime() {
        ShowTime showTime = new ShowTime();
        String showTimeFilmTime;
        String cinemaName = showTime.getCinemaName();
        Date filmTime = showTime.getFilmTime();
        String cinemaHall = showTime.getCinemaHall();
        showTimeFilmTime = cinemaName + filmTime + cinemaHall;
        return showTimeFilmTime;
    }
}
