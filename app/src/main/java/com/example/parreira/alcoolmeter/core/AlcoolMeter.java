package com.example.parreira.alcoolmeter.core;

import java.util.ArrayList;
import java.util.Date;


/**
 * Created by parreira on 29/05/15.
 */
public class AlcoolMeter {

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

    //FORMULA//////////////
    // alcool(gramas) / (peso(kg) * coeficiente)
    public double calculateAlcoolTax(double totalAlcool, User user){
        if(!user.getFasting()){
            if(user.getSex()==User.Sex.man){
                return alcoolTaxFormula(totalAlcool, user, 0.7);
            }
            else{
                return alcoolTaxFormula(totalAlcool, user, 0.6);
            }
        }
        else{
            return alcoolTaxFormula(totalAlcool, user, 1.1);
        }
    }

    public double alcoolTaxFormula(double totalAlcool, User user, double coeficient){
        return totalAlcool / (user.getWeight() * coeficient);
    }
    ////////////////////



    public Date calculateSoberTime(){
        


    }

}
