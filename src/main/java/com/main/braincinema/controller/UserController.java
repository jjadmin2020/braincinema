package com.main.braincinema.controller;

import com.main.braincinema.entity.User;
import com.main.braincinema.repository.UserRepository;
import com.main.braincinema.repository.impl.H2UserRepositoryImpl;

import java.util.Scanner;


public class UserController {
    UserRepository repository = new H2UserRepositoryImpl();
    public boolean addUser() {
        User user = new User();
        System.out.println("input user name: ");
        Scanner scanner = new Scanner(System.in);
        user.setFirstName(scanner.nextLine());
        repository.createUser(user);
        return true;
    }

    public boolean deleteUser() {
        User user = new User();
        System.out.println("input user name: ");
        Scanner scanner = new Scanner(System.in);
        user.setFirstName(scanner.nextLine());
        return true;
    }

    public User findUser() {
        User user = new User();
        System.out.println("input user name: ");
        Scanner scanner = new Scanner(System.in);
        user.setFirstName(scanner.nextLine());
        user = repository.findUserById(user.getId());
        return user;
    }
}
