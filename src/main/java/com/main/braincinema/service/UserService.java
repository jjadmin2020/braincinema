package com.main.braincinema.service;

import com.main.braincinema.entity.User;

import java.util.List;

/**
 * Created by OFedorenko on 01/28/20 braincinema.
 */
public interface UserService {

    String login(String login, String password);
    boolean register(User user);
    List<User> getAllUsers();
}
