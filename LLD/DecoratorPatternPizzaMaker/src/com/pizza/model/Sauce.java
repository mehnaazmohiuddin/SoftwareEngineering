package com.pizza.model;

public class Sauce implements Billable {
    float cost;
    @Override
    public float getCost() {
        return cost;
    }
    /**
     * Should only be used by some setters.
     * */
    @Override
    public void setCost(float cost) {
        this.cost = cost;
    }
}
