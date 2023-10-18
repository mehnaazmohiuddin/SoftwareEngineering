package com.pizza.model;

public enum PizzaTopping {
    TOMATOES(100),
    CUCMBER(200),
    CAPCICUM(300),
    PINEAPPLE(800),
    CHEESE ( 40);
    private float cost;

    public float getCost(){
        return  cost;
    }
    private  void setCost(float cost){
        this.cost = cost;
    }
    private PizzaTopping(float cost){
        this.cost = cost;
    }
    public  String toString(){
        switch (this){
            case CAPCICUM :
            return "capcicum";
            case TOMATOES:
                return "tomatoe";
            case CHEESE:
                return  "cheese";
            case PINEAPPLE:
                return "pineapple";
            default:
                return "CUCMBER";

        }
    }
}
