package com.main.braincinema.controller;

import com.main.braincinema.entity.Ticket;

import java.util.Scanner;

public class TicketController {
    private static Scanner scan = new Scanner(System.in);

    public boolean addTicket() {
        Ticket ticket = new Ticket();
        System.out.print("input film name: ");
        ticket.setFilmName(scan.nextLine());
        System.out.print("input date (dd.MM.yyyy): ");
        ticket.setDate(scan.nextLine());
        System.out.print("input film name: ");
        ticket.setTime(scan.nextLine());
        return true;
    }
}
