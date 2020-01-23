package com.main.braincinema.repository;

import com.main.braincinema.repository.impl.H2UserRepositoryImpl;

public class UserRepositoryFactory {
    private static final String H2 = "h2";


    public static UserRepository getUserRepository(String repositoryName) {
        if(H2.equals(repositoryName)) {
            return new H2UserRepositoryImpl();
        }
        return null;
    }
}
