package com.company.AirPort;

public class AirPortView {
    public void printAirPort(AirPort[] array) {
        if (array == null) {
            emptyMessage();
            return;
        }
        for (AirPort airPort : array) {
            System.out.println(airPort.toString());
        }
    }

    public void invalidValidationMessage() {
        System.out.println("Invalid variant, enter number from 1 to 5");
    }

    public void invalidHourMessage() {
        System.out.println("Invalid hour range, enter number from 0 to 24");
    }

    public void invalidMinuteMessage() {
        System.out.println("Invalid minute range, enter number from 0 to 60");
    }

    public void invalidStringMessage() {
        System.out.println("Invalid entered value, enter string value");
    }

    public void emptyMessage() {
        System.out.println("No data for given info");
    }

    public void defaultMessages() {
        System.out.println();
        System.out.println("Choose one variant");
        System.out.println("1 - Get flights to certain destination");
        System.out.println("2 - Get flights on certain day");
        System.out.println("3 - Get flights on certain day and after certain hour");
        System.out.println("4 - Get flights info");
        System.out.println("5 - End");
    }
}
