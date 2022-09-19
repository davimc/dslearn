package com.devsuperior.dslearnbds.services.exceptions;


public class UnauthorizedException extends RuntimeException{

    public UnauthorizedException(String message) {
        super(message);
    }
}
