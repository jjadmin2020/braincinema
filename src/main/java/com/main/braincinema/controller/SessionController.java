package com.main.braincinema.controller;

import com.main.braincinema.entity.Session;

import java.math.BigDecimal;
import java.util.Scanner;

public class SessionController {
    public boolean addFilmSession() {
        Session session = new Session();

        System.out.println("Please enter Film name: ");
        Scanner scanner = new Scanner(System.in);
        session.setFilmName(scanner.nextLine());

        System.out.println("Please enter Film duration: ");
        session.setFilmDuration(scanner.nextLine());

        System.out.println("Please enter Film start session date: ");
        session.setFilmStartDate(scanner.nextLine());

        System.out.println("Please enter Film end session date: ");
        session.setFilmEndDate(scanner.nextLine());

        System.out.println("Please enter seats number for Film session: ");
        session.setSeatsNumbers(scanner.nextInt());

        System.out.println("Please enter how much seats type you have: ");
        session.setSeatsTypeCount(scanner.nextInt());

        for (int i = 1; i <= session.getSeatsTypeCount(); i++) {
            System.out.println("Please enter seats type: ");
            String seats = scanner.nextLine();
            System.out.println("Please enter seats price: ");
            BigDecimal price = scanner.nextBigDecimal();
            session.setSeatsTypeAndPrice(seats, price);
        }
        return true;
    }

    public boolean findFilmSession() {
        Session session = new Session();
        System.out.println("Please enter Film name: ");
        Scanner scanner = new Scanner(System.in);
//        --- search Film Session in Db ---
        return true;
    }

    public boolean deleteFilmSession() {
        Session session = new Session();
        System.out.println("Please enter Film Session id: ");
        Scanner scanner = new Scanner(System.in);
//        --- Delete from Db ---
        return true;
    }

    public boolean updateFilmSession() {
        Session session = new Session();
        System.out.println("Please enter Film Session id: ");
        Scanner scanner = new Scanner(System.in);
//        --- Update in Db ---
        return true;
    }


}
