package com.ijaaz.patterns.creational.abs.factory;

public class ICICI implements Bank{

    private String bankName;

    public ICICI() {
        bankName = "ICICI BANK";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
