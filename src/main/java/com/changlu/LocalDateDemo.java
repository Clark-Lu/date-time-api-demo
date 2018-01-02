package com.changlu;

import java.time.LocalDate;
import java.util.Arrays;

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
       System.out.println("localDate.getYear() = " + localDate.getYear());
       System.out.println("localDate.getMonth() = " + localDate.getMonth());
       System.out.println("localDate.getDayOfYear() = " + localDate.getDayOfYear());
       System.out.println("localDate.getDayOfMonth() = " + localDate.getDayOfMonth());
       System.out.println("localDate.getDayOfWeek() = " + localDate.getDayOfWeek());
       System.out.println("localDate.getEra() = " + localDate.getEra());
       System.out.println("localDate.lengthOfYear() = " + localDate.lengthOfYear());
       System.out.println("localDate.lengthOfMonth() = " + localDate.lengthOfMonth());
       System.out.println("localDate.isLeapYear() = " + localDate.isLeapYear());
       System.out.println("LocalDate.of(2018,2,1) = " + LocalDate.of(2018,2,1));
   }

}
