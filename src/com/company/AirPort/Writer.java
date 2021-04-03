package com.company.AirPort;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public void write(AirPort[] airPorts) throws IOException {
        File file = new File("C:\\Users\\user\\Desktop\\LabJava3.txt");
        boolean check = true;
        try {
            if (!file.exists()) {
                check = file.createNewFile();
                System.out.println("File created!");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        if (check) {
            FileWriter writer = new FileWriter(file);
            for (AirPort airPort : airPorts) {
                writer.write(airPort.getDestination() + "," + airPort.getFlightNumber() + "," + airPort.getPlaneType() + "," +
                        airPort.getDeparutreTime().getTime() + "," + airPort.getDayOfWeek() + "," + airPort.getPlaneNumber() + "\n");
            }
            System.out.println("Data written to file " + file.getName());
            writer.close();
        }
    }
}
