package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Tomasz Kamel", null));
        students.add(new Student("Joanna Stachyra", new Teacher("Grzegorz Predki")));
        students.add(new Student("Katarzyna Mazur", new Teacher("Przemyslaw Rosolek")));

        for(Student student : students) {
            System.out.println("student: " + student.getName() + " teacher: " + student.getTeacher().getName());
        }
    }
}
