package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class CarFactory {

    private String getSeason() {
        int month = LocalDateTime.now().getMonthValue();
        if (month == 1 || month == 2 || month == 3) {
            return "Winter";
        } else if (month == 4 || month == 5 || month == 6) {
            return "Spring";
        } else if (month == 7 || month == 8 || month == 9) {
            return "Summer";
        } else return "Autumn";
    }

    @Bean
    public Car getCar() {
        Car car;
        String season = getSeason();
        if(season.equals("Winter")){
            return new SUV();
        } else if (season.equals("Spring")) {
            return new Sedan();
        } else if (season.equals("Summer")) {
            return new Cabrio();
        }else return new Sedan();
    }
}



