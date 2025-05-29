package com.pluralsight.model;

import java.util.ArrayList;
import java.util.List;

public class Order {

    List<MenuItem> items;

    public Order(){
        items = new ArrayList<>();
    }

    public void addItemToOrder(MenuItem item){
        this.items.add(item);
    }

    public double calculateOrderTotal(){
        double orderTotal = 0;

        for(MenuItem item: items){
            orderTotal += item.getItemPrice();
        }

        return orderTotal;
    }

    public String displayOrder() {
        String output = "";

        //Display Sandwiches
        output += "Sandwiches:\n";
        for(MenuItem item: items){
            if(item instanceof Sandwich)
            {
                output += item.toString();
            }
        }

        //Display Drinks
        output += "Drinks:\n";
        for(MenuItem item: items){
            if(item instanceof Drink)
            {
                output += item.toString();
            }
        }

        //Display Chips
        output += "Chips:\n";
        for(MenuItem item: items){
            if(item instanceof Chips)
            {
                output += item.toString();
            }
        }

        //Display Total Cost
        output += "Total Cost: " + calculateOrderTotal();

        return output;
    }

}
