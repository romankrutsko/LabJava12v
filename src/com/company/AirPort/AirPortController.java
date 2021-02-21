package com.company.AirPort;

import java.util.*;

public class AirPortController {

    private int check = 0;
    public AirPortView airPortView = new AirPortView();
    private Input input = new Input();
    private Init init = new Init();
    private List<AirPort> list = new ArrayList<>();
    public void proceedProgram() {
        init.init(list);
        while (check !=5 && check >= 0 && check <= 5) {
            airPortView.defaultMessages();
            check = input.inputScanner();
            switch (check) {
                case 1: {
                    String destination = input.inputDestination();
                    List<AirPort> destinationSorted = getFlightsToDestination(list, destination);
                    airPortView.printAirPort(destinationSorted);
                    check = 0;
                    break;
                }
                case 2: {
                    String day = input.inputDay();
                    List<AirPort> daySorted = getFlightToDay(list, day);
                    airPortView.printAirPort(daySorted);
                    check = 0;
                    break;
                }
                case 3: {
                    String day = Input.inputDay();
                    int hour = input.inputHour();
                    int minute = input.inputMinute();
                    List<AirPort> dayAndHourSorted = getFlightToDayAndHour(list, day, hour, minute);
                    airPortView.printAirPort(dayAndHourSorted);
                    check = 0;
                    break;
                }
                case 4: {
                    airPortView.printAirPort(list);
                    break;
                }
                case 5: {
                    System.out.println("The end!");
                    break;
                }
            }
        }

    }

    private List<AirPort> getFlightsToDestination(List<AirPort> list, String destination) {
        List<AirPort> destinationSorted = new ArrayList<>();
        for (AirPort airPort : list) {
            if (airPort.getDestination().equals(destination)) {
                destinationSorted.add(airPort);
            }
        }
        return destinationSorted;
    }

    private List<AirPort> getFlightToDay(List<AirPort> list, String day) {
        List<AirPort> daySorted = new ArrayList<>();

        for (AirPort airPort : list) {
            if (day.toUpperCase().equals(airPort.getDayOfWeek().toString())) {
                daySorted.add(airPort);
            }
        }
        return daySorted;
    }

    private List<AirPort> getFlightToDayAndHour(List<AirPort> list, String day, int hours, int minutes) {
        List<AirPort> dayAndHourSorted = new ArrayList<>();

        for (AirPort airPort : list) {
            Date date = airPort.getDeparutreTime().getTime();
            date.setHours(hours);
            date.setMinutes(minutes);
            if (day.toUpperCase().equals(airPort.getDayOfWeek().toString()) && airPort.getDeparutreTime().getTime().after(date)) {
                dayAndHourSorted.add(airPort);
            }
        }
        return dayAndHourSorted;
    }
}
