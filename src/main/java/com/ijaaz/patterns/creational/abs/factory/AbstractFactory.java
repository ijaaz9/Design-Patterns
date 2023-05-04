package com.ijaaz.patterns.creational.abs.factory;

public abstract class AbstractFactory {
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}
