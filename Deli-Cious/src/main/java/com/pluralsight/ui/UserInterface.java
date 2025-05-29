package com.pluralsight.ui;

import com.pluralsight.model.*;
import com.pluralsight.model.Enums.*;

import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    Order order;

    public void run() {
        displayHomeScreen();
    }

    public void displayHomeScreen() {
        System.out.println("1: New Order" +
                         "\n0: Exit" +
                         "\nEnter Choice: ");

        String choice = scanner.nextLine();

        switch (choice) {
            case "0":
                System.out.println("Thank you for visiting our shop!");
                break;
            case "1":
                order = new Order();
                displayOrderScreen();
                break;
            default:
                System.out.println("Please enter a valid choice.");
                displayHomeScreen();
                break;
        }
    }
    public void displayOrderScreen() {

        boolean isOrdering = true;

        while(isOrdering) {
            System.out.println("1: Add Sandwich" +
                    "\n2: Add Drink" +
                    "\n3: Add Chips" +
                    "\n4: Checkout" +
                    "\n0: Cancel Order" +
                    "\nEnter Choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "0":
                    System.out.println("Order Canceled");
                    isOrdering = false;
                    displayHomeScreen();
                    break;
                case "1":
                    displayAddSandwichScreen();

                    break;
                case "2":
                    displayAddDrinkScreen();
                    break;
                case "3":
                    displayAddChipsScreen();
                    break;
                case "4":
                    displayCheckoutScreen();
                    isOrdering = false;
            }
        } //emd of while loop
    }
    public void displayAddSandwichScreen() {
        //Selecting bread
        System.out.println("Select Bread (White, Wheat, Rye, Wrap)" +
                         "\nEnter Choice: ");
        String inputBread = scanner.nextLine().toLowerCase();
        Bread bread = null;
        switch (inputBread)
        {
            case "white":
                bread = Bread.WHITE;
                break;
            case "wheat":
                bread = Bread.WHEAT;
                break;
            case "rye":
                bread = Bread.RYE;
                break;
            case "wrap":
                bread = Bread.WRAP;
                break;
        }

        //Selecting size
        System.out.println("Select Sandwich Size by Inch (4, 8, 12)" +
                           "\nEnter Choice: ");
        String size = scanner.nextLine();

        //Creating the initial sandwich
        Sandwich sandwich = new Sandwich(bread, Integer.parseInt(size));

        //Selecting meats
        boolean keepAdding = true;

        while(keepAdding) {
            System.out.println("Select Topping (Meat, Cheese, RegularToppings,Sauces,Exit)" +
                             "\nEnter Choice: ");
            String choice = scanner.nextLine().toLowerCase();

            switch (choice) {
                case "meat":
                    System.out.println("Select Meat (Steak, Ham, Salami, RoastBeef, chicken, bacon)" +
                            "\nEnter Choice: ");
                    String meat = scanner.nextLine().toLowerCase();


                    switch (meat)
                    {
                        case "steak":
                         //   Meat = Meat.STEAK;
                            sandwich.addMeat(Meat.STEAK);
                            break;
                        case "ham":
                           // meat = Meat.HAM;
                            sandwich.addMeat(Meat.HAM);
                            break;
                        case "salami":
                           sandwich.addMeat(Meat.SALAMI);
                            break;
                        case "roastbeef":
                           sandwich.addMeat(Meat.ROASTBEEF);
                            break;
                        case "chicken":
                            sandwich.addMeat(Meat.CHICKEN);
                            break;
                        case "bacon":
                            sandwich.addMeat(Meat.BACON);
                            break;
                    }
                    break;

                case "cheese":
                    System.out.println("Select Cheese (American, Provolone, Cheddar, Swiss)" +
                                     "\nEnter Choice: ");
                    String cheese = scanner.nextLine().toLowerCase();
                   // Cheese cheese = null;

                    switch (cheese)
                    {
                        case "american":
                            sandwich.addCheese(Cheese.AMERICAN);
                            break;
                        case "provolone":
                            sandwich.addCheese(Cheese.PROVOLONE);
                            break;
                        case "cheddar":
                            sandwich.addCheese(Cheese.CHEDDAR);
                            break;
                        case "swiss":
                            sandwich.addCheese(Cheese.SWISS);
                            break;
                    }

                   // sandwich.addCheese(cheese);
                    break;
                case "regulartoppings":
                    System.out.println("Select Regular Toppings (Lettuce, peppers, Salami, RoastBeef, chicken, bacon)" +
                                     "\nEnter Choice: ");
                    String regulartopping = scanner.nextLine().toLowerCase();
                    RegularToppings regularTopping = null;

                    switch (regulartopping)
                    {

                        case "lettuce":
                            regularTopping = RegularToppings.LETTUCE;
                            break;
                        case "peppers":
                            regularTopping = RegularToppings.PEPPERS;
                            break;
                        case "onions":
                            regularTopping = RegularToppings.ONIONS;
                            break;
                        case "tomatoes":
                            regularTopping = RegularToppings.TOMATOES;
                            break;
                        case "jalapenos":
                            regularTopping = RegularToppings.JALAPENOS;
                            break;
                        case "cucumbers":
                          regularTopping = RegularToppings.CUCUMBERS;
                            break;
                        case "pickles":
                           regularTopping = RegularToppings.PICKLES;
                            break;
                        case "guacamole":
                           regularTopping = RegularToppings.GUACAMOLE;
                            break;
                        case "mushrooms":
                            regularTopping = RegularToppings.MUSHROOMS;
                            break;
                    }

                    sandwich.addRegularToppings(regularTopping);
                    break;

                case "sauces":
                    System.out.println("Select Sauces(Mayo, Mustard)" +
                            "\nEnter Choice: ");
                    String sauces = scanner.nextLine().toLowerCase();
                    Sauces sauce = null;

                    switch (sauces) {
                        case "mayo":
                            sauce = Sauces.MAYO;
                            break;
                        case "mustard":
                            sauce = Sauces.MUSTARD;
                            break;
                    }

                    sandwich.SetSauce(sauce);
                    break;

                case "exit":
                    System.out.println("Do you want your sandwich toasted? (Yes or No)");
                    String toastedChoice = scanner.nextLine();
                    if(toastedChoice.equalsIgnoreCase("yes")) {
                        sandwich.setIsToasted("Is Toasty");
                    }
                    else {
                        sandwich.setIsToasted("Not Toasty");
                    }

                    order.addItemToOrder(sandwich);

                    System.out.println("Returning to Order Screen");
                    keepAdding = false;
                    break;
            }
        }
        // end of the while loop
    }
    public void displayAddDrinkScreen() {
        boolean isOrdering = true;

        while(isOrdering) {
            System.out.println("Select Drink Size (S, M, L)" +
                    "\nEnter Choice: ");
            String size = scanner.nextLine().toUpperCase();

            System.out.println("Which flavor do you want? (Coke, Sprite, Pepsi, Fanta, Water)" +
                    "\nEnter Choice: ");
            String flavor = scanner.nextLine().toLowerCase();

            Drink drink = new Drink(size, flavor);

            order.addItemToOrder(drink);

            isOrdering = false;
        } //end of while loop
    }
    public void displayAddChipsScreen() {
        boolean isOrdering = true;

        while(isOrdering) {
            System.out.println("Which type do you want? (Lays, Doritos, SunChips, Kettle)" +
                    "\nEnter Choice: ");
            String type = scanner.nextLine().toLowerCase();

            Chips chips = new Chips(type);

            order.addItemToOrder(chips);

            isOrdering = false;
        }//end of while loop
    }
    public void displayCheckoutScreen() {
        System.out.println(order.displayOrder());

        System.out.println("Confirm or Cancel order: (Confirm, Cancel)");

        String choice = scanner.nextLine();
        if(choice.equalsIgnoreCase("confirm")) {
            System.out.println("Order Confrimed!" +
                    "\nThank you for shopping with us");
            Receipt receipt = new Receipt(order.displayOrder());
        }
        else {
            System.out.println("Order Canceled");
            displayHomeScreen();
        }

    }
}
