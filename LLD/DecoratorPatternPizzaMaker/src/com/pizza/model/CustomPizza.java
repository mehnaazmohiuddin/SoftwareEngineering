package com.pizza.model;

import com.pizza.model.sizes.PizzaSize;

import java.util.ArrayList;

public class CustomPizza extends Pizza{
    Pizza basicPizza;
    ArrayList<PizzaTopping> additionalToppings ;

    PizzaSize size;

    public CustomPizza (){
        super();
    }
    public CustomPizza (Pizza basicPizza, PizzaSize pizzaSize, ArrayList <PizzaTopping> toppings){

        this.basicPizza = basicPizza;
        this.size = pizzaSize;
        this.additionalToppings = toppings;
        System.out.println("Building custom piizza");

    }

    @Override
    public float getCost() {
        return basicPizza.getCost() +  additionalToppings.stream().map( topping -> topping.getCost()).reduce(0f, (partialResult,value)->partialResult+value );
    }


    @Override
    public String toString() {
        return "Custom Pizza with "+basicPizza.toString()+" and additional toppings of "+additionalToppings.stream().map( x -> x.toString()).reduce(" " ,(partialResult,value)->partialResult+" "+value );
    }
}
