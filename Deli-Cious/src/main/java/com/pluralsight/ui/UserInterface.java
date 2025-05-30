package com.pluralsight.ui;

import com.pluralsight.enums.*;
import com.pluralsight.model.*;
import com.pluralsight.data.Receipt;

import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    Order order;

    public void run() {
        displayHomeScreen();
    }

    public void displayHomeScreen() {
        System.out.println
                ("1: New Order" +
                "\n0: Exit" +
                "\nEnter Choice: ");

        String choice = scanner.nextLine();

        switch (choice) {
            case "0":
                System.out.println("Thank you for visiting our amazing and delicious shop!");
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

        while (isOrdering) {
            System.out.println
                    ("1: Add Sandwich" +
                    "\n2: Add Drink" +
                    "\n3: Add Chips" +
                    "\n4: Checkout" +
                    "\n0: Cancel Order" +
                    "\nEnter Choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "0":
                    System.out.println("Order Canceled :( ");
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
        System.out.println
                ("Select Bread" +
                "\n1: White" +
                "\n2: Wheat" +
                "\n3: Rye" +
                "\n4: Wrap" +
                "\nEnter Choice: ");

        String inputBread = scanner.nextLine().toLowerCase();
        Bread bread = null;

        switch (inputBread) {
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
        System.out.println
                ("Select Sandwich Size by Inch " +
                        "\n1: 4 Inch" +
                        "\n2: 8 Inch" +
                        "\n3: 12 Inch" +
                        "\nEnter Choice: ");

        String size = scanner.nextLine();
        int sizee = 0;

        switch (size){
            case "1":
                sizee = 4;

                break;
            case "2":
                sizee = 8;
                break;

            case "3":
                sizee = 12;
                break;
        }

        //Creating the initial sandwich
        Sandwich sandwich = new Sandwich(bread, sizee);

        //Selecting meats
        boolean keepAdding = true;

        while (keepAdding) {
            System.out.println
                    ("Select Topping!! " +
                            "(Meat, " +
                            "Cheese, " +
                            "Veggies, " +
                            "Sauces, " +
                            "Exit)" +
                    "\nEnter Choice: ");
            String choice = scanner.nextLine().toLowerCase();

            switch (choice) {
                case "meat":
                    System.out.println("Select Meat!! " +
                                    "\n1: Steak" +
                                    "\n2: Ham" +
                                    "\n3: Salami" +
                                    "\n4: RoastBeef" +
                                    "\n5: Chicken" +
                                    "\n6: Bacon" +
                                    "\nEnter Choice: ");

                    String meat = scanner.nextLine().toLowerCase();

                    switch (meat) {
                        case "1":
                            sandwich.addMeat(Meat.STEAK);
                            break;
                        case "2":
                            sandwich.addMeat(Meat.HAM);
                            break;
                        case "3":
                            sandwich.addMeat(Meat.SALAMI);
                            break;
                        case "4":
                            sandwich.addMeat(Meat.ROASTBEEF);
                            break;
                        case "5":
                            sandwich.addMeat(Meat.CHICKEN);
                            break;
                        case "6":
                            sandwich.addMeat(Meat.BACON);
                            break;
                    }
                    break;

                case "cheese":
                    System.out.println
                            ("Select Cheese!! " +
                                    "\n1: American" +
                                    "\n2: Provolone" +
                                    "\n3: Cheddar" +
                                    "\n4: Swiss" +
                                    "\nEnter Choice: ");

                    String cheese = scanner.nextLine().toLowerCase();

                    switch (cheese) {
                        case "1":
                            sandwich.addCheese(Cheese.AMERICAN);
                            break;
                        case "2":
                            sandwich.addCheese(Cheese.PROVOLONE);
                            break;
                        case "3":
                            sandwich.addCheese(Cheese.CHEDDAR);
                            break;
                        case "4":
                            sandwich.addCheese(Cheese.SWISS);
                            break;
                    }

                    // sandwich.addCheese(cheese);
                    break;
                case "veggies":
                    System.out.println("Select Regular Toppings!!" +
                            "\n1: Lettuce" +
                            "\n2: Peppers" +
                            "\n3: Onions" +
                            "\n4: Tomatoes" +
                            "\n5: Jalapenos" +
                            "\n6: Cucumber" +
                            "\n7: Pickles" +
                            "\n8: Guacamole" +
                            "\n9: Mushrooms" +
                            "\nEnter Choice: ");


                    String regulartopping = scanner.nextLine().toLowerCase();
                    RegularToppings regularTopping = null;

                    switch (regulartopping) {

                        case "1":
                            sandwich.addRegularToppings(RegularToppings.LETTUCE);
                            break;
                        case "2":
                            sandwich.addRegularToppings(RegularToppings.PEPPERS);
                            break;
                        case "3":
                            sandwich.addRegularToppings(RegularToppings.ONIONS);
                            break;
                        case "4":
                            sandwich.addRegularToppings(RegularToppings.TOMATOES);
                            break;
                        case "5":
                            sandwich.addRegularToppings(RegularToppings.JALAPENOS);
                            break;
                        case "6":
                            sandwich.addRegularToppings(RegularToppings.CUCUMBERS);
                            break;
                        case "7":
                            sandwich.addRegularToppings(RegularToppings.PICKLES);
                            break;
                        case "8":
                            sandwich.addRegularToppings(RegularToppings.GUACAMOLE);
                            break;
                        case "9":
                            sandwich.addRegularToppings(RegularToppings.MUSHROOMS);
                            break;
                    }

                   // sandwich.addRegularToppings(regularTopping);
                    break;

                case "sauces":
                    System.out.println("Select Sauces!!" +
                            "\n1: Mayo" +
                            "\n2: Mustard" +
                            "\n3: Ketchup" +
                            "\n4: Ranch" +
                            "\n5: Thousand Island" +
                            "\n6: Vinaigrette" +
                            "\nEnter Choice: ");

                    String sauces = scanner.nextLine().toLowerCase();
                    Sauces sauce = null;

                    switch (sauces) {

                        case "1":
                            sauce = Sauces.MAYO;
                            break;
                        case "2":
                            sauce = Sauces.MUSTARD;
                            break;
                        case "3":
                            sauce = Sauces.KETCHUP;
                            break;
                        case "4":
                            sauce = Sauces.RANCH;
                            break;
                        case "5":
                            sauce = Sauces.THOUSANDISLAND;
                            break;
                        case "6":
                            sauce = Sauces.VINAIGRETTE;
                    }

                    sandwich.SetSauce(sauce);
                    break;

                case "exit":
                    System.out.println("Do you want your sandwich toasted? (Yes or No)");
                    String toastedChoice = scanner.nextLine();
                    if (toastedChoice.equalsIgnoreCase("yes")) {
                        sandwich.setIsToasted("Is Toasty :) ");
                    } else {
                        sandwich.setIsToasted("Not Toasty :( ");
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

        while (isOrdering) {
            System.out.println("Select Drink Size (S, M, L)" +
                    "\nEnter Choice: ");

            String size = scanner.nextLine().toUpperCase();

            System.out.println("Which flavor do you want? (Coke, Sprite, Pepsi, Fanta, Water)" +
                    "\nEnter Choice: ");
            String flavor = scanner.nextLine().toLowerCase();

            Drink drink = new Drink(flavor, size);

            order.addItemToOrder(drink);

            isOrdering = false;
        } //end of while loop
    }

    public void displayAddChipsScreen() {
        boolean isOrdering = true;

        while (isOrdering) {
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
        if (choice.equalsIgnoreCase("confirm")) {
            System.out.println("Order Confirm!!, enjoy the Delicious meal" +
                    "\nThank you for eating with us");
            Receipt info = new Receipt(order.displayOrder());
        } else {
            System.out.println("Order Canceled");
            displayHomeScreen();
        }

    }
}
