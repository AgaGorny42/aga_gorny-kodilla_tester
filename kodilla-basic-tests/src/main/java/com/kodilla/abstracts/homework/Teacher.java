package com.kodilla.abstracts.homework;

public class Teacher extends Job{

    public Teacher() {
        super("Teachers teach and educate children at schools.", 7000);
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
