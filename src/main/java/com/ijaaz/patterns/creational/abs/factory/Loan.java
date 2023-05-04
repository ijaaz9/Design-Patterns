package com.ijaaz.patterns.creational.abs.factory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Loan {

    protected double rate;
    public abstract void getInterestRate(double r);

    protected Logger logger = LogManager.getLogger(this.getClass().getName());
    public void calculateLoanPayment(double loanAmount, int years) {

        // Formula to calculate monthly load payment
        // rate = annual interest rate/12*100
        // n = number of installments
        // 1 year = 12 months
        // n = years * 12

        logger.info("Your interest rate is: " + rate);
        double payment;
        int n;

        n=years*12;
        rate=rate/1200;
        payment=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanAmount;

        logger.info("Your monthly installment is: " + payment + " for the loan amount of: " + loanAmount);

    }

}
