package com.example.parreira.alcoolmeter.core;

import java.util.ArrayList;
import java.util.Date;


/**
 * Created by parreira on 29/05/15.
 */
public class AlcoolMeter {

    protected final static double COEFICIENT_MAN_JEJUM = 0.7;
    protected final static double COEFICIENT_WOMAN_JEJUM = 0.6;
    protected final static double COEFICIENT_AFTER_MEAL = 1.1;

    public enum COEFICIENT {
        COEFICIENT_MAN_JEJUM(0.7), COEFICIENT_WOMAN_JEJUM(0.6), COEFICIENT_AFTER_MEAL(1.1);

        private double coeficient;

        private COEFICIENT(double coeficient){
            this.coeficient = coeficient ;
        }

        public double getCoeficient(){
            return this.coeficient ;
        }

    }


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


    //FORMULA
    // alcool(gramas) / (peso(kg) * coeficiente)



    public Date calculateSoberTime(){
        

        return null;
    }

}
