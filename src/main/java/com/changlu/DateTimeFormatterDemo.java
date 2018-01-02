package com.changlu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by changlu on 1/2/18.
 */
public class DateTimeFormatterDemo {
    public void dateTimeFormatter(){
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate.format(DateTimeFormatter.BASIC_ISO_DATE) = " + localDate.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println("localDate.format(DateTimeFormatter.ISO_LOCAL_DATE) = " + localDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println("LocalDate.parse(\"2018-01-02\",DateTimeFormatter.ISO_LOCAL_DATE) = " + LocalDate.parse("2018-01-02", DateTimeFormatter.ISO_LOCAL_DATE));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("localDate.format(dateTimeFormatter) = " + localDate.format(dateTimeFormatter));
        System.out.println("LocalDate.parse(\"2018-01-02\",dateTimeFormatter) = " + LocalDate.parse("2018-01-02", dateTimeFormatter));
        LocalDateTime localDateTime = LocalDateTime.now();
        dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        System.out.println("localDateTime.format(dateTimeFormatter) = " + localDateTime.format(dateTimeFormatter));
    }
}
