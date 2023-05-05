package com.ijaaz.patterns.creational.factory.kit;

import com.ijaaz.patterns.creational.factory.kit.concepts.Loan;

public class Eduloan extends Loan {

    @Override
    public void getInterestRate(double r) {
        rate =r;
    }
}
