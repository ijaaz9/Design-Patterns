package com.ijaaz.patterns.creational.abs.factory;

public class HomeLoan extends Loan{
    @Override
    public void getInterestRate(double r) {
        rate =r;
    }
}
