package com.kodillla.collections.adv.maps.homework;

import java.util.List;

public class School {

    private List<Integer> students;
    private String nameOfSchool;

    public School(List<Integer> students, String nameOfSchool) {
        this.students = students;
        this.nameOfSchool = nameOfSchool;
    }
    public int getSumOfStudents() {
        int sum = 0;
        for (Integer numbers : students)
            sum += numbers;
        return sum;
    }
    public String getNameOfSchool () {
        return nameOfSchool;
    }
    @Override
    public String toString() {
        return "School {" +
                "students =" + students +
                '}';
    }
}
