package com.springrest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class CollegeNotFoundException extends RuntimeException {


    public CollegeNotFoundException(String strMessage)
    {
        super(strMessage);
    }
}