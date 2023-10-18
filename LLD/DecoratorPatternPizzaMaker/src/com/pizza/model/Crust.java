package com.pizza.model;

import com.pizza.model.sizes.PizzaSize;

public interface Crust extends Billable{
   public int getSize();
   public void setSize( PizzaSize size);

   public  String getName();

}
