package com.main.braincinema.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Ticket {
    private long id;
    private String filmName;
    private String date;
    private String time;
    private String hall;
    private int row;
    private int place;
    private BigDecimal cost;

//    public Ticket(String filmName, String date, String time, String hall, int row, int place, BigDecimal cost) {
//        this.filmName = filmName;
//        this.date = date;
//        this.time = time;
//        this.hall = hall;
//        this.row = row;
//        this.place = place;
//        this.cost = cost;
//    }
}
