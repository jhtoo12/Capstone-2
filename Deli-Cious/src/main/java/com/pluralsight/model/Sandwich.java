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

    public Sandwich(Bread bread, int size) {
        this.bread = bread;
        this.size = size;
        meats = new ArrayList<>();
        cheeses = new ArrayList<>();
        regularToppings = new ArrayList<>();
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
}
