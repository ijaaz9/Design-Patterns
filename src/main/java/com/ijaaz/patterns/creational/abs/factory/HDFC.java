package com.ijaaz.patterns.creational.abs.factory;

public class HDFC implements Bank {

    private String bankName;

    public HDFC() {
        bankName = "HDFC BANK";
    }
    @Override
    public String getBankName() {
        return bankName;
    }
}
