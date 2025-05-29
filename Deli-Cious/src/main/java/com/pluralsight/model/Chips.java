package com.pluralsight.model;

public class Chips extends MenuItem{

    String type;

    public Chips(){

    }

    public Chips(String type){
        this.type =type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double getItemPrice() {
        return 1.50;
    }

    @Override
    public String toString() {
        return "Chip: " +
                "type =" + type +
              "\nCost: $" + getItemPrice();


    }
}

