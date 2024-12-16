package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunController {
    private final Coach myCoach;
    @Autowired
    public FunController(Coach TheCoach){
        this.myCoach = TheCoach;
    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/")
    public String health(){
        return "health";
    }
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;
    @GetMapping("/teamInfo")
    public String teamInfo(){
        return "coach" + coachName + "team:" + teamName;
    }

}
