package com.main.braincinema.entity;

import lombok.Data;
import java.util.Date;

@Data
public class User {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String city;
    private int phoneNumber;
    private String eMail;
    private String password;
}
