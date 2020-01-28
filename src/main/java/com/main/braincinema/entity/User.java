package com.main.braincinema.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private String login;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
}
