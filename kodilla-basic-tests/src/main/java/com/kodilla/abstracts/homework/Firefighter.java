package com.kodilla.abstracts.homework;

public class Firefighter extends Job{

    public Firefighter() {
        super("The fireman puts out fires and saves people.", 8000);
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public String getResponsibilities() {
        return responsibilities;
    }
}
