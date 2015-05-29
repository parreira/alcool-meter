package com.example.parreira.alcoolmeter.core;

/**
 * Created by parreira on 29/05/15.
 */
public class User {
    private String name ;
    private double weight;

    public User(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }

    public double getWeight(){
        return this.weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
}
