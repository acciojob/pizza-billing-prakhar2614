package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        setFlagForCheese(true);
        setFlagForToppings(true);
        // your code goes here
    }
}
