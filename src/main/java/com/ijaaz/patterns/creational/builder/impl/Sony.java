package com.ijaaz.patterns.creational.builder.impl;

import com.ijaaz.patterns.creational.builder.concepts.Company;

public class Sony extends Company {
    @Override
    public String pack() {
        return "Sony CD";
    }

    @Override
    public int price() {
        return 20;
    }
}
