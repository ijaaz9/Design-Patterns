package com.ijaaz.patterns.creational.factory.kit.impl;

import com.ijaaz.patterns.creational.factory.kit.interfaces.Bank;

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
