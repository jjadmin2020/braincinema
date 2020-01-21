package com.main.braincinema.controller;

import com.main.braincinema.entity.User;
import java.util.Scanner;


public class UserController {
    public boolean addUser() {
        User user = new User();
        System.out.println("input user name: ");
        Scanner scanner = new Scanner(System.in);
        user.setFirstName(scanner.nextLine());
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
