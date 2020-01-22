package com.main.braincinema.controller;

import com.main.braincinema.entity.Basket;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class BasketController {

    Scanner scan = new Scanner(System.in);
    ArrayList<String> tickets = new ArrayList<>();

    public boolean addTicket() {

        //TODO addTicket()

        System.out.println("--Add Ticket--");
        System.out.print("film ");
        String filmName = scan.next();
        System.out.print("ranks ");
        int ranks = scan.nextInt();
        System.out.print("place ");
        int place = scan.nextInt();
        System.out.print("cost ");
        BigDecimal cost = scan.nextBigDecimal();

        Basket basket;
        try {
            basket = new Basket(filmName, ranks, place, cost);
            System.out.println(basket.toString());
            tickets.add(basket.getFilmName());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean showTickets() {
        System.out.println("--Show Ticket--");
        for (String filmName : tickets) {
            System.out.println(filmName);
        }
        //TODO showTickets()

        return true;
    }

    public boolean deleteTicket() {
        System.out.println("--Delete Ticket--");
        System.out.print("enter ticket number: ");
        int numb = scan.nextInt();
        tickets.remove(numb - 1);
        //TODO deleteTicket()

        return true;
    }

    public boolean buyTicket() {
        System.out.println("--Buy Ticket--");
        //TODO buyTicket()

        cleanBasket();
        return true;
    }

    public boolean cleanBasket() {
        System.out.println("--Clean Ticket--");
        tickets.clear();
        return true;
    }
}
