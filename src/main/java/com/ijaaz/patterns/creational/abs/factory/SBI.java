package com.ijaaz.patterns.creational.abs.factory;

public class SBI implements Bank{

    private String bankName;

    public SBI() {
        bankName = "SBI BANK";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
