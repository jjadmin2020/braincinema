package com.main.braincinema;


import com.main.braincinema.controller.AuditoriumController;
import com.main.braincinema.repository.AuditoriumRepositoryFactory;
import com.main.braincinema.repository.utils.H2DbUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        H2DbUtils.initializeDb();

        AuditoriumController controller = new AuditoriumController(AuditoriumRepositoryFactory.getAuditoriumRepository("h2"));
        int result = 0;
        while(result != 2) {
            System.out.println("Do you want to add auditorium");
            System.out.println("press 1 add auditorium");
            System.out.println("press 2 exit");
            Scanner scanner = new Scanner(System.in);
            result = scanner.nextInt();
            if(result == 1) {
                controller.addAuditorium();
            }
        }
    }
}
