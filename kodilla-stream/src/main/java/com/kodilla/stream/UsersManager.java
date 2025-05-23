package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);

        List<Integer> userOlderForty = getUsersAgeOverForty();
        System.out.println(userOlderForty);

        List<String> groupName = UserNameOfGroup();
        System.out.println(groupName);
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());                      // [2]

        return usernames;
    }
    public static String getUserName(User user) {
        return user.getUsername();
    }

    public static List<Integer> getUsersAgeOverForty () {
        int age = 40;
        List<Integer> userAge = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .map(UsersManager ::getUserAge)
                .collect(Collectors.toList());

        return userAge;
    }
    public static int getUserAge(User user) {return user.getAge();}

    public static List<String> UserNameOfGroup () {
        List<String> userGroup = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() == 4648)
                .map(UsersManager ::getUserGroup)
                .collect(Collectors.toList());

        return userGroup;
    }
    public static String getUserGroup(User user) {return user.getGroup();}
}


