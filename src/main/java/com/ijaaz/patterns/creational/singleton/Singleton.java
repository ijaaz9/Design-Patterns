package com.ijaaz.patterns.creational.singleton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Singleton {

    //It’s pretty easy to implement a sloppy Singleton.
    // You just need to hide the constructor and implement a static creation method.

    private static Singleton instance;
    private String value;

    private final Logger logger = LogManager.getLogger(this.getClass().getName());

    private Singleton(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String toString(){

        return "RESULT:\n" + getValue();
    }
}
