package com.main.braincinema.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Basket {

    private long id;
    private String filmName;
    private int ranks;
    private int placeInRank;
    private BigDecimal cost;
    private BigDecimal totalCost;

    public Basket(String filmName, int ranks, int placeInRank, BigDecimal cost) {
        this.filmName = filmName;
        this.ranks = ranks;
        this.placeInRank = placeInRank;
        this.cost = cost;
    }
}
