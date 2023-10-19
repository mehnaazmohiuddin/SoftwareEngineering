package com.pizza.model.crusts;
import com.pizza.model.Crust;
import com.pizza.model.sizes.PizzaSize;

public class CheeseBurst implements Crust {
    PizzaSize size;
    final int crustCostPerInch = 12;

    public  CheeseBurst (){
    }
    public  CheeseBurst (PizzaSize size){
        this.size = size;
    }
    @Override
    public float getCost() {
        return crustCostPerInch*this.size.getValue()^2;
    }

    @Override
    public void setCost(float cost) {

    }

    @Override
    public int getSize() {
        return this.size.getValue();
    }

    @Override
    public void setSize(PizzaSize size) {
        this.size = size;
    }

    @Override
    public String getName() {
        return "Thin Cheese Burst Pizza of size "+this.size.getValue();
    }
}
