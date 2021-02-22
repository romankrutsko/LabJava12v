package com.company.AirPort;

public class AirPortController {

    public void proceedProgram(DataForController data, Sort sort) {
        AirPort[] array = data.init.init(data.airPorts);
        while (data.check !=5 && data.check >= 0 && data.check <= 5) {
            data.airPortView.defaultMessages();
            data.check = Input.inputScanner();
            switch (data.check) {
                case 1: {
                    String destination = Input.inputDestination();
                    AirPort[] arrayAirPort = sort.getFlightsToDestination(array, destination);
                    data.airPortView.printAirPort(arrayAirPort);
                    break;
                }
                case 2: {
                    String day = Input.inputDay();
                    AirPort[] daySorted = sort.getFlightToDay(array, day);
                    data.airPortView.printAirPort(daySorted);
                    break;
                }
                case 3: {
                    String day = Input.inputDay();
                    int hour = Input.inputHour();
                    int minute = Input.inputMinute();
                    AirPort[] dayAndHourSorted = sort.getFlightToDayAndHour(array, day, hour, minute);
                    data.airPortView.printAirPort(dayAndHourSorted);
                    break;
                }
                case 4: {
                    data.airPortView.printAirPort(array);
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
