package com.main.braincinema.entity;


import lombok.Data;
import java.util.HashMap;
import java.util.Map;

@Data
public class Auditorium {

    private String name;
    private final int ranks;
    private final int placesInRank;
    private Map<Integer,Seat> seats;
    private Seat seat;
    private int freeSeats = 0;
    private int occupiedSeats = 0;
    private int unicNumber;

    public Auditorium(String name, int ranks, int placesInRank){
            if(!check(ranks,placesInRank)){
                    throw new IllegalArgumentException("Make a sufficient number of places/ranks");
            }
            this.name = name;
            this.ranks = ranks;
            this.placesInRank = placesInRank;
            seats = new HashMap(ranks*placesInRank);
    }

    public boolean check(int ranks,int placesInRank){
        return ranks>0&&ranks<17&&placesInRank>0&&placesInRank<25;
    }

    public void generateSeats(int ranks,int placesInRank){
        for(int i = 1; i <= ranks;i++){
            for(int j = 1; j <= placesInRank;j++){
                seat = new Seat(i,j,50.0,"ordinary");
                setUnicNumber(i*1000+j);
                seats.put(this.unicNumber,seat);
            }
        }
    }

    public void setOccupiedSeat(int unicNumber){
        seats.get(unicNumber).setOccupied(true);
    }

    public int freeSeats() {
        for (Map.Entry<Integer,Seat> seats : seats.entrySet()){
            if(seats.getValue().isOccupied()== false){
                freeSeats++;
            }
        }
        return freeSeats;
    }

    public int occupiedSeats() {
        for (Map.Entry<Integer,Seat> seats : seats.entrySet()){
            if(seats.getValue().isOccupied()== true){
                freeSeats++;
            }
        }
        return occupiedSeats;
    }

    private int checkSize() {
        return this.seats.size();
    }


}
