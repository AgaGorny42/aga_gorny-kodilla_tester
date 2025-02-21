package com.kodilla.abstracts.homework;

public abstract class Job {

    int salary;
    String responsibilities;

    public Job(String responsibilities, int salary) {
        this.responsibilities = responsibilities;
        this.salary = salary;
    }
    public abstract int getSalary();
    public abstract String getResponsibilities();

}

