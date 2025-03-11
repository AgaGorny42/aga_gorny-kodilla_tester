package com.kodillla.collections.adv.exercises.homework;

import java.util.LinkedList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {

        List<Flight> flights = new LinkedList<>();
        flights.add(new Flight("Warsaw", "Copenhagen"));
        flights.add(new Flight("Warsaw", "Paris"));
        flights.add(new Flight("Warsaw", "Berlin"));
        flights.add(new Flight("Warsaw", "New York"));
        flights.add(new Flight("Copenhagen", "Warsaw"));
        flights.add(new Flight("Paris", "Warsaw"));
        flights.add(new Flight("Berlin", "Warsaw"));
        flights.add(new Flight("New York", "Warsaw"));
        flights.add(new Flight("Singapur", "Warsaw"));

        return flights;
    }
}
