package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;


class UsersManagerTestSuite {

    @Test
    public void filterChemistGroupUsernamesTest() {
        List<String> chemistGroupUsernames = UsersManager.filterChemistGroupUsernames();

        assertEquals(2, chemistGroupUsernames.size());

        List<String> names = new ArrayList<>();
        names.add("Walter White");
        names.add("Gale Boetticher");

        assertEquals(names, chemistGroupUsernames);
    }

    @Test
    public void getUsersAgeOverFortyTest() {
        List<Integer> ageOverFortyGroup = UsersManager.getUsersAgeOverForty();

        assertEquals(4, ageOverFortyGroup.size());

        List<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(49);
        numbers.add(44);
        numbers.add(57);

        assertEquals(numbers, ageOverFortyGroup);
    }
    @Test
    public void UserNameOfGroupTest () {
        List<String> group = UsersManager.UserNameOfGroup();
        assertEquals(1, group.size());

        List<String> toTestGroup = new ArrayList<>();
        toTestGroup.add("Sales");

        assertEquals(toTestGroup, group);
    }

}