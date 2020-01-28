package com.main.braincinema.controller;

import com.main.braincinema.entity.Messenger;
import com.main.braincinema.repository.MessengerRepository;

import java.util.Date;
import java.util.Scanner;

public class MessengerController {

        private final MessengerRepository repository;

        public MessengerController(MessengerRepository repository) {
            this.repository = repository;
        }

        public boolean addMessenger() {
            Messenger messenger = new Messenger();
            System.out.println("input user message: ");
            Scanner scanner = new Scanner(System.in);
            messenger.setUserMessenger(scanner.nextLine());
            repository.addMessenger(messenger);
            return true;
        }

        public boolean deleteUser() {
            Messenger messenger = new Messenger();
            System.out.println("input user message: ");
            Scanner scanner = new Scanner(System.in);
            messenger.setMessenger(scanner.nextLine());
            return true;
        }

}
