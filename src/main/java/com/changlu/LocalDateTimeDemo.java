package com.changlu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by changlu on 1/2/18.
 */
public class LocalDateTimeDemo {
    public void localDateTime(){
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime.now() = " + localDateTime);
        System.out.println("LocalDateTime.of(localDate,localTime) = " + LocalDateTime.of(localDate,localTime));
        System.out.println("LocalDateTime.of(2018,1,1,16,6,6) = " + LocalDateTime.of(2018,1,1,16,6,6));
        System.out.println("localDate.atTime(localTime) = " + localDate.atTime(localTime));
        System.out.println("localTime.atDate(localDate) = " + localTime.atDate(localDate));
        System.out.println("localDateTime.toLocalDate() = " + localDateTime.toLocalDate());
        System.out.println("localDateTime.toLocalTime() = " + localDateTime.toLocalTime());
    }
}
