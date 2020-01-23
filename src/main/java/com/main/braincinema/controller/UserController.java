package com.main.braincinema.controller;

import com.main.braincinema.entity.User;
import java.util.Scanner;

public class UserController {
    public boolean addUser() {
        User user = new User();
        System.out.println("Введите Ваше имя: ");
        Scanner scanner = new Scanner(System.in);
        user.setFirstName(scanner.nextLine());


        System.out.println("Введите Вашу фамилию: ");
        user.setLastName(scanner.nextLine());

        System.out.println("Введите дату рождения: ");
        user.setDateOfBirth(scanner.nextLine());

        System.out.println("Введите Ваш город: ");
        user.setCity(scanner.nextLine());

        System.out.println("Введите номер телефона: ");
        if (scanner.hasNextInt()) {
            user.setPhoneNumber(scanner.nextLine());
        } else {
            System.out.println("Вы ввели не цифры ");
        }

        System.out.println("Введите  e-mail: ");
        user.setEMail(scanner.nextLine());

        System.out.println("Придумайте пароль: ");
        user.setPassword(scanner.nextLine());

        System.out.println("Сверте Ваши данные" + user.toString());
        return true;
    }

    public boolean deleteUser() {
        User user = new User();
        System.out.println("Введите Вашу фамилию: ");
        Scanner scanner = new Scanner(System.in);
        user.setFirstName(scanner.nextLine());
        return true;
    }

    public boolean findUser() {
        User user = new User();
        System.out.println("Введите Вашу фамилию: ");
        Scanner scanner = new Scanner(System.in);
        user.setFirstName(scanner.nextLine());
        return true;
    }

    public boolean updateUser() {
        User user = new User();
        System.out.println("Введите Вашу фамилию: ");
        Scanner scanner = new Scanner(System.in);
        user.setFirstName(scanner.nextLine());
        return true;
    }
}
