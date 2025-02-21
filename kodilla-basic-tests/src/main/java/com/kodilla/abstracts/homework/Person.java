package com.kodilla.abstracts.homework;

public class Person{
        String firsName;
        int age;
        Job job;

    public Person(String firsName, int age, Job job){
            this.firsName = firsName;
            this.age = age;
            this.job = job;

    }
    public void displayResponsibilities() {
        System.out.println(job.getResponsibilities());
    }
}
