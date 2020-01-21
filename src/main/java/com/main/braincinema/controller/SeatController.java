package com.main.braincinema.controller;

import com.main.braincinema.entity.Seat;

public class SeatController {

    public boolean checkIsOccupied(Seat seat){
        if(checkIsReadyToUse(seat)){
            return seat.isOccupied();
        }else{
            return true;
        }
    }

    public boolean checkIsReadyToUse(Seat seat){
        return seat.isReadyToUse();
    }



}
