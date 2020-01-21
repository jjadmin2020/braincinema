package com.main.braincinema.entity;

import lombok.Data;

@Data
public class Seat {

    private User user;
    private String type;
    private int unicNumber;
    private final int rank;
    private final int number;
    private double cost;
    private boolean isOccupied = false;
    private boolean isReadyToUse = true;

    public Seat(int rank,int nubmer,double cost,String type){
        user = new User();
        this.rank = rank;
        this.number = nubmer;
        this.cost = cost;
        this.type = type;
        this.unicNumber = this.rank * 1000 + this.number;
    }

}
