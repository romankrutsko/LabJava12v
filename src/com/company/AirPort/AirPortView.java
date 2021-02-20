package com.company.AirPort;

import java.util.List;

public class AirPortView {
    public void printAirPort(List<AirPort> list) {
        for (AirPort airPort : list) {
            System.out.println(airPort.toString());
        }
    }
}
