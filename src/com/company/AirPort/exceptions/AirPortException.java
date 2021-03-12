package com.company.AirPort.exceptions;

public class AirPortException extends RuntimeException{

    public AirPortException(Error error) {
        super(error.getMessage());
    }

    public enum Error {
        INVALID_VARIANT("Invalid variant");

        private String message;

        Error(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

}
