package com.main.braincinema.controller;

import com.main.braincinema.entity.Auditorium;
import com.main.braincinema.repository.AuditoriumRepository;

import java.util.Scanner;

public class AuditoriumController {

    private final AuditoriumRepository repository;

    public AuditoriumController(AuditoriumRepository repository){
        this.repository = repository;
    }

    public boolean addAuditorium(){
        Auditorium auditorium = new Auditorium();
        System.out.println("Input Auditorium name: ");
        Scanner scanner = new Scanner(System.in);
        auditorium.setName(scanner.nextLine());
        System.out.println("Input Auditorium ranks: ");
        auditorium.setRanks(scanner.nextInt());
        System.out.println("Input Auditorium places in rank: ");
        auditorium.setPlacesInRank(scanner.nextInt());
        repository.createAuditorium(auditorium);
        return true;
    }

    public boolean deleteAuditorium(){
        return true;
    }

    public boolean getAuditorium(){
        return true;
    }

    public boolean updateAuditorium(){
        return true;
    }
}
