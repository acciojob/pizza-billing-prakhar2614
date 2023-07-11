package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        this.flagForCheese=true;
        this.flagForToppings=true;
        this.isDelux=true;
        // your code goes here
    }
}
