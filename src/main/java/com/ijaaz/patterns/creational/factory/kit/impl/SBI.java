package com.ijaaz.patterns.creational.factory.kit.impl;

import com.ijaaz.patterns.creational.factory.kit.interfaces.Bank;

public class SBI implements Bank {

    private String bankName;

    public SBI() {
        bankName = "SBI BANK";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
