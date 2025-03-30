package com.kodilla.mockito.homework;

import java.util.*;

public class WeatherService {

    private Map<Location, Set<Person>> locations = new HashMap<>();
    private Set<Person> listOfAllPersons = new HashSet<>();

    public void addPersonToLocation(Location location, Person person) {
        Set<Person> listOfPersonsOfGivenLocation = locations.get(location);
        if (listOfPersonsOfGivenLocation == null) {
            Set<Person> persons = new HashSet<>();
            persons.add(person);
            listOfAllPersons.add(person);
            locations.put(location, persons);
        } else {
            listOfPersonsOfGivenLocation.add(person);
            listOfAllPersons.add(person);
        }
    }
    public void sendAlertsToLocation(Alert alert, Location location) {
        Set<Person> listOfPersonsOfGivenLocation = locations.get(location);

        if(listOfPersonsOfGivenLocation != null) {
            listOfPersonsOfGivenLocation
                    .stream()
                    .forEach(p -> p.receive(alert));
        }
    }
    public void sendAlertsToEveryone(Alert alert) {
        listOfAllPersons
                .stream().forEach(p-> p.receive(alert));
    }
    public void deletePersonFromLocation(Person person){
        locations
                .entrySet()
                .stream()
                .forEach(x-> x.getValue().remove(person));

        boolean personExists = false;
        //check if person exists in another location
        for(Map.Entry<Location, Set<Person>> location : locations.entrySet()) {
           personExists = location.getValue().contains(person);
           if (personExists == true) {
               break;
           }
        }
        //remove person from general list if does not exist in other location.
        if(personExists == false) {
            listOfAllPersons.remove(person);
        }
    }
    public void deleteLocation(Location location){
//        Set<Person> persons = locations.get(location);
        locations.remove(location);
        listOfAllPersons.clear();
        locations.entrySet()
                .stream()
                .forEach(l-> listOfAllPersons.addAll(l.getValue()));


    }
    public void deletePersonFromAllLocations(Person person){
        listOfAllPersons.remove(person);
        locations
                .entrySet()
                .stream()
                .forEach(x-> x.getValue().remove(person));
    }
}
