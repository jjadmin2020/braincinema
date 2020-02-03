package com.main.braincinema.entity;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Basket {
    private long id;
    private ArrayList<Ticket> tickets;

    public Basket(Ticket ticket) {
        tickets.add(ticket);
    }
}
