package com.main.braincinema.controller;

import com.main.braincinema.entity.User;
import com.main.braincinema.repository.UserRepository;

import java.util.Date;
import java.util.Scanner;


public class UserController {
    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    public boolean addUser() {
        User user = new User();
        System.out.println("input user name: ");
        Scanner scanner = new Scanner(System.in);
        user.setFirstName(scanner.nextLine());
        user.setDateOfBirth(new Date());
        user.setLastName("House");
        repository.addUser(user);
        return true;
    }

    public boolean deleteUser() {
        User user = new User();
        System.out.println("input user name: ");
        Scanner scanner = new Scanner(System.in);
        user.setFirstName(scanner.nextLine());
        return true;
    }

    public boolean findUser() {
        User user = new User();
        System.out.println("input user name: ");
        Scanner scanner = new Scanner(System.in);
        user.setFirstName(scanner.nextLine());
        return true;
    }
}
