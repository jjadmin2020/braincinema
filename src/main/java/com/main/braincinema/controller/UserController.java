package com.main.braincinema.controller;

import com.main.braincinema.entity.User;
import com.main.braincinema.repository.UserRepository;
import com.main.braincinema.repository.impl.H2UserRepositoryImpl;

import java.util.Scanner;


public class UserController {
    UserRepository repository = new H2UserRepositoryImpl();

    public UserController(UserRepository h2) {
    }

    public boolean addUser() {
        User user = new User();
        System.out.println("input user name: ");
        Scanner scanner = new Scanner(System.in);
        user.setFirstName(scanner.nextLine());
        repository.createUser(user);
        return true;
    }

     /*   User user = new User();
        System.out.println("Input first name: ");
        Scanner scanner = new Scanner(System.in);
        user.setFirstName(scanner.nextLine());

        System.out.println("Input last name: ");
        user.setLastName(scanner.nextLine());
        repository.createUser(user);

        System.out.println("Input date of birth: ");
        user.setDateOfBirth(scanner.nextLine());

        System.out.println("Input city: ");
        user.setCity(scanner.nextLine());

        System.out.println("Input phone number: ");
        if (scanner.hasNextInt()) {
            user.setPhoneNumber(scanner.nextLine());
        } else {
            System.out.println("Please, input digits");
        }

        System.out.println("Input  e-mail: ");
        user.setEMail(scanner.nextLine());

        System.out.println("Input password: ");
        user.setPassword(scanner.nextLine());

        System.out.println("Check your details" + user.toString());

        scanner.close();
        return true;
    }*/

    public boolean deleteUser() {
        User user = new User();
        System.out.println("Input first name: ");
        Scanner scanner = new Scanner(System.in);
        user.setFirstName(scanner.nextLine());
        return true;
    }

    public boolean findUser() {
        User user = new User();
        System.out.println("Input first name: ");
        Scanner scanner = new Scanner(System.in);
        user.setFirstName(scanner.nextLine());
        return true;
    }

    /*public boolean updateUser() {
        User user = new User();
        System.out.println("Input first name: ");
        Scanner scanner = new Scanner(System.in);
        user.setFirstName(scanner.nextLine());
        return true;
    }*/

    public boolean ShowUserInfo() {
        User user = new User();
        System.out.println(user.toString());
        return true;
    }
    public boolean updateUser() {
        int m = 8;

        while (m != 0) {
            User user = new User();
            System.out.println("Choose what you need to update:");
            System.out.println("1-First name");
            System.out.println("2-Last name");
            System.out.println("3-Date of birth");
            System.out.println("4-City");
            System.out.println("5-Phone number");
            System.out.println("6-E-Mail");
            System.out.println("7-Password");
            System.out.println("0 - Exit");
            Scanner sc = new Scanner(System.in);
            m = sc.nextInt();

            if (m == 1) {
                System.out.println("Input new first name:");
                user.setFirstName(sc.next());
                ShowUserInfo();
            }

            if (m == 2) {
                System.out.println("Input new last name:");
                user.setLastName(sc.next());
                ShowUserInfo();
            }

            if (m == 3) {
                System.out.println("Input date of birth:");
                user.setDateOfBirth(sc.next());
                ShowUserInfo();
            }

            if (m == 4) {
                System.out.println("Input new city:");
                user.setCity(sc.next());
                ShowUserInfo();
            }

            if (m == 5) {
                System.out.println("Input phone number:");
                user.setPhoneNumber(sc.next());
                ShowUserInfo();
            }

            if (m == 6) {
                System.out.println("Input  e-mail:");
                user.setPhoneNumber(sc.next());
                ShowUserInfo();
            }

            if (m == 7) {
                System.out.println("Input password:");
                user.setPhoneNumber(sc.next());
                ShowUserInfo();
            }

        }
        return false;
    }
}