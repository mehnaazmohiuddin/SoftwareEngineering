package com.pizza.model;

import com.pizza.model.sizes.PizzaSize;

import java.util.ArrayList;

public class Pizza implements  Billable{
    Crust crust;

    public Pizza(Crust crust, ArrayList<PizzaTopping> toppings, Sauce sauce, PizzaSize size) {
        crust.setSize(size);
        this.crust =crust;
        this.toppings = toppings;
        this.sauce = sauce;
        this.size = size;
    }

    ArrayList<PizzaTopping> toppings;
    Sauce sauce;
    PizzaSize size ; // can be large meidum or single. i would make this an enum

    public Pizza() {

    }

    @Override
    public float getCost() {
        return this.size.getValue() * crust.getCost()+ sauce.getCost() + toppings.stream().map(x->x.getCost()).reduce(0f, (partialSum,value) -> partialSum+value);
    }

    @Override
    public void setCost(float cost) {

    }
    @Override
    public  String toString(){
        return "Pizza with crust :"+crust.getName()+" toppings "+toppings.toString()+" size "+size.getValue();
    }


    public Crust getCrust() {
        return crust;
    }

    public void setCrust(Crust crust) {
        this.crust = crust;
    }

    public ArrayList<PizzaTopping> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<PizzaTopping> toppings) {
        this.toppings = toppings;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }
}
