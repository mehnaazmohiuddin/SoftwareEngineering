package com.pizza.model.sizes;

public enum PizzaSize {
    LARGE (10),
    MEDIUM(6),
    SINGLE(4);

    int inches;

   private PizzaSize( int inches){
        this.inches = inches;
    }

    public  int getValue(){
       return this.inches;
    }


}
