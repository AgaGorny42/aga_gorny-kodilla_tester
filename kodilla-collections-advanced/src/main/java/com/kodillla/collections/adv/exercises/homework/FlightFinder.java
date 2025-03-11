package com.kodillla.collections.adv.exercises.homework;
import java.util.LinkedList;
import java.util.List;

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> listAll = FlightRepository.getFlightsTable();
        List<Flight> listFrom = new LinkedList<>();
        for (Flight flight : listAll) {
            if(departure.equals(flight.getDeparture()))
                listFrom.add(flight);
            }
            return listFrom;
    }
    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> listAll = FlightRepository.getFlightsTable();
        List<Flight> listTo = new LinkedList<>();
            for(Flight flight : listAll) {
                if(arrival.equals(flight.getArrival()))
                    listTo.add(flight);
            }
        return listTo;
    }

}
