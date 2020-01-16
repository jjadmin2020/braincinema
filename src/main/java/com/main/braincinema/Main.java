package com.main.braincinema;

import com.main.braincinema.entity.User;

/**
 * Created by OFedorenko on 01/16/20 braincinema.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello Java!!!!!");
        User user = new User();
        user.setFirstName("Gregory");
        System.out.println(user.toString());
    }
}
