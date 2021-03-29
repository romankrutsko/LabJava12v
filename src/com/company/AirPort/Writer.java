package com.company.AirPort;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public void write(AirPort[] airPorts) throws IOException {
        FileWriter writer = new FileWriter("C:\\Users\\user\\Desktop\\LabJava3.txt");
        for (AirPort airPort : airPorts) {
            writer.write(airPort.getDestination() + "," + airPort.getFlightNumber() + "," + airPort.getPlaneType() + "," +
                    airPort.getDeparutreTime().getTime() + "," + airPort.getDayOfWeek() + "," + airPort.getPlaneNumber() + "\n");
        }
        writer.close();
    }
}
