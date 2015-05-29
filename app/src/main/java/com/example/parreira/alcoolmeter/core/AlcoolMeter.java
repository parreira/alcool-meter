package com.example.parreira.alcoolmeter.core;

import java.util.ArrayList;
import java.util.Date;


/**
 * Created by parreira on 29/05/15.
 */
public class AlcoolMeter {

    private final static double COEFICIENT_MAN_JEJUM = 0.7;
    private final static double COEFICIENT_WOMAN_JEJUM = 0.6;
    private final static double COEFICIENT_AFTER_MEAL = 1.1;

    private User user;
    private ArrayList<Drink> drinks;


    public AlcoolMeter(User user){
        this.user = user;
        this.drinks = new ArrayList<Drink>();

    }

    public void addDrink(Drink drink){
        this.drinks.add(drink);
    }

    public void removeDrink(Drink drink){
        this.drinks.remove(drink);
    }

    public Date calculateSoberTime(){
        

        return null;
    }

}
