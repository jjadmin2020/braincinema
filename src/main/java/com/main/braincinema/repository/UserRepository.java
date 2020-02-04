package com.main.braincinema.repository;

import com.main.braincinema.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by OFedorenko on 01/28/20 braincinema.
 */

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByEmail(String email);
    User findUserByLoginAndPassword(String login, String password);
}
