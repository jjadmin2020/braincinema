package com.main.braincinema.controller;

import com.main.braincinema.entity.User;
import java.util.Scanner;

public class UserController {
    public boolean addUser() {
        User user = new User();
        System.out.println("Input first name: ");
        Scanner scanner = new Scanner(System.in);
        user.setFirstName(scanner.nextLine());


        System.out.println("Input last name: ");
        user.setLastName(scanner.nextLine());

        System.out.println("Input date of birth: ");
        user.setDateOfBirth(scanner.nextLine());

        System.out.println("Input city: ");
        user.setCity(scanner.nextLine());

        System.out.println("Input phone number: ");
        if (scanner.hasNextInt()) {
            user.setPhoneNumber(scanner.nextLine());
        } else {
            System.out.println("Вы ввели не цифры ");
        }

        System.out.println("Input  e-mail: ");
        user.setEMail(scanner.nextLine());

        System.out.println("Input password: ");
        user.setPassword(scanner.nextLine());

        System.out.println("Сверте Ваши данные" + user.toString());
        return true;
    }

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

    public boolean updateUser() {
        User user = new User();
        System.out.println("Input first name: ");
        Scanner scanner = new Scanner(System.in);
        user.setFirstName(scanner.nextLine());
        return true;
    }
}
