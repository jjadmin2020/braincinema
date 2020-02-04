package com.main.braincinema.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@Builder
@AllArgsConstructor
public class User {
    private @Id @GeneratedValue Long id;
    private String login;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;

    public User(){

    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
