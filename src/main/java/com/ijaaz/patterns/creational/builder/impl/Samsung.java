package com.ijaaz.patterns.creational.builder.impl;

import com.ijaaz.patterns.creational.builder.concepts.Company;

public class Samsung extends Company {
    @Override
    public String pack() {
        return "Samsung CD";
    }

    @Override
    public int price() {
        return 15;
    }
}
