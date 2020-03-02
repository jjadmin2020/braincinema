package com.main.braincinema.repository;

import com.main.braincinema.repository.impl.H2AuditoriumRepositoryImpl;

public class AuditoriumRepositoryFactory {
    private static final String H2 = "h2";


    public static AuditoriumRepository getAuditoriumRepository(String repositoryName) {
        if(H2.equals(repositoryName)) {
            return new H2AuditoriumRepositoryImpl();
        }
        return null;
    }
}
