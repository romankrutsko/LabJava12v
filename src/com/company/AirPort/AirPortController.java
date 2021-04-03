package com.company.AirPort;

import java.io.IOException;

public class AirPortController {

    public void proceedProgram(DataForController data, Sort sort) throws IOException {
        String yesNoRead = Input.inputReader();
        AirPort[] array = data.initFile(yesNoRead);
        while (data.check !=5 && data.check >= 0 && data.check <= 5) {
            data.airPortView.defaultMessages();
            data.check = Input.inputScanner();
            while (!data.validator.validateVariant(data.check)) {
                data.check = Input.inputScanner();
            }
            switch (data.check) {
                case 1: {
                    String destination = Input.inputDestination();
                    while (!data.validator.validateString(destination)) {
                        destination = Input.inputDestination();
                    }
                    AirPort[] arrayAirPort = sort.getFlightsToDestination(array, destination);
                    data.airPortView.printAirPort(arrayAirPort);
                    String yesNo = Input.inputString();
                    if (yesNo.equals("y")) {
                        data.writer.write(arrayAirPort);
                    }
                    break;
                }
                case 2: {
                    String day = Input.inputDay();
                    while (!data.validator.validateString(day)) {
                        day = Input.inputDay();
                    }
                    AirPort[] daySorted = sort.getFlightToDay(array, day);
                    data.airPortView.printAirPort(daySorted);
                    String yesNo = Input.inputString();
                    if (yesNo.equals("y")) {
                        data.writer.write(daySorted);
                    }
                    break;
                }
                case 3: {
                    String day = Input.inputDay();
                    while (!data.validator.validateString(day)) {
                        day = Input.inputDay();
                    }
                    int hour = Input.inputHour();
                    while (!data.validator.validateHour(hour)) {
                        hour = Input.inputHour();
                    }
                    int minute = Input.inputMinute();
                    while (!data.validator.validateMinute(minute)) {
                        minute = Input.inputMinute();
                    }
                    AirPort[] dayAndHourSorted = sort.getFlightToDayAndHour(array, day, hour, minute);
                    data.airPortView.printAirPort(dayAndHourSorted);
                    String yesNo = Input.inputString();
                    if (yesNo.equals("y")) {
                        data.writer.write(dayAndHourSorted);
                    }
                    break;
                }
                case 4: {
                    data.airPortView.printAirPort(array);
                    String yesNo = Input.inputString();
                    if (yesNo.equals("y")) {
                        data.writer.write(array);
                    }
                    break;
                }
                case 5: {
                    System.out.println("The end!");
                    break;
                }
            }
        }
    }
}
