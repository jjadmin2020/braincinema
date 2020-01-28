package com.main.braincinema;

import com.main.braincinema.controller.UserController;
import com.main.braincinema.repository.db.utils.H2Utils;

/**
 * Created by OFedorenko on 01/16/20 braincinema.
 */
public class Main {
    public static void main(String[] args) {
        H2Utils.initializeDb();
        UserController controller = new UserController();
        controller.addUser();
        controller.updateUser();
        controller.ShowUserInfo();


    }
}
