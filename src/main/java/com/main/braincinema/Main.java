package com.main.braincinema;

import com.main.braincinema.controller.UserController;
import com.main.braincinema.repository.UserRepositoryFactory;
import com.main.braincinema.repository.utils.H2DbUtils;

import java.util.Scanner;

/**
 * Created by OFedorenko on 01/16/20 braincinema.
 */
public class Main {
    public static void main(String[] args) {
        H2DbUtils.initDB();

        UserController controller = new UserController(UserRepositoryFactory.getUserRepository("h2"));
        int result = 0;
        while(result != 2) {
            System.out.println("Do you want to add user");
            System.out.println("press 1 add user");
            System.out.println("press 2 exit");
            Scanner scanner = new Scanner(System.in);
            result = scanner.nextInt();
            if(result == 1) {
                controller.addUser();
            }
        }


    }
}
