package com.ijaaz.patterns.creational.factory.kit.impl;

import com.ijaaz.patterns.creational.factory.kit.interfaces.Bank;

public class ICICI implements Bank {

    private String bankName;

    public ICICI() {
        bankName = "ICICI BANK";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
