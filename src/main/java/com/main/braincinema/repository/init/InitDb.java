package com.main.braincinema.repository.init;

import com.main.braincinema.entity.User;
import com.main.braincinema.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

/**
 * Created by OFedorenko on 02/04/20 braincinema.
 */
@Configuration
@Slf4j
public class InitDb {
    @Bean
    CommandLineRunner initDatabase(UserRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new User(1L, "Gregory", "HouseTheBest", "house@dr.com", "Gregory", "House", new Date())));
            log.info("Preloading " + repository.save(new User(2L, "Harvey", "SpecterRules", "harvey.specter@rules.com", "Harvey", "Specter", new Date())));
        };
    }
}
