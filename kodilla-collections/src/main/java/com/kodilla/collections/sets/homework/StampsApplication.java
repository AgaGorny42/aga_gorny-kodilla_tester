package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();

        stamps.add(new Stamp("Aviation", 5, 3, true));
        stamps.add(new Stamp("postal", 4, 4, false ));
        stamps.add(new Stamp("personalized", 5, 5, false));
        stamps.add(new Stamp("Aviation", 5, 3, true));
        stamps.add(new Stamp("postal", 4, 4, false ));

        System.out.println("Size of list: " + stamps.size());
        for(Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
