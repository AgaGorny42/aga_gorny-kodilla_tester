package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.*;

public class ForumStats {
    public static void main(String[] args) {

        Double result1 = ForumStats.getAverageOfPostsForUsersOverEqualFortyYearsOld(UsersRepository.getUsersList());
        System.out.println(result1);
        Double result2 = ForumStats.getAverageOfPostForUsersLessThenFortyYearsOld(UsersRepository.getUsersList());
        System.out.println(result2);
    }
    public static Double getAverageOfPostsForUsersOverEqualFortyYearsOld(List<User> users) {
        if(users.isEmpty()){
            return 0.0;}
        try{
        Double userPosts = users
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .getAsDouble();

        return userPosts;

        } catch (NoSuchElementException e) {
            return 0.0;
        }
    }
    public static Double getAverageOfPostForUsersLessThenFortyYearsOld(List<User> users) {
        if(users.isEmpty()){
            return 0.0;}
        try {
            Double userPost2 = users
                    .stream()
                    .filter(user -> user.getAge() < 40)
                    .mapToInt(User::getNumberOfPost)
                    .average()
                    .getAsDouble();

            return userPost2;

        } catch (NoSuchElementException e) {
            return 0.0;
        }
    }
}

