package com.company.AirPort.validator;

import com.company.AirPort.AirPortView;

public class Validator {

    public boolean validateVariant(int check) {
        if (check < 0 || check > 5) {
            AirPortView view = new AirPortView();
            view.invalidValidationMessage();
            return false;
        }
        return true;
    }

    public boolean validateString(String destination) {
        if (!destination.matches("\\D*")) {
            AirPortView view = new AirPortView();
            view.invalidStringMessage();
            return false;
        }
        return true;
    }

    public boolean validateHour(int hour) {
        if (hour < 0 || hour > 23) {
            AirPortView view = new AirPortView();
            view.invalidHourMessage();
            return false;
        }
        return true;
    }

    public boolean validateMinute(int minute) {
        if (minute < 0 || minute > 59) {
            AirPortView view = new AirPortView();
            view.invalidMinuteMessage();
            return false;
        }
        return true;
    }
}
