package com.ijaaz.patterns.creational.factory.kit.concepts;

import com.ijaaz.patterns.creational.factory.kit.interfaces.Bank;

public abstract class AbstractFactory {
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}
