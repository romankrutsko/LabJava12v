package com.company.AirPort;

import java.util.Calendar;
import java.util.Date;

public class AirPort {
    private String destination;
    private String flightNumber;
    private PlaneType planeType;
    private Calendar deparutreTime;
    private DayOfWeek dayOfWeek;
    private String planeNumber;

    public AirPort(String destination, String flightNumber, PlaneType planeType, Calendar deparutreTime, DayOfWeek dayOfWeek, String planeNumber) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.planeType = planeType;
        this.deparutreTime = deparutreTime;
        this.dayOfWeek = dayOfWeek;
        this.planeNumber = planeNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public void setPlaneType(PlaneType planeType) {
        this.planeType = planeType;
    }

    public Calendar getDeparutreTime() {
        return deparutreTime;
    }

    public void setDeparutreTime(Calendar deparutreTime) {
        this.deparutreTime = deparutreTime;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getPlaneNumber() {
        return planeNumber;
    }

    public void setPlaneNumber(String planeNumber) {
        this.planeNumber = planeNumber;
    }

    @Override
    public String toString() {
        return "Airport: " +
                "destination: " + destination +
                ", departure time: " + deparutreTime.toString() +
                ", day: " + dayOfWeek.toString();

    }

}
