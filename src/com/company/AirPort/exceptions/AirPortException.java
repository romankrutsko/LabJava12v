package com.company.AirPort.exceptions;

public class AirPortException extends RuntimeException{

    public AirPortException(Error error) {
        super(error.getMessage());
    }

    public enum Error {
        INVALID_VARIANT("Invalid variant"),
        INVALID_STRING("Invalid string value"),
        INVALID_HOUR("Invalid hour"),
        INVALID_MINUTE("Invalid minute");

        private String message;

        Error(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

}
