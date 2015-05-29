package com.example.parreira.alcoolmeter.core;

import java.util.Date;

/**
 * Created by parreira on 29/05/15.
 */
public abstract class Drink {

    private String name;
    private double alcoolRate;
    private double quantity;
    private Date lastTimeDrinked;


    protected Drink(String name, double alcoolRate,double quantity){
        this.name = name;
        this.alcoolRate = alcoolRate;
        this.quantity = quantity;
        this.lastTimeDrinked = new Date();
    }


    public String getName(){
        return this.name;
    }

    public double getAlcoolRate(){
        return this.alcoolRate;
    }

    public double getQuantity(){
        return this.quantity;
    }

    public Date getLastTimeDrinked(){
        return this.lastTimeDrinked;
    }

}
