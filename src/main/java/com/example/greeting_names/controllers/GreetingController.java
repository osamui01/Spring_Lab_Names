package com.example.greeting_names.controllers;

import com.example.greeting_names.models.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greeting")

public class GreetingController {

    @GetMapping
    public Reply newGreeting(@RequestParam(value = "timeOfDay", defaultValue = "Day") String timeOfDay) {
        Greeting greeting = new Greeting("Colin", timeOfDay);
        return new Reply("Good " + greeting.getTimeOfDay() + " " + greeting.getName());
    }

    @GetMapping(value = "/summer")
    public Celebration summerGreeting() {
        return new Celebration("Happy Summer Solstice");
    }
}


