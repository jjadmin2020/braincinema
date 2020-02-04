package com.main.braincinema.controller.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * Created by OFedorenko on 02/04/20 braincinema.
 */
@Data
public class RegistrationRequest {
    @NotBlank(message = "login.html is mandatory")
    private String login;
    @NotBlank(message = "password is mandatory")
    private String password;
    @NotBlank(message = "Email is mandatory")
    private String email;
    @NotBlank(message = "firstName is mandatory")
    private String firstName;
    @NotBlank(message = "LastName is mandatory")
    private String lastName;
    @NotBlank(message = "dateOfBirth is mandatory")
    private Date dateOfBirth;
}
