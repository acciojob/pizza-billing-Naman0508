package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private Boolean isExtraCheeseAdded;
    private Boolean isExtraToppingsAdded;
    private Boolean isBillCreated;
    private int toppings;
    private Boolean isTakeaway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price=300;
            this.toppings=70;
            this.bill="Base Price Of The Pizza: 300"+"\n";
        }else{
            this.price=400;
            this.toppings=120;
            this.bill="Base Price Of The Pizza: 400"+"\n";
        }
        this.isExtraCheeseAdded=false;
        this.isBillCreated=false;
        this.isTakeaway=false;
        this.isExtraToppingsAdded=false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded){
            this.price+=80;
            isExtraCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingsAdded){
            this.price+=toppings;
            isExtraToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeaway){
            this.price+=20;
            isTakeaway=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillCreated) {
            if (isExtraCheeseAdded) {
                this.bill += "Extra Cheese Added: 80" + "\n";
            }
            if (isExtraToppingsAdded) {
                this.bill += "Extra Toppings Added: " + toppings + "\n";
            }
            if (isTakeaway) {
                this.bill += "Paperbag Added: 20"+"\n";
            }
            this.bill+="Total Price: "+this.price;
            isBillCreated=true;
            return this.bill;
        }
        return " ";
    }
}
