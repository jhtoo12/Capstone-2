package com.pluralsight.ui;

import com.pluralsight.model.Enums.*;
import com.pluralsight.model.Sandwich;

import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);

    public void run() {
        displayHomeScreen();
    }

    public void displayHomeScreen() {
        System.out.println("1: New Order" +
                         "\n0: Exit" +
                         "\nEnter Choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 0:
                System.out.println("Thank you for visiting our shop!");
                break;
            case 1:
                displayOrderScreen();
                break;
            default:
                System.out.println("Please enter a valid choice.");
                displayHomeScreen();
                break;
        }
    }
    public void displayOrderScreen() {
        System.out.println("1: Add Sandwich" +
                         "\n2: Add Drink" +
                         "\n3: Add Chips" +
                         "\n4: Checkout" +
                         "\n0: Cancel Order" +
                         "\nEnter Choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 0:
                System.out.println("Order Canceled");
                displayHomeScreen();
                break;
            case 1:
                displayAddSandwichScreen();
                break;
            case 2:
                displayAddDrinkScreen();
                break;
            case 3:
                displayAddChipsScreen();
                break;
            case 4:
                displayCheckoutScreen();
        }
    }
    public void displayAddSandwichScreen() {
        //Selecting bread
        System.out.println("Select Bread (White, Wheat, Rye, Wrap)" +
                         "\nEnter Choice: ");
        String inputBread = scanner.next().toLowerCase();
        Bread bread = null;
        switch (inputBread)
        {
            case "white":
                bread = Bread.white;
                break;
            case "wheat":
                bread = Bread.wheat;
                break;
            case "rye":
                bread = Bread.rye;
                break;
            case "wrap":
                bread = Bread.wrap;
                break;
        }

        //Selecting size
        System.out.println("Select Sandwich Size by Inch (4, 8, 12)" +
                           "\nEnter Choice: ");
        int size = scanner.nextInt();

        //Creating the initial sandwich
        Sandwich sandwich = new Sandwich(bread, size);

        //Selecting meats
        boolean keepAdding = true;
        while(keepAdding) {
            System.out.println("Select Topping (Meat, Cheese, RegularToppings)" +
                             "\nEnter Choice: ");
            String choice = scanner.nextLine().toLowerCase();

            switch (choice) {
                case "meat":
                    System.out.println("Select Meat (Steak, Ham, Salami, RoastBeef, chicken, bacon)" +
                            "\nEnter Choice: ");
                    String meat = scanner.next().toLowerCase();
                    Meat meats = null;

                    switch (meat) {
                        case "steak":
                            meat = Meat.steak;
                            break;
                        case "ham":
                            meat = Meat.ham;
                            break;
                        case "salami":
                            meat = Meat.salami;
                            break;
                        case "roastbeef":
                            meat = Meat.roastBeef;
                            break;
                        case "chicken":
                            meat = Meat.chicken;
                            break;
                        case "bacon":
                            meat = Meat.bacon;
                            break;
                    }

                    sandwich.addMeat(meat);
                    break;

                case "cheese":
                    System.out.println("Select Cheese (American, Provolone, Cheddar, Swiss)" +
                                     "\nEnter Choice: ");
                    String cheese = scanner.next().toLowerCase();
                    Cheese cheese = null;

                    switch (cheese)
                    {
                        case "american":
                            cheese = Cheese.american;
                            break;
                        case "provolone":
                            cheese = Cheese.provolone;
                            break;
                        case "cheddar":
                            cheese = Cheese.cheddar;
                            break;
                        case "swiss":
                            cheese = Cheese.swiss;
                            break;
                    }

                    sandwich.addCheese(cheese);
                    break;
                case "regulartoppings":
                    System.out.println("Select Regular Toppings (Steak, Ham, Salami, RoastBeef, chicken, bacon)" +
                                     "\nEnter Choice: ");
                    String regulartopping = scanner.next().toLowerCase();
                    RegularToppings regularTopping = null;

                    switch (regulartopping) {

                        case "lettuce":
                            regularTopping = RegularToppings.lettuce;
                            break;
                        case "peppers":
                            regularTopping = RegularToppings.peppers;
                            break;
                        case "onions":
                            regularTopping = RegularToppings.onions;
                            break;
                        case "tomatoes":
                            regularTopping = RegularToppings.tomatoes;
                            break;
                        case "jalapenos":
                            regularTopping = RegularToppings.jalapenos;
                            break;
                        case "cucumbers":
                          regularTopping = RegularToppings.cucumbers;
                            break;
                        case "pickles":
                           regularTopping = RegularToppings.pickles;
                            break;
                        case "guacamole":
                           regularTopping = RegularToppings.guacamole;
                            break;
                        case "mushrooms":
                            regularTopping = RegularToppings.mushrooms;
                            break;
                    }

                    sandwich.addRegularToppings(regularTopping);
                    break;

                case "sauces":
                    System.out.println("Select Sauces(Mayo, Mustard)" +
                            "\nEnter Choice: ");
                    String sauces = scanner.next().toLowerCase();
                    Sauces sauce = null;

                    switch (sauces) {
                        case "mayo":
                            sauce = Sauces.mayo;
                            break;
                        case "mustard":
                            sauce = Sauces.mustard;
                            break;

                    }
            }
        }
    }
    public void displayAddDrinkScreen() {

    }
    public void displayAddChipsScreen() {

    }
    public void displayCheckoutScreen() {
    }
}
