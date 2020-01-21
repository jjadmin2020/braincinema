package com.main.braincinema.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
}
