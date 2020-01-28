package com.main.braincinema.service.imple;

import com.main.braincinema.entity.User;
import com.main.braincinema.repository.UserRepository;
import com.main.braincinema.repository.impl.UserRepositoryImpl;
import com.main.braincinema.service.UserService;

/**
 * Created by OFedorenko on 01/28/20 braincinema.
 */
public class UserServiceImpl implements UserService {
    UserRepository userRepository = new UserRepositoryImpl();

    @Override
    public String login(String userName, String password) {
        return null;
    }

    @Override
    public boolean register(User user) {
        return userRepository.register(user);
    }
}
