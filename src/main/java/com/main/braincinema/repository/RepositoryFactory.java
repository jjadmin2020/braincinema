package com.main.braincinema.repository;

import com.main.braincinema.repository.impl.MySqlTicketRepositoryImpl;

public class RepositoryFactory {

    private static final String H2 = "h2";
    private static final String MySql = "MySql";

    public static TicketRepository getTicketRepository(String repositoryName) {
        if(MySql.equals(repositoryName)) {
            return new MySqlTicketRepositoryImpl();
        }
        return null;
    }
}