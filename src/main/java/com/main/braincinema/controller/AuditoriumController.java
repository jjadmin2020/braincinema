package com.main.braincinema.controller;

import com.main.braincinema.entity.Auditorium;
import com.main.braincinema.entity.Seat;

import java.util.HashMap;
import java.util.Map;

public class AuditoriumController {

    Auditorium auditorium;

    public AuditoriumController(Auditorium auditorium){
        if(!check(auditorium.getRanks(),auditorium.getPlacesInRank())){
            throw new IllegalArgumentException("Make a sufficient number of places/ranks");
        }
        this.auditorium = auditorium;
        auditorium.setSeats(new HashMap(auditorium.getRanks()*auditorium.getPlacesInRank()));
    }

    public boolean check(int ranks,int placesInRank){
        return ranks>0&&ranks<17&&placesInRank>0&&placesInRank<25;
    }

    public void generateSeats(int ranks,int placesInRank){
        for(int i = 1; i <= ranks;i++){
            for(int j = 1; j <= placesInRank;j++){
                Seat seat = new Seat(i,j,50.0,"ordinary");
                seat.setUnicNumber(i*1000+j);
                auditorium.getSeats().put(seat.getUnicNumber(),seat);
            }
        }
    }

    public void setOccupiedSeat(int unicNumber){
        auditorium.getSeats().get(unicNumber).setOccupied(true);
    }

    public int checkFreeSeats() {
        for (Map.Entry<Integer,Seat> seats : auditorium.getSeats().entrySet()){
            if(seats.getValue().isOccupied()== false){
                auditorium.setFreeSeats(auditorium.getFreeSeats()+1);
            }
        }
        return auditorium.getFreeSeats();
    }

    public int checkOccupiedSeats() {
        for (Map.Entry<Integer,Seat> seats : auditorium.getSeats().entrySet()){
            if(seats.getValue().isOccupied()== true){
                auditorium.setOccupiedSeats(auditorium.getOccupiedSeats()+1);
            }
        }
        return auditorium.getOccupiedSeats();
    }

    private int checkSize() {
        return auditorium.getSeats().size();
    }
}
