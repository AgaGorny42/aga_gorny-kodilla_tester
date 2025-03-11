
import com.kodillla.collections.adv.exercises.homework.Flight;
import com.kodillla.collections.adv.exercises.homework.FlightFinder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.List;

public class FlightFinderTestSuite {

    @Test
    public void findFlightsFrom () {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightsFromWaw = flightFinder.findFlightsFrom("Warsaw");

        assertEquals(4,  flightsFromWaw.size());

        List<Flight> expected = new LinkedList<>();

        assertEquals(0, 0);

        expected.add(new Flight("Warsaw", "Copenhagen"));
        expected.add(new Flight("Warsaw", "Paris"));
        expected.add(new Flight("Warsaw", "Berlin"));
        expected.add(new Flight("Warsaw", "New York"));

        assertEquals(expected, flightsFromWaw);

    }
    @Test
    public void findFlightsTo () {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightsToWaw = flightFinder.findFlightsTo("Warsaw");

        assertEquals(5, flightsToWaw.size());

        List<Flight> expected = new LinkedList<>();

        assertEquals(0, 0);

        expected.add(new Flight("Copenhagen", "Warsaw"));
        expected.add(new Flight("Paris", "Warsaw"));
        expected.add(new Flight("Berlin", "Warsaw"));
        expected.add(new Flight("New York", "Warsaw"));
        expected.add(new Flight("Singapur", "Warsaw"));

        assertEquals(expected, flightsToWaw);

    }
}

