package com.pluralsight.model;

public class Drink extends MenuItem {

    private String flavor;

    private String size;

    public Drink(){

    }

    public Drink(String flavor,String size){
        this.flavor = flavor;
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public double getItemPrice() {

        switch (size.toUpperCase()){
            case "S":
                return 2;

            case "M":
                return 2.50;

            case "L":
                return 3;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Drink: " +
                "Flavor =" + flavor +
                ", Size =" + size +
              "\nCost: $" + getItemPrice();
    }
}
