package com.company.AirPort;

import java.util.List;

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

    public void emptyMessage() {
        System.out.println("No data");
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
