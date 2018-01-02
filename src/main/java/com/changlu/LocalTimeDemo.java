package com.changlu;

import java.time.LocalTime;

/**
 * Created by changlu on 1/2/18.
 */
public class LocalTimeDemo {
    public void localTime(){
        LocalTime localTime = LocalTime.now();
        System.out.println("LocalTime.now() = " + localTime);
        System.out.println("localTime.getHour() = " + localTime.getHour());
        System.out.println("localTime.getMinute() = " + localTime.getMinute());
        System.out.println("localTime.getSecond()" + localTime.getSecond());
        System.out.println("localTime.getNano() = " + localTime.getNano());
        System.out.println("LocalTime.parse(\"14:02:06.6\") = " + LocalTime.parse("14:02:06.6"));
    }
}
