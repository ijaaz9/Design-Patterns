package com.ijaaz.patterns.creational.factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Plan {

    protected double rate;
    protected double units;

    protected Logger logger = LogManager.getLogger(this.getClass().getName());

    public void calculateBill(){

        logger.info("The rate for this plan is: " + rate);
        logger.info("The amount of units for this plan is: " + units);
        logger.info("The bill for this plan is: " + units*rate);
    }
}
