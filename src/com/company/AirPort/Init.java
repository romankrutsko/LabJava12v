package com.company.AirPort;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Init {
    public AirPort[] init(AirPort[] array) {
        Calendar calendar = new GregorianCalendar(2021, Calendar.JANUARY, 12,12, 15);
        AirPort airPortTernopil = new AirPort("Ternopil", "1", PlaneType.CIVIL, calendar, DayOfWeek.TUESDAY, "11111");

        calendar = new GregorianCalendar(2021, Calendar.JANUARY, 23, 14, 30);
        AirPort airPortKyiv = new AirPort("Kyiv", "2", PlaneType.CIVIL, calendar, DayOfWeek.SATURDAY, "22222");

        calendar = new GregorianCalendar(2021, Calendar.JANUARY, 16, 16, 30);
        AirPort airPortWarsaw = new AirPort("Warsaw", "3", PlaneType.WAR, calendar, DayOfWeek.SATURDAY, "33333");

        calendar = new GregorianCalendar(2021, Calendar.JANUARY, 16, 16, 30);
        AirPort airPortTernopil2 = new AirPort("Ternopil", "4", PlaneType.PRIVATE, calendar, DayOfWeek.TUESDAY, "44444");

        calendar = new GregorianCalendar(2021, Calendar.FEBRUARY, 10, 12, 30);
        AirPort airPortLviv = new AirPort("Lviv", "5", PlaneType.CIVIL, calendar, DayOfWeek.WEDNESDAY, "55555");

        calendar = new GregorianCalendar(2021, Calendar.FEBRUARY, 12, 10, 30);
        AirPort airPortDonetsk = new AirPort("Donetsk", "6", PlaneType.WAR, calendar, DayOfWeek.FRIDAY, "66666");

        calendar = new GregorianCalendar(2021, Calendar.FEBRUARY, 2, 11, 30);
        AirPort airPortOdessa = new AirPort("Odessa", "7", PlaneType.CIVIL, calendar, DayOfWeek.TUESDAY, "77777");

        calendar = new GregorianCalendar(2021, Calendar.FEBRUARY, 24, 16, 30);
        AirPort airPortLondon = new AirPort("London", "8", PlaneType.PRIVATE, calendar, DayOfWeek.WEDNESDAY, "88888");

        calendar = new GregorianCalendar(2021, Calendar.FEBRUARY, 12, 15, 30);
        AirPort airPortBerlin = new AirPort("Berlin", "9", PlaneType.CIVIL, calendar, DayOfWeek.FRIDAY, "99999");

        calendar = new GregorianCalendar(2021, Calendar.JANUARY, 21, 10, 30);
        AirPort airPortParis = new AirPort("Paris", "10", PlaneType.WAR, calendar, DayOfWeek.THURSDAY, "1010");

        return new AirPort[] {
                airPortTernopil, airPortKyiv, airPortWarsaw, airPortTernopil2, airPortLviv, airPortDonetsk, airPortOdessa,airPortLondon, airPortBerlin, airPortParis
        };
    }
}
