package ru.netology.comparator;

import ru.netology.domain.Flight;

import java.util.Comparator;

public class FlightByTimeAscComparator implements Comparator<Flight> {

    @Override
    public int compare(Flight o1, Flight o2) {
        return o1.getFlightTime() - o2.getFlightTime();
    }
}
