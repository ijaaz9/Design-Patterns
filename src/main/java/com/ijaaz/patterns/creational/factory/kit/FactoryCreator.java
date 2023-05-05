package com.ijaaz.patterns.creational.factory.kit;

import com.ijaaz.patterns.creational.factory.kit.concepts.AbstractFactory;

public class FactoryCreator {

    public static AbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("Bank")){
            return new BankFactory();
        } else if(choice.equalsIgnoreCase("Loan")){
            return new LoanFactory();
        }

        return null;
    }
}
