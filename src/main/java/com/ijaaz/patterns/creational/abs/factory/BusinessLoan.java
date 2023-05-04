package com.ijaaz.patterns.creational.abs.factory;

public class BusinessLoan extends Loan {

    @Override
    public void getInterestRate(double r) {
        rate =r;
    }
}
