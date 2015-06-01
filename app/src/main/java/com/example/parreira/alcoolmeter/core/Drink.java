package com.example.parreira.alcoolmeter.core;

import java.util.Date;

/**
 * Created by parreira on 29/05/15.
 */
public abstract class Drink {

    //THE DRINK CARACTERISTICS
    private String name;
    private double alcoolRate;
    private double quantity;
    private Date lastTimeDrinked;


    //THE DRINK PROCESS BY TIME
    private double quantityProcessed;



    protected Drink(String name, double alcoolRate, double quantity){
        this.name = name;
        this.alcoolRate = alcoolRate;
        this.quantity = quantity;
        this.lastTimeDrinked = new Date();
        this.quantityProcessed = 0;
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
