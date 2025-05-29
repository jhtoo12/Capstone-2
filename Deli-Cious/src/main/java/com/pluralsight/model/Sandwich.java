package com.pluralsight.model;


import com.pluralsight.model.Enums.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Sandwich extends MenuItem {
    private Bread bread;
    private int size;
    private ArrayList<Meat> meats;
    private ArrayList<Cheese> cheeses;
    private ArrayList<RegularToppings> regularToppings;
    private Sauces sauce;
    private String isToasted;

    public Sandwich(Bread bread, int size) {
        this.bread = bread;
        this.size = size;
        meats = new ArrayList<>();
        cheeses = new ArrayList<>();
        regularToppings = new ArrayList<>();
        isToasted = "";
    }

    public ArrayList<Meat> getMeats() {
        return meats;
    }

    public void addMeat(Meat meat) {
        meats.add(meat);
    }

    public ArrayList<Cheese> getCheeses() {
        return cheeses;
    }

    public void addCheese(Cheese cheese) {
        cheeses.add(cheese);
    }

    public ArrayList<RegularToppings> getRegularToppings() {
        return regularToppings;
    }

    public void addRegularToppings(RegularToppings regularTopping) {
        regularToppings.add(regularTopping);
    }

    public void SetSauce(Sauces sauce) {
        this.sauce = sauce;
    }

    public void setIsToasted(String isToasted) { this.isToasted = isToasted;}

    @Override
    public double getItemPrice() {

        double sandwichTotal = 0;


        //get bread price
        sandwichTotal += getBreadPrice();

        //get cost for meats
        sandwichTotal += getMeatPrice();

        //get cost for cheese
        sandwichTotal += getCheesesPrice();


        return sandwichTotal;
    }




    // bread price helper method
    private double getBreadPrice(){

        switch (size){
            case 4:
                return 5.50;

            case 8:
                return 7;


            case 12:
                return 8.50;

        }
        return  0;
    }


    private double getMeatPrice() {

        double meatCost = 0;


        if (cheeses.isEmpty()) {

            return meatCost;
        } else {

            switch (size) {
                case 4:

                    meatCost += 1.00; //if it's not empty it has at least 1 meat topping

                    //after we add the initial topping... we need to iterate through the arraylist to
                    //add the 'extra cost' for the remaidner meat tioppings
                    for (int i = 1; i < cheeses.size(); i++) {
                        meatCost += .50;
                    }

                    return meatCost;

                case 8:

                    meatCost += 2.00; //if it's not empty it has at least 1 meat topping

                    for (int i = 1; i < cheeses.size(); i++) {
                        meatCost += 1;
                    }

                    return meatCost;

                case 12:

                    meatCost += 3.00; //if it's not empty it has at least 1 meat topping

                    for (int i = 1; i < cheeses.size(); i++) {
                        meatCost += 1.50;

                        return meatCost;

                    }

            }
        }
        return 0;
    }

    private double getCheesesPrice() {
        double cheeseCost = 0;

        if (cheeses.isEmpty()) {

            return cheeseCost;
        } else {

            switch (size) {
                case 4:

                    cheeseCost += 1.00; //if it's not empty it has at least 1 meat topping
                    //after we add the initial topping... we need to iterate through the arraylist to
                    //add the 'extra cost' for the remaidner meat tioppings
                    for (int i = 1; i < cheeses.size(); i++) {
                        cheeseCost += .50;
                    }
                    return cheeseCost;

                case 8:

                    cheeseCost += 2.00; //if it's not empty it has at least 1 meat topping
                    for (int i = 1; i < cheeses.size(); i++) {
                        cheeseCost += 1;
                    }
                    return cheeseCost;

                case 12:

                    cheeseCost += 3.00; //if it's not empty it has at least 1 meat topping
                    for (int i = 1; i < cheeses.size(); i++) {
                        cheeseCost += 1.50;
                        return cheeseCost;

                    }

            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Sandwich: " +
                "Bread =" + bread +
                ", Size =" + size +
                ", Meats =" + meats +
                ", Cheeses =" + cheeses +
                ", RegularToppings =" + regularToppings +
                ", Sauce =" + sauce +
                ", Toasted =" + isToasted +
              "\nCost: $" + getItemPrice();
    }
}
