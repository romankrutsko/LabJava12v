package com.company;

import com.company.AirPort.AirPort;
import com.company.AirPort.AirPortView;
import com.company.AirPort.DayOfWeek;
import com.company.AirPort.PlaneType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        AirPortView view = new AirPortView();

        Calendar calendar = new GregorianCalendar(2021, Calendar.JANUARY, 12,12, 15);
        Date date = calendar.getTime();
        AirPort airPortTernopil = new AirPort("Ternopil", "1", PlaneType.CIVIL, calendar, DayOfWeek.TUESDAY, "11111");

        calendar = new GregorianCalendar(2021, Calendar.JANUARY, 23, 14, 30);
        date = calendar.getTime();
        AirPort airPortKyiv = new AirPort("Kyiv", "2", PlaneType.CIVIL, calendar, DayOfWeek.SATURDAY, "22222");

        calendar = new GregorianCalendar(2021, Calendar.JANUARY, 16, 16, 30);
        date = calendar.getTime();
        AirPort airPortWarsaw = new AirPort("Warsaw", "3", PlaneType.WAR, calendar, DayOfWeek.SATURDAY, "33333");

        calendar = new GregorianCalendar(2021, Calendar.JANUARY, 16, 16, 30);
        AirPort airPortTernopil2 = new AirPort("Ternopil", "4", PlaneType.PRIVATE, calendar, DayOfWeek.TUESDAY, "11111");

        List<AirPort> list = new ArrayList<>();
        list.add(airPortTernopil);
        list.add(airPortKyiv);
        list.add(airPortWarsaw);
        list.add(airPortTernopil2);


        List<AirPort> destinationSorted = getFlightsToDestination(list, "Ternopil");
//        view.printAirPort(destinationSorted);
        List<AirPort> daySorted = getFlightToDay(list, "Saturday");
        view.printAirPort(daySorted);
        List<AirPort> dayAndHourSorted = getFlightToDayAndHour(list, "Tuesday", "15", "30");
    }
    static List<AirPort> getFlightsToDestination(List<AirPort> list, String destination) {
        List<AirPort> destinationSorted = new ArrayList<>();
        for (AirPort airPort : list) {
            if (airPort.getDestination().equals(destination)) {
                destinationSorted.add(airPort);
            }
        }
        return destinationSorted;
    }

    static List<AirPort> getFlightToDay(List<AirPort> list, String day) {
        List<AirPort> daySorted = new ArrayList<>();
        
        for (AirPort airPort : list) {
            if (day.toUpperCase().equals(airPort.getDayOfWeek().toString())) {
                daySorted.add(airPort);
            }
        }
        return daySorted;
    }

    static List<AirPort> getFlightToDayAndHour(List<AirPort> list, String day, String hours, String minutes) {
        List<AirPort> dayAndHourSorted = new ArrayList<>();

        for (AirPort airPort : list) {
            Calendar calendarToChange = airPort.getDeparutreTime();
            calendarToChange.set(Calendar.HOUR_OF_DAY, Integer.valueOf(hours));
            calendarToChange.set(Calendar.MINUTE, Integer.valueOf(minutes));
            if (day.toUpperCase().equals(airPort.getDayOfWeek().toString()) && airPort.getDeparutreTime().after(calendarToChange)) {
                dayAndHourSorted.add(airPort);
            }
        }
        return dayAndHourSorted;
    }
}
