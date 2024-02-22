package com.example.greeting_names.models;

import org.apache.logging.log4j.message.Message;

public class Celebration {
    private String message;

    public Celebration(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
