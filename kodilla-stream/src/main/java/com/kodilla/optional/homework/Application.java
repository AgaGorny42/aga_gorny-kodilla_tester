package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Tomasz Kamel", null));
        students.add(new Student("Joanna Stachyra", new Teacher("Grzegorz Predki")));
        students.add(new Student("Katarzyna Mazur", new Teacher("Przemyslaw Rosolek")));

        for(Student student : students) {

            Teacher undefined = new Teacher("<undefined>");
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            Teacher teacher = optionalTeacher.orElse(undefined);
            System.out.println("student: " + student.name + " teacher: " + teacher.getName());
        }
    }
}
