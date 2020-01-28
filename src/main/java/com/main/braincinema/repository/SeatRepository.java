package com.main.braincinema.repository;

import com.main.braincinema.entity.Seat;

import java.util.List;

public interface SeatRepository {

    void add(Seat seat);

    List<Seat> getAll();

    Seat getById(int id);

    void update(Seat seat);

    void remove(Seat seat);

}
