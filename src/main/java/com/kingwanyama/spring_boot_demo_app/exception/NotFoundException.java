package com.kingwanyama.spring_boot_demo_app.exception;
public class NotFoundException extends RuntimeException{

    public NotFoundException(String message) {
        super(message);
    }
}
