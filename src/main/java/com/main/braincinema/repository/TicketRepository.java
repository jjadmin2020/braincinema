package com.main.braincinema.repository;

import com.main.braincinema.entity.Ticket;

public interface TicketRepository {
    void findTicket(long id);
    void showAllTicket();
    void removeTicket(long id);
    void addTicket(Ticket ticket);
    Ticket updateTicket(Ticket ticket);
}
