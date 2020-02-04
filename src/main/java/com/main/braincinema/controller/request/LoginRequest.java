package com.main.braincinema.controller.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * Created by OFedorenko on 02/04/20 braincinema.
 */
@Data
public class LoginRequest {
    @NotBlank(message = "login.html is mandatory")
    private String login;
    @NotBlank(message = "password is mandatory")
    private String password;
}
