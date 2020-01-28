package com.main.braincinema.repository;

import com.main.braincinema.entity.User;

/**
 * Created by OFedorenko on 01/28/20 braincinema.
 */
public interface UserRepository {

    User checkIfUserExists(String userName, String password);
    boolean register(User user);
}
