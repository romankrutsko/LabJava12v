package com.company.AirPort;

import com.company.AirPort.exceptions.AirPortException;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputScanner() {
        System.out.println("Enter variant from 1 to 5");
        while (!scanner.hasNextInt()) {
            System.out.println("Please, enter int value");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static String inputDestination() {
        System.out.println("Enter destination, example: ternopil");
        while (!scanner.hasNext()) {
            System.out.println("Please, enter string value");
            scanner.next();
        }
        return scanner.next();
    }

    public static String inputDay() {
        System.out.println("Enter day of week, example: tuesday");
        while (!scanner.hasNext()) {
            System.out.println("Please, enter string value");
            scanner.next();
        }
        return scanner.next();
    }

    public static int inputHour() {
        System.out.println("Enter hour from 0 to 23");
        while (!scanner.hasNextInt()) {
            System.out.println("Please, enter int value");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static int inputMinute() {
        System.out.println("Enter minute from 0 to 59");
        while (!scanner.hasNextInt()) {
            System.out.println("Please, enter int value");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
