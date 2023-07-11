package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    boolean flagForCheese=false;
    boolean flagForToppings=false;
    boolean flagTakeAway=false;
    boolean flagBillGenerated=false;
    private String bill;
    private int cheese;
    private int toppings;
    boolean isDelux=false;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            price=300;
            toppings=70;
        }
        else {
            price=400;
            toppings=120;
        }
        this.cheese=80;
        System.out.print("Base Price Of The Pizza: ");
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
        if(flagTakeAway)return;
        flagTakeAway=true;
        price+=20;
    }

    public String getBill(){
        // your code goes here
        if(flagBillGenerated)return "";
        bill=String.valueOf(price);

        if(flagForCheese && !isDelux)System.out.println("Extra Cheese Added: "+cheese);
        if(flagForToppings && !isDelux)System.out.println("Extra Toppings Added: "+toppings);
        if(flagTakeAway)System.out.println("Paperbag Added: 20");
        System.out.print("Total Price: ");
        flagBillGenerated=true;
        return this.bill;
    }
}
