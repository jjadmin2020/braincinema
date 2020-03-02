package com.main.braincinema.repository;

import com.main.braincinema.entity.Auditorium;


public interface AuditoriumRepository {

    void createAuditorium(Auditorium auditorium);

    Auditorium getAuditoriumById(long id);

    Auditorium updateAuditorium (Auditorium auditorium);

    Auditorium deleteAuditorium(Auditorium auditorium);

}
