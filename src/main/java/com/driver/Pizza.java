package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private boolean flagForCheese=false;
    private boolean flagForToppings=false;
    private String bill;

    public boolean isFlagForCheese() {
        return flagForCheese;
    }

    public void setFlagForCheese(boolean flagForCheese) {
        this.flagForCheese = flagForCheese;
    }

    public boolean isFlagForToppings() {
        return flagForToppings;
    }

    public void setFlagForToppings(boolean flagForToppings) {
        this.flagForToppings = flagForToppings;
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)price=300;
        else price=400;

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(flagForCheese)return;
        price+=80;
        flagForCheese=true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(flagForToppings)return;
        if(isVeg)price+=70;
        else price+=120;
        flagForToppings=true;
    }

    public void addTakeaway(){
        // your code goes here
        price+=20;
    }

    public String getBill(){
        // your code goes here
        bill=String.valueOf(price);
        return this.bill;
    }
}
