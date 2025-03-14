package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    public void checkStudentsList() {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Joanna Stachyra", new Teacher("Grzegorz Predki")));
        students.add(new Student("Katarzyna Mazur", new Teacher("Przemyslaw Rosolek")));

        assertEquals(2, students.size() );
    }
    @Test
    public void getTeacherNameNullAsUndefined() {
        Student student = new Student("Tomasz Kamel", null);
        Teacher teacherTest = new Teacher("<undefined>");

        assertEquals(teacherTest, student.getTeacher());
    }
    @Test
    public void studentGetNameTest() {
        Student student = new Student("Joanna Stachyra", new Teacher("Grzegorz Predki"));
        String studentExpected = "Joanna Stachyra";
        String studentTest = student.getName();

        assertEquals(studentExpected, studentTest);
    }
    @Test
    public void teacherGetNameTest() {
        Student student = new Student("Joanna Stachyra", new Teacher("Grzegorz Predki"));
        String teacherExpected = "Grzegorz Predki";
        String teacherTest = student.getTeacher().getName();

        assertEquals(teacherExpected, teacherTest);
    }
}