package com.company.AirPort.validator;

import com.company.AirPort.AirPortView;
import com.company.AirPort.exceptions.AirPortException;

public class Validator {

    private static final AirPortView view = new AirPortView();

    public boolean validateVariant(int check) {
        try {
            if (check < 0 || check > 5) {
                throw new AirPortException(AirPortException.Error.INVALID_VARIANT);
            }
        } catch (AirPortException e) {
            view.invalidValidationMessage();
            return false;
        }
        return true;
    }

    public boolean validateString(String string) {
        try {
            if (!string.matches("\\D*")) {
                throw new AirPortException(AirPortException.Error.INVALID_STRING);
            }
        } catch (AirPortException e) {
            view.invalidStringMessage();
            return false;
        }
        return true;
    }

    public boolean validateHour(int hour) {
        try {
            if (hour < 0 || hour > 23) {
                throw new AirPortException(AirPortException.Error.INVALID_HOUR);
            }
        } catch (AirPortException e) {
            view.invalidHourMessage();
            return false;
        }
        return true;
    }

    public boolean validateMinute(int minute) {
        try {
            if (minute < 0 || minute > 59) {
                throw new AirPortException(AirPortException.Error.INVALID_MINUTE);
            }
        } catch (AirPortException e) {
            view.invalidMinuteMessage();
            return false;
        }
        return true;
    }
}
