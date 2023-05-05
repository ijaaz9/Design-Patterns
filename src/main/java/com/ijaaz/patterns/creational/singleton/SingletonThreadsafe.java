package com.ijaaz.patterns.creational.singleton;

public final class SingletonThreadsafe {

    // The field must be declared volatile so that double check lock would work correctly.
    private static volatile SingletonThreadsafe instance;
    private String value;

    private SingletonThreadsafe(String value) {
        this.value = value;
    }

    public static SingletonThreadsafe getInstance(String value) {
        // The approach taken here is called double-checked locking (DCL). It
        // exists to prevent race condition between multiple threads that may
        // attempt to get singleton instance at the same time, creating separate
        // instances as a result.

        SingletonThreadsafe result = instance;
        if (result != null) {
            return result;
        }
        synchronized(SingletonThreadsafe.class) {
            if (instance == null) {
                instance = new SingletonThreadsafe(value);
            }
            return instance;
        }
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
