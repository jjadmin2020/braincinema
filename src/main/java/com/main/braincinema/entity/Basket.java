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


    Basket() {}
}
