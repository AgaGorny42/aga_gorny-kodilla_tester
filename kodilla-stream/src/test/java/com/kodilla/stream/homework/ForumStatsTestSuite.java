package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {

    @Test
    public void newTestCollection() {

        List<User> users = new ArrayList<>();
        users.add(new User("", 40, 9, ""));
        users.add(new User("", 41, 15, ""));
        users.add(new User("", 60, 5, ""));
        users.add(new User("", 39, 1, ""));
        users.add(new User("", 18, 30, ""));
        users.add(new User("", 19, 0, ""));
        users.add(new User("", 57, 0, ""));

        assertEquals(7, users.size());

        double averageOverForty = ForumStats.getAverageOfPostsForUsersOverEqualFortyYearsOld(users);
        double averageLessForty = ForumStats.getAverageOfPostForUsersLessThenFortyYearsOld(users);

        assertEquals(7.25, averageOverForty, 0.01);
        assertEquals(10.33, averageLessForty, 0.01);
    }
    @Test
    public void noUsersLessFortyTest() {
        //When
        List<User> users = new ArrayList<>();
            users.add(new User("", 40, 0, ""));
            users.add(new User("", 40, 0, ""));
            users.add(new User("", 45, 0, ""));
            users.add(new User("", 45, 0, ""));

            double averageLessForty = ForumStats.getAverageOfPostForUsersLessThenFortyYearsOld(users);
        //Then
        assertEquals(0.0, averageLessForty, 0.00);
    }
    @Test
    public void noUsersOverFortyTest () {
        //When
        List<User> users = new ArrayList<>();
        users.add(new User("", 35, 0, ""));
        users.add(new User("", 35, 0, ""));
        users.add(new User("", 26, 0, ""));
        users.add(new User("", 31, 0, ""));

        double averageOverForty = ForumStats.getAverageOfPostsForUsersOverEqualFortyYearsOld(users);
        //Then
        assertEquals(0.0, averageOverForty, 0.00);
    }
    @Test
    public void whenEmptyListTest () {
        //When
        List<User> users = new ArrayList<>();
        double averageOverForty = ForumStats.getAverageOfPostsForUsersOverEqualFortyYearsOld(users);
        double averageLessForty = ForumStats.getAverageOfPostForUsersLessThenFortyYearsOld(users);
        //Then
        assertEquals(0.0, averageOverForty, 0.00);
        assertEquals(0.0, averageLessForty, 0.00);
    }
}


