package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherServiceTestSuite {

    WeatherService weatherService = new WeatherService();

    Person person = Mockito.mock(Person.class);
    Person secondPerson = Mockito.mock(Person.class);
    Person thirdPerson = Mockito.mock(Person.class);
    Person forthPerson = Mockito.mock(Person.class);
    Location location = Mockito.mock(Location.class);
    Location locationA = Mockito.mock(Location.class);
    Location locationB = Mockito.mock(Location.class);

    Alert weetherAlert = Mockito.mock(Alert.class);
    Alert generalAlert = Mockito.mock(Alert.class);

    @Test
    public void addPersonToLocationAndOnlyOnePersonToOneLocationTest(){

        weatherService.sendAlertsToEveryone(generalAlert);
        weatherService.sendAlertsToLocation(weetherAlert,location);
        Mockito.verify(person, Mockito.times(1)).receive(weetherAlert);
        Mockito.verify(secondPerson, Mockito.times(1)).receive(weetherAlert);
        Mockito.verify(person, Mockito.times(1)).receive(generalAlert);
        Mockito.verify(secondPerson, Mockito.times(1)).receive(generalAlert);

        weatherService.sendAlertsToLocation(weetherAlert, locationA);
        Mockito.verify(secondPerson, Mockito.times(2)).receive(weetherAlert);
        Mockito.verify(thirdPerson, Mockito.times(1)).receive(weetherAlert);
        Mockito.verify(secondPerson, Mockito.times(1)).receive(generalAlert);
        Mockito.verify(thirdPerson, Mockito.times(1)).receive(generalAlert);

        weatherService.sendAlertsToLocation(weetherAlert, locationB);
        Mockito.verify(forthPerson, Mockito.times(1)).receive(weetherAlert);
        Mockito.verify(forthPerson, Mockito.times(1)).receive(generalAlert);
    }
    @Test
    public void sendAlertsToPersonsFromSpecificLocationTest(){

        weatherService.sendAlertsToLocation(weetherAlert,location);
        Mockito.verify(person, Mockito.times(1)).receive(weetherAlert);
        Mockito.verify(secondPerson, Mockito.times(1)).receive(weetherAlert);
        Mockito.verify(person, Mockito.times(0)).receive(generalAlert);
        Mockito.verify(secondPerson, Mockito.times(0)).receive(generalAlert);

        weatherService.sendAlertsToLocation(weetherAlert, locationA);
        Mockito.verify(secondPerson, Mockito.times(2)).receive(weetherAlert);
        Mockito.verify(thirdPerson, Mockito.times(1)).receive(weetherAlert);
        Mockito.verify(secondPerson, Mockito.times(0)).receive(generalAlert);
        Mockito.verify(thirdPerson, Mockito.times(0)).receive(generalAlert);

        Mockito.verify(forthPerson, Mockito.never()).receive(weetherAlert);
        Mockito.verify(forthPerson, Mockito.never()).receive(generalAlert);
    }
    @Test
    public void sendAlertsToEveryoneTest (){
        weatherService.sendAlertsToLocation(weetherAlert, location);
        weatherService.sendAlertsToEveryone(generalAlert);
        Mockito.verify(person, Mockito.times(1)).receive(generalAlert);
        Mockito.verify(secondPerson, Mockito.times(1)).receive(generalAlert);
        Mockito.verify(thirdPerson, Mockito.times(1)).receive(generalAlert);
        Mockito.verify(forthPerson, Mockito.times(1)).receive(generalAlert);

        Mockito.verify(thirdPerson, Mockito.never()).receive(weetherAlert);
        Mockito.verify(forthPerson, Mockito.never()).receive(weetherAlert);

        Mockito.verify(person, Mockito.times(1)).receive(weetherAlert);
        Mockito.verify(secondPerson, Mockito.times(1)).receive(weetherAlert);
    }
    @Test
    public void deletePersonFromAllLocationsTest(){

        weatherService.deletePersonFromAllLocations(secondPerson);
        weatherService.sendAlertsToLocation(weetherAlert,location);
        weatherService.sendAlertsToLocation(weetherAlert, locationA);
        weatherService.sendAlertsToLocation(weetherAlert, locationB);
        weatherService.sendAlertsToEveryone(generalAlert);

        Mockito.verify(person, Mockito.times(1)).receive(weetherAlert);
        Mockito.verify(secondPerson, Mockito.never()).receive(weetherAlert);
        Mockito.verify(thirdPerson, Mockito.times(1)).receive(weetherAlert);
        Mockito.verify(forthPerson, Mockito.times(1)).receive(weetherAlert);
        Mockito.verify(person, Mockito.times(1)).receive(generalAlert);
        Mockito.verify(secondPerson, Mockito.never()).receive(generalAlert);
        Mockito.verify(thirdPerson, Mockito.times(1)).receive(generalAlert);
        Mockito.verify(forthPerson, Mockito.times(1)).receive(generalAlert);

    }
    @Test
    public void deleteLocationTest(){

        weatherService.deleteLocation(location);
        weatherService.sendAlertsToLocation(weetherAlert,location);
        weatherService.sendAlertsToEveryone(generalAlert);
        Mockito.verify(person, Mockito.never()).receive(weetherAlert);
        Mockito.verify(person, Mockito.times(0)).receive(weetherAlert);
        Mockito.verify(secondPerson, Mockito.times(0)).receive(weetherAlert);
        Mockito.verify(person, Mockito.never()).receive(generalAlert);
        Mockito.verify(secondPerson, Mockito.times(1)).receive(generalAlert);
    }
    @BeforeEach
    public void addPersons(){
        weatherService.addPersonToLocation(location, person);
        weatherService.addPersonToLocation(location, secondPerson);
        weatherService.addPersonToLocation(locationA, secondPerson);
        weatherService.addPersonToLocation(locationA, thirdPerson);
        weatherService.addPersonToLocation(locationB, forthPerson);
        weatherService.addPersonToLocation(locationB, forthPerson);
        weatherService.addPersonToLocation(locationB, forthPerson);
    }
}
