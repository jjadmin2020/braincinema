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
    private Auditorium auditorium;
    private Seat seat;

    public Ticket(String filmName, String date, String time) {
        this.filmName = filmName;
        this.date = date;
        this.time = time;
        this.hall = auditorium.getName();
        this.row = auditorium.getRanks();
        this.place = auditorium.getPlacesInRank();
        this.cost = BigDecimal.valueOf(seat.getCost());
    }
}
