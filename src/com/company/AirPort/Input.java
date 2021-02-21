package com.company.AirPort;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputScanner() {
        System.out.println("Enter variant");
        while (!scanner.hasNextInt()) {
            System.out.println("Please, enter int value");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static String inputDestination() {
        System.out.println("Enter destination");
        while (!scanner.hasNext()) {
            System.out.println("Please, enter string value");
            scanner.next();
        }
        return scanner.next();
    }

    public static String inputDay() {
        System.out.println("Enter day of week");
        while (!scanner.hasNext()) {
            System.out.println("Please, enter string value");
            scanner.next();
        }
        return scanner.next();
    }

    public int inputHour() {
        System.out.println("Enter hour");
        while (!scanner.hasNextInt()) {
            System.out.println("Please, enter int value");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public int inputMinute() {
        System.out.println("Enter minute");
        while (!scanner.hasNextInt()) {
            System.out.println("Please, enter int value");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
