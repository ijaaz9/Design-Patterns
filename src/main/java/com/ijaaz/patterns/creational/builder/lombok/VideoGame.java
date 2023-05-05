package com.ijaaz.patterns.creational.builder.lombok;

import lombok.Builder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Builder
public class VideoGame {

    private String packaging;
    private double price;
    private final Logger logger = LogManager.getLogger(this.getClass().getName());

    public void showDetails(){
        logger.info("\nVideo Game System: " + packaging + "\t Price: "+ price);
    }
}
