package com.main.braincinema;

import com.main.braincinema.controller.TicketController;
import com.main.braincinema.repository.RepositoryFactory;
import com.main.braincinema.repository.utils.MySqlDbUtils;

import java.util.Scanner;

/**
 * Created by OFedorenko on 01/16/20 braincinema.
 */
public class Main {
    public static void main(String[] args) {
        MySqlDbUtils.initDB();

        TicketController controller = new TicketController(RepositoryFactory.getTicketRepository("MySql"));
        int result = Integer.MAX_VALUE;
        while (result != 0) {
            System.out.println("Do you want to dd ticket?");
            System.out.println("press 1 add ticket");
            System.out.println("press 2 show all ticket");
            System.out.println("press 3 find ticket by id");
            System.out.println("press 4 remove ticket by id");
            System.out.println("press 0 exit");
            Scanner scan = new Scanner(System.in);
            result = scan.nextInt();
            if (result == 1) {
                controller.addTicket();
            } else if (result == 2) {
                controller.showAllTicket();
            } else if (result == 3) {
                controller.findTicket();
            } else if (result == 4) {
                controller.removeTicket();
            }
        }

    }
}
