package com.kodilla.collections.adv.maps.homework;

import com.kodillla.collections.adv.maps.homework.School;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SchoolTestSuite {

    School school1 = new School(Arrays.asList(19, 20, 38, 40),  "Elementary School");
    School school2 = new School(Arrays.asList(21, 18, 25), "High School");

    @Test
    void getSumOfStudentsTest(){

       int actual = school1.getSumOfStudents();
        Assertions.assertEquals(117, actual);
    }
    @Test
    void getNameOdSchoolTest(){
        String actual = school2.getNameOfSchool();
        Assertions.assertEquals("High School", actual);
    }
}
