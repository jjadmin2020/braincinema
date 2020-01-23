package com.main.braincinema.repository;

import com.main.braincinema.entity.User;

public interface UserRepository {

    User findUser(long id);
    User removeUser(User user);
    void addUser(User user);
    User updateUser(User user);
}
