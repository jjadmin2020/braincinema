package com.main.braincinema.service;

import com.main.braincinema.entity.User;

/**
 * Created by OFedorenko on 01/28/20 braincinema.
 */
public interface UserService {

    String login(String userName, String password);
    boolean register(User user);
}
