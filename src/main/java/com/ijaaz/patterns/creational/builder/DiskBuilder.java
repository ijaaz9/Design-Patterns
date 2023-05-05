package com.ijaaz.patterns.creational.builder;

import com.ijaaz.patterns.creational.builder.impl.Samsung;
import com.ijaaz.patterns.creational.builder.impl.Sony;

public class DiskBuilder {

    public DiskType buildSonyCD() {
        DiskType cds = new DiskType();
        cds.addItem(new Sony());
        return cds;
    }

    public DiskType buildSamsungCD() {
        DiskType cds = new DiskType();
        cds.addItem(new Samsung());
        return cds;

    }

}
