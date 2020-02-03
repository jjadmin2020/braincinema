package com.main.braincinema.controller;

import com.main.braincinema.entity.Ticket;
import com.main.braincinema.repository.TicketRepository;

import java.util.Scanner;

public class TicketController {
    private static Scanner scan = new Scanner(System.in);
    private Ticket ticket = null;

    private final TicketRepository repository;

    public TicketController(TicketRepository repository) {
        this.repository = repository;
    }

    public boolean addTicket() {
        ticket = new Ticket();
        System.out.print("input film name: ");
        ticket.setFilmName(scan.nextLine());
        System.out.print("input date (dd.MM.yyyy): ");
        ticket.setDate(scan.nextLine());
        System.out.print("input time: ");
        ticket.setTime(scan.nextLine());
        System.out.print("input hall: ");
        ticket.setHall(scan.nextLine());
        System.out.print("input row: ");
        ticket.setRow(scan.nextInt());
        System.out.print("input place: ");
        ticket.setPlace(scan.nextInt());
        System.out.print("input cost: ");
        ticket.setCost(scan.nextBigDecimal());

        repository.addTicket(ticket);
        return true;
    }

    public boolean showAllTicket() {
        repository.showAllTicket();
        return true;
    }

    public boolean findTicket() {
        System.out.print("Input ticket id: ");
        repository.findTicket(scan.nextLong());
        return true;
    }

    public boolean removeTicket() {
        System.out.print("Input ticket id: ");
        repository.removeTicket(scan.nextLong());
        return true;
    }

}
