package com.main.braincinema.entity;

import lombok.Data;

@Data
public class Seat {

    private User user;
    private String type;
    private int id;
    private final int rank;
    private final int number;
    private double cost;
    private boolean isOccupied = false;
    private boolean isReadyToUse = true;

    public Seat(int rank,int number,double cost,String type){
        user = new User();
        this.rank = rank;
        this.number = number;
        this.cost = cost;
        this.type = type;
        this.id = this.rank * 1000 + this.number;
    }

}
