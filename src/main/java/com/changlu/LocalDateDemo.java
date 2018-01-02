package com.changlu;

import java.time.LocalDate;
import java.time.temporal.*;
import java.util.Arrays;

import static java.time.temporal.ChronoField.MONTH_OF_YEAR;

/**
 * Created by changlu on 1/2/18.
 */
public class LocalDateDemo {
    /**
     *
     */
   public void localDate(){
       LocalDate localDate = LocalDate.of(2018, 2, 1);
       System.out.println("LocalDate.now() = "+localDate);
       System.out.println("LocalDate.of(2018,2,1) = " + LocalDate.of(2018, 2, 1));
       System.out.println("localDate.getYear() = " + localDate.getYear());
       System.out.println("localDate.getMonth() = " + localDate.getMonth());
       System.out.println("localDate.getDayOfYear() = " + localDate.getDayOfYear());
       System.out.println("localDate.getDayOfMonth() = " + localDate.getDayOfMonth());
       System.out.println("localDate.getDayOfWeek() = " + localDate.getDayOfWeek());
       System.out.println("localDate.getEra() = " + localDate.getEra());
       System.out.println("localDate.lengthOfYear() = " + localDate.lengthOfYear());
       System.out.println("localDate.lengthOfMonth() = " + localDate.lengthOfMonth());
       System.out.println("localDate.isLeapYear() = " + localDate.isLeapYear());
       System.out.println("localDate.get(ChronoField.YEAR) = " + localDate.get(ChronoField.YEAR));
       System.out.println("localDate.get(ChronoField.YEAR_OF_ERA) = " + localDate.get(ChronoField.YEAR_OF_ERA));
       System.out.println("localDate.get(ChronoField.MONTH_OF_YEAR) = " + localDate.get(MONTH_OF_YEAR));
       System.out.println("LocalDate.parse(\"2018-01-01\") = " + LocalDate.parse("2018-01-01"));
       /**
        * immutable
        * return a new instance every time
        */
       System.out.println("localDate.withYear(2009) = " + localDate.withYear(2009));
       System.out.println("localDate.withMonth(6) = " + localDate.withMonth(6));
       System.out.println("localDate.with(ChronoField.YEAR,1991) = " + localDate.with(ChronoField.YEAR, 1991));
       System.out.println("localDate.plusMonths(12) = " + localDate.plusMonths(12));
       System.out.println("localDate.minusMonths(12) = " + localDate.minusMonths(12));
       System.out.println("localDate.plusMonths(-12) = " + localDate.plusMonths(-12));
       System.out.println("localDate.plus(12, ChronoUnit.MONTHS) = " + localDate.plus(12, ChronoUnit.MONTHS));
       System.out.println("localDate.plus(-12, ChronoUnit.MONTHS) = " + localDate.plus(-12, ChronoUnit.MONTHS));
       System.out.println("localDate.minus(12,ChronoUnit.MONTHS) = " + localDate.minus(12, ChronoUnit.MONTHS));
       System.out.println("localDate.with(TemporalAdjusters.lastDayOfMonth() = " + localDate.with(TemporalAdjusters.lastDayOfMonth()));
   }

}
