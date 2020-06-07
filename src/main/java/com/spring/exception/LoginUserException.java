package com.spring.exception;

import com.spring.exception.error.ErrorClass;

public class LoginUserException extends RuntimeException{
    private ErrorClass errorClass;

    public LoginUserException(String message, ErrorClass errorClass) {
        super(message);
        this.errorClass = errorClass;
    }

    public LoginUserException(ErrorClass errorClass, Throwable cause) {
        super(cause);
    }

}
