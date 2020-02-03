package com.main.braincinema.repository;

import com.main.braincinema.entity.User;

/**
 * Created by OFedorenko on 01/23/20 braincinema.
 */
public interface UserRepository {

    User createUser(User user);
    User deleteUser(long userId);
    User updateUser(User user);
    User findUserById(long userId);
}
