package com.company.AirPort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Reader {
    public AirPort[] readToInit() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\ReadInit.txt"));
        AirPort[] airPorts = new AirPort[10];
        String in;
        int i = 0;
        while ((in = bufferedReader.readLine()) != null) {
            String[] words = in.split(",");

            AirPort airPort = new AirPort(words[0], words[1], planeType(words[2]), time(words[3]), dayOfWeek(words[4]), words[5]);
            airPorts[i] = airPort;
            i++;
        }
        return airPorts;
    }

    private PlaneType planeType(String input) {
        if (input.equals("CIVIL")) {
            return PlaneType.CIVIL;
        } else if (input.equals("WAR")) {
            return PlaneType.WAR;
        }
        return PlaneType.PRIVATE;
    }

    private DayOfWeek dayOfWeek(String input) {
        switch (input) {
            case ("MONDAY"): {
                return DayOfWeek.MONDAY;
            }
            case ("TUESDAY"): {
                return DayOfWeek.TUESDAY;
            }
            case ("WEDNESDAY"): {
                return DayOfWeek.WEDNESDAY;
            }
            case ("THURSDAY"): {
                return DayOfWeek.THURSDAY;
            }
            case ("FRIDAY"): {
                return DayOfWeek.FRIDAY;
            }
            case ("SATURDAY"): {
                return DayOfWeek.SATURDAY;
            }
        }
        return DayOfWeek.SUNDAY;
    }

    private GregorianCalendar time(String input) {
        String[] words = input.split(" ");
        int year = Integer.parseInt(words[5]);
        int month = month(words[1]);
        int day = Integer.parseInt(words[2]);
        int hour = hour(words[3]);
        int minute = minute(words[3]);
        return new GregorianCalendar(year, month, day, hour, minute);
    }

    private int month(String input) {
        switch (input) {
            case ("Jan"):
                return Calendar.JANUARY;
            case ("Feb"):
                return Calendar.FEBRUARY;
            case ("Mar"):
                return Calendar.MARCH;
            case ("Apr"):
                return Calendar.APRIL;
        }
        return 0;
    }

    private int hour(String input) {
        String[] strings = input.split(":");
        return Integer.parseInt(strings[0]);
    }

    private int minute(String input) {
        String[] strings = input.split(":");
        return Integer.parseInt(strings[1]);
    }
}
