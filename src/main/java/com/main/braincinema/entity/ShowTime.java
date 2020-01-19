package com.main.braincinema.entity;

import lombok.Data;

import java.util.Calendar;
import java.util.Date;

@Data
public class ShowTime {
    private String imageUrl;
    private Calendar calendar;
    private String cinemaName;
    private String cinemaHall;
    private String filmTitle;
    private String filmFormat;      // 2D or 3D
    private Integer filmAgeLimit;
    private Date filmDate;
    private Date filmTime;
}
