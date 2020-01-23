package com.main.braincinema.entity;

import lombok.Data;
import java.util.Date;
import java.util.Map;

@Data
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String city;
    private int phoneNumber;
    private String eMail;
    private String password;
    private Map<Integer,User> users;

    public User(String firstName,
                String lastName,
                Date dateOfBirth,
                String city,
                int phoneNumber,
                String eMail,
                String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
        this.password = password;
    }

    public User() {
    }

    public User(String firstName) {
        this.firstName = firstName;
    }

    public void setDateOfBirth(String nextLine) {
    }

    public void setPhoneNumber(String nextLine) {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", city='" + city + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", eMail='" + eMail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
