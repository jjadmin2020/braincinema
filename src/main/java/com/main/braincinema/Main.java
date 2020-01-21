package com.main.braincinema;

import com.main.braincinema.controller.AuditoriumController;
import com.main.braincinema.controller.SeatController;
import com.main.braincinema.entity.Seat;
import com.main.braincinema.entity.*;


public class Main {
    public static void main(String[] args) {
        Auditorium auditorium = new Auditorium("2", 7, 7);
        AuditoriumController auditoriumController = new AuditoriumController(auditorium);
        Seat seat = new Seat(1,1,50.0,"vip");
        SeatController seatController = new SeatController();
        auditoriumController.generateSeats(auditorium.getRanks(),auditorium.getPlacesInRank());
        auditoriumController.setOccupiedSeat(1001);
        auditorium.getSeats().get(7007).setType("Vip");
        System.out.println(auditorium.getSeats().get(1001));
        System.out.println(auditorium.getSeats().get(7007));
        System.out.println("Amount of free seats: = " + auditoriumController.checkFreeSeats());
        System.out.println("Amount of occupied seats: = " + auditoriumController.checkOccupiedSeats());
    }
}
