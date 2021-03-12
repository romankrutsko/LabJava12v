package com.company.AirPort;

import com.company.AirPort.exceptions.AirPortException;

import java.util.Date;

public class Sort {
    public AirPort[] getFlightsToDestination(AirPort[] array, String destination) {
        int count = 0;
        AirPort[] destinationSorted;
        for (AirPort airPort: array) {
            if (airPort.getDestination().equalsIgnoreCase(destination)) {
                count++;
            }
        }
        if (count == 0) {
            return null;
        }
        destinationSorted = new AirPort[count];
        count = 0;
        for (AirPort airPort:array) {
            if (airPort.getDestination().equalsIgnoreCase(destination)) {
                destinationSorted[count] = airPort;
                count++;
            }
        }
        return destinationSorted;
    }
    public AirPort[] getFlightToDay(AirPort[] list, String day) {
        AirPort[] daySorted;
        int count = 0;
        for (AirPort airPort : list) {
            if (day.toUpperCase().equals(airPort.getDayOfWeek().toString())) {
                count++;
            }
        }
        if (count == 0) {
            return null;
        }
        daySorted = new AirPort[count];
        count = 0;
        for (AirPort airPort : list) {
            if (day.toUpperCase().equals(airPort.getDayOfWeek().toString())) {
                daySorted[count] = airPort;
                count++;
            }
        }
        return daySorted;
    }
    public AirPort[] getFlightToDayAndHour(AirPort[] list, String day, int hours, int minutes) {
        AirPort[] dayAndHourSorted;
        int count = 0;

        for (AirPort airPort : list) {
            Date date = airPort.getDeparutreTime().getTime();
            date.setHours(hours);
            date.setMinutes(minutes);
            if (day.toUpperCase().equals(airPort.getDayOfWeek().toString()) && airPort.getDeparutreTime().getTime().after(date)) {
                count++;
            }
        }
        if (count == 0) {
            return null;
        }
        dayAndHourSorted = new AirPort[count];
        count = 0;
        for (AirPort airPort : list) {
            Date date = airPort.getDeparutreTime().getTime();
            date.setHours(hours);
            date.setMinutes(minutes);
            if (day.toUpperCase().equals(airPort.getDayOfWeek().toString()) && airPort.getDeparutreTime().getTime().after(date)) {
                dayAndHourSorted[count] = airPort;
                count++;
            }
        }
        return dayAndHourSorted;
    }
}
