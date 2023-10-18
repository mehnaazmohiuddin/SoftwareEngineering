package com.pizza.model.crusts;

import com.pizza.model.Crust;
import com.pizza.model.sizes.PizzaSize;

public class ThinCrust implements Crust {
    PizzaSize size;
    final int crustCostPerInch = 2;
    public  ThinCrust (){
    }

    public  ThinCrust (PizzaSize size){
        this.size = size;
    }
    /**
     *
     * Definitely i think cost needs to be put away somewhere else.
     * */
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
        return "Thin Crust Pizza of size "+this.size.getValue();
    }
}
