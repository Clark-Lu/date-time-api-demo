package com.changlu;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.TimeZone;

/**
 * Created by changlu on 1/2/18.
 */
public class ZoneIdDemo {

    public void zoneId(){
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZoneId.systemDefault() = " + zoneId);
        System.out.println("TimeZone.getDefault().toZoneId() = " + TimeZone.getDefault().toZoneId());
        zoneId = ZoneId.of("Asia/Shanghai");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
        System.out.println("localDateTime.atZone(zoneId) = " + localDateTime.atZone(zoneId));
    }
}
