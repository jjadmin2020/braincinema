package com.main.braincinema.entity;


import lombok.Data;
import java.util.HashMap;
import java.util.Map;

@Data
public class Auditorium {

    private String name;
    private final int ranks;
    private final int placesInRank;
    private Map<Integer,Seat> seats;
    private Seat seat;
    private int freeSeats = 0;
    private int occupiedSeats = 0;
    private int unicNumber;

    public Auditorium(String name, int ranks, int placesInRank){
           this.name = name;
           this.ranks = ranks;
           this.placesInRank = placesInRank;
    }


}
