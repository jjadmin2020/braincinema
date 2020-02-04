package com.main.braincinema.service.impl;

import com.main.braincinema.entity.User;
import com.main.braincinema.repository.UserRepository;
import com.main.braincinema.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by OFedorenko on 01/28/20 braincinema.
 */
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String login(String login, String password) {
        User user = userRepository.findUserByLoginAndPassword(login, password);
        if(user != null) {
            return user.toString();
        }
        return "incorrect login.html or password";
    }

    @Override
    public boolean register(User user) {
        User searchUser = userRepository.findUserByEmail(user.getEmail());
        if(searchUser == null) {
            return false;
        }
        userRepository.save(user);
        return true;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
