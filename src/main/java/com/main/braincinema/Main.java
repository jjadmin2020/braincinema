package com.main.braincinema;

import com.main.braincinema.controller.SeatController;
import com.main.braincinema.entity.Seat;
import com.main.braincinema.entity.*;

/**
 * Created by OFedorenko on 01/16/20 braincinema.
 */
public class Main {
    public static void main(String[] args) {
        Auditorium auditorium = new Auditorium("2", 7, 7);
        SeatController seatController = new SeatController();
        auditorium.generateSeats(auditorium.getRanks(),auditorium.getPlacesInRank());
        auditorium.setOccupiedSeat(1001);
        auditorium.getSeats().get(7007).setType("Vip");
        System.out.println(auditorium.getSeats().get(1001));
        System.out.println(auditorium.getSeats().get(7007));
        System.out.println("Amount of free seats: = " + auditorium.freeSeats());
        System.out.println("Amount of occupied seats: = " + auditorium.occupiedSeats());

    }
}
