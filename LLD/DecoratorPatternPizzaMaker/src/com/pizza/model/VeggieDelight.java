package com.pizza.model;

import com.pizza.model.sauces.SecretSauce;
import com.pizza.model.sizes.PizzaSize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class VeggieDelight extends Pizza{
    final List<PizzaTopping> FIXED_TOPPINGS =  List.of(PizzaTopping.CAPCICUM, PizzaTopping.TOMATOES);
    VeggieDelight (){
        super();


    }
    public VeggieDelight(Crust crust, ArrayList<PizzaTopping> toppings, PizzaSize size){
        super(crust,toppings, new SecretSauce(),size);
        toppings.addAll(FIXED_TOPPINGS);
    }

    @Override
    public float getCost() {
        return super.getCost() + FIXED_TOPPINGS.stream().map(PizzaTopping::getCost).reduce( 0f, (partialSum, x)->partialSum+x) ;
    }
}
