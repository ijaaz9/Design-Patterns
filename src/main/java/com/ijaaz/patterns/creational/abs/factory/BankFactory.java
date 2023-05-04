package com.ijaaz.patterns.creational.abs.factory;

public class BankFactory extends AbstractFactory{
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
