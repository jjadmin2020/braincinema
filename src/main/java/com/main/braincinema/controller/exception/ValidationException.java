package com.main.braincinema.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by OFedorenko on 02/04/20 braincinema.
 */
@ResponseStatus(value= HttpStatus.BAD_REQUEST, reason="Validation Error")  // 404
public class ValidationException extends RuntimeException {
}
