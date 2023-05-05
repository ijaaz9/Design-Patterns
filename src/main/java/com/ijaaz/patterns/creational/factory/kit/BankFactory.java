package com.ijaaz.patterns.creational.factory.kit;

import com.ijaaz.patterns.creational.factory.kit.concepts.AbstractFactory;
import com.ijaaz.patterns.creational.factory.kit.concepts.Loan;
import com.ijaaz.patterns.creational.factory.kit.impl.HDFC;
import com.ijaaz.patterns.creational.factory.kit.impl.ICICI;
import com.ijaaz.patterns.creational.factory.kit.impl.SBI;
import com.ijaaz.patterns.creational.factory.kit.interfaces.Bank;

public class BankFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bank) {
        
        if(bank.equalsIgnoreCase("HDFC_BANK")){
            return new HDFC();
        } else if (bank.equalsIgnoreCase("ICICI_BANK")) {
            return new ICICI();
        }else if (bank.equalsIgnoreCase("SBI_BANK")){
            return new SBI();
        }

        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}
