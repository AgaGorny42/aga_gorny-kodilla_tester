package com.kodillla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {

        Map<Principal, School> schools = new HashMap<>();

        Principal tom = new Principal("Tom", "DirectorOne");
        Principal anna = new Principal("Anna", "DirectorTwo");
        Principal john = new Principal("John", "DirectorThree");

        School tomSchool = new School (Arrays.asList(19, 23, 25, 18, 20), "Elementary School");
        School annaSchool = new School(Arrays.asList(21, 18, 25), "High School");
        School johnSchool = new School(Arrays.asList(23, 26, 20, 25), "Middle School");

        schools.put(tom, tomSchool);
        schools.put(anna, annaSchool);
        schools.put(john, johnSchool);

        System.out.println(schools.get(tom));
        System.out.println(schools.get(anna));
        System.out.println(schools.get(john));

        System.out.println("Total number of students in Tom's school: " + annaSchool.getSumOfStudents());
        System.out.println("Total number of students in Anna's school: " + tomSchool.getSumOfStudents());
        System.out.println("Total number of students in John's school: " + johnSchool.getSumOfStudents());

        int sum = 0;
        for(Map.Entry<Principal, School> school : schools.entrySet()) {
            sum += school.getValue().getSumOfStudents();

            System.out.println(school.getKey().getFirstName() + " " + school.getKey().getLastName()
                    + " is the director of " + school.getValue().getNameOfSchool() + ".");
            System.out.println("There are " + school.getValue().getSumOfStudents() + " students at this school.");
        }
        System.out.println("There are " + sum + " students at these schools.");
    }
}
