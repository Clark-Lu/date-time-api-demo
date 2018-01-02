package com.changlu;

import java.time.Instant;

/**
 * Created by changlu on 1/2/18.
 */
public class InstantDemo {

    public void instant(){
        Instant instant = Instant.now();
        System.out.println("Instant.now() = " + Instant.now());
        System.out.println("Instant.ofEpochSecond(1,1000000000) = " + Instant.ofEpochSecond(1, 1000000000));
        System.out.println("Instant.ofEpochSecond(3,-1000000000) = " + Instant.ofEpochSecond(3,-1000000000));
        System.out.println("instant.getEpochSecond() = " + instant.getEpochSecond());
        System.out.println("instant.getNano() = " + instant.getNano());
    }
}
