package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Scope("prototype")
public class Clock {

    LocalTime actualTime = LocalTime.now();

    public Clock(){
        System.out.println("Actual time: " + actualTime);
    }
}
