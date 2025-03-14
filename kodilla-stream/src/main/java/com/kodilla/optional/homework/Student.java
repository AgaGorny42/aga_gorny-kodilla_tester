package com.kodilla.optional.homework;

import java.util.Objects;
import java.util.Optional;

public class Student {
    private String name;
    private Teacher teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }
    public String getName() {
        return name;
    }
    public Teacher getTeacher() {

            Teacher undefined = new Teacher("<undefined>");
            Optional<Teacher> optionalTeacher = Optional.ofNullable(teacher);
            Teacher teacher = optionalTeacher.orElse(undefined);
        return teacher;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(teacher, student.teacher);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, teacher);
    }
}
