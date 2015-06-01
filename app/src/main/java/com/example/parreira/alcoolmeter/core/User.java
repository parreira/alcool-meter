package com.example.parreira.alcoolmeter.core;

/**
 * Created by parreira on 29/05/15.
 */
public class User {

    protected enum Sex { man, woman }

    private String name ;
    private double weight;
    private Sex sex;

    protected boolean fasting;


    //CREATION
    public User(String name, double weight, Sex sex){
        this.name = name;
        this.weight = weight;
        this.sex = sex;
    }

    public String getName(){
        return this.name;
    }

    public double getWeight(){
        return this.weight;
    }

    public boolean getFasting() { return this.fasting; }

    public Sex getSex(){ return this.sex; }

    //POS-CREATION
    public void setWeight(double weight){ this.weight = weight; }

    public void setFasting(boolean fasting){ this.fasting = fasting; }
}
