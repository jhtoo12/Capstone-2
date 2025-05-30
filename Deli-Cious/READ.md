#  Sandwich Shop Ordering System

##  Deli-Cious

This project, Customers can interact with the system:

- Start a new order
- Customize sandwiches with size, bread, meats, cheeses, veggies, and sauces
- Choose chips and drinks
- Toast their sandwich
- Review and confirm their order
- Print a receipt

The application uses OOP


![Screenshot 2025-05-30 090537.png](../../../Users/Student/Pictures/Screenshots/Screenshot%202025-05-30%20090537.png)

![Screenshot 2025-05-30 090643.png](../../../Users/Student/Pictures/Screenshots/Screenshot%202025-05-30%20090643.png)

![Screenshot 2025-05-30 090819.png](../../../Users/Student/Pictures/Screenshots/Screenshot%202025-05-30%20090819.png)



Here is a cool code from the `UserInterface` class where users customize their sandwich. This part demonstrates how the app allows dynamic addition of ingredients.

```java
while (keepAdding) {
    System.out.println("Select Topping!! (Meat, Cheese, Veggies, Sauces, Exit)\nEnter Choice: ");
    String choice = scanner.nextLine().toLowerCase();

    switch (choice) {
        case "meat":
            System.out.println("Select Meat!!\n1: Steak\n2: Ham\n3: Salami\n4: RoastBeef\n5: Chicken\n6: Bacon\nEnter Choice:");
            String meat = scanner.nextLine();
            switch (meat) {
                case "1": sandwich.addMeat(Meat.STEAK); break;
                case "2": sandwich.addMeat(Meat.HAM); break;
                case "3": sandwich.addMeat(Meat.SALAMI); break;
                case "4": sandwich.addMeat(Meat.ROASTBEEF); break;
                case "5": sandwich.addMeat(Meat.CHICKEN); break;
                case "6": sandwich.addMeat(Meat.BACON); break;
            }
            break;
        // Additional cases for cheese, veggies, and sauces...
        case "exit":
            sandwich.setIsToasted(scanner.nextLine().equalsIgnoreCase("yes"));
            order.addItemToOrder(sandwich);
            keepAdding = false;
            break;
    }
}