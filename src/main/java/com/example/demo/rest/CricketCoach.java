package com.example.demo.rest;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
      return "play cricket for 1 hour daily";

    }
}
