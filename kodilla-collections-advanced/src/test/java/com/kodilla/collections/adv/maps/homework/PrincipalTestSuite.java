package com.kodilla.collections.adv.maps.homework;

import com.kodillla.collections.adv.maps.homework.Principal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrincipalTestSuite {

    Principal principal = new Principal("FirstNameTest", "LastNameTest");

    @Test
    void getFirstName(){
        String actual = principal.getFirstName();
        Assertions.assertEquals("FirstNameTest", actual);
    }
    @Test
    void getLastNameTest(){
        String actual = principal.getLastName();
        Assertions.assertEquals("LastNameTest", actual);
    }
}
