package com.ijaaz.patterns.creational.builder;

import com.ijaaz.patterns.creational.builder.interfaces.Packing;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class DiskType {

    private List<Packing> items = new ArrayList<>();
    private final Logger logger = LogManager.getLogger(this.getClass().getName());
    public void addItem(Packing packs) {
        items.add(packs);
    }
    public void getCost(){

        for (Packing packs : items) {
            packs.price();
        }
    }
    public void showItems(){

        for (Packing packing : items){
            logger.info("\nCD Name: " + packing.pack() + "\t Price: "+packing.price());
        }

    }

}
