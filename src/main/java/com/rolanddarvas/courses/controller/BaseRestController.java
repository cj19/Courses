package com.rolanddarvas.courses.controller;

import com.rolanddarvas.courses.exception.ObjectNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by darvasr on 2017. 08. 07., e-mail: darvas.roland@gmail.com
 */
public abstract class BaseRestController {

    private final Logger logger = LoggerFactory.getLogger(getClass());


    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(RuntimeException.class)
    public void handleRuntimeException(RuntimeException ex) {
        logger.error("error while serving rest request", ex);
    }


    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(IllegalArgumentException.class)
    public void handleIllegalArgumentException(IllegalArgumentException ex) {
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ExceptionHandler(ObjectNotFoundException.class)
    public void handleObjectNotFoundException(ObjectNotFoundException ex) {
    }
}
