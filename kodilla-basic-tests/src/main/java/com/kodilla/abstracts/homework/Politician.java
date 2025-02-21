package com.kodilla.abstracts.homework;

public class Politician extends Job{

    public Politician() {
        super("Politicians manage the country and ensure its security.", 15000);
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
