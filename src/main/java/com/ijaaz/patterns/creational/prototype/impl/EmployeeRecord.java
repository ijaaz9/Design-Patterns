package com.ijaaz.patterns.creational.prototype.impl;

import com.ijaaz.patterns.creational.prototype.interfaces.Prototype;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EmployeeRecord implements Prototype {

    private int id;
    private String name;
    private String designation;
    private double salary;
    private String address;
    private final Logger logger = LogManager.getLogger(this.getClass().getName());

    public EmployeeRecord(){
        logger.info("   Employee Records of Oracle Corporation " + "\n---------------------------------------------\n" +
                "ID"+"\t"+"Name"+"\t"+"Designation"+"\t"+"Salary"+"\t\t"+"Address");
    }

    public  EmployeeRecord(int id, String name, String designation, double salary, String address) {

        this();
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }

    public void showRecord(){

        logger.info(id + "\t" + name + "\t" + designation + "\t" + salary + "\t" + address);
    }

    @Override
    public Prototype getClone() {
        return new EmployeeRecord(id,name,designation,salary,address);
    }
}
