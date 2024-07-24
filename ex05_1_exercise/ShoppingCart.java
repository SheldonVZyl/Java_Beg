package ex05_1_exercise;

//Exercise 5-1:
//
//1. Declare a boolean, outOfStock, and initialize it to true.
//2. Use an if statement to test the value of quantity.  
//    If it is > 1, concatenate an 's' to message so that it indicates multiple items.
//3. Use an if | else statement that tests the value of outOfStock.
//    If true, let the user know the item is unavailable.
//    If false, print the message variable, then print the total cost with tax.
//4. Run with outOfStock = true and then again with outOfStock = false.
public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

        // numeric fields
        double price = 21.99;
        int quantity = 100;
        double tax = 1.04;
        double total;
        String message = custName + " wants to purchase " + quantity + " " + itemDesc;

        // Calculating total cost
        total = (price * quantity) * tax;

        // Declare outOfStock variable and initialize it
        boolean outOfStock = false;

        // Test quantity and modify message if quantity > 1.
        if (quantity > 1) {
            message = message + "s";
        }

        // Test outOfStock and notify user in either case. 
        if (outOfStock) {
            System.out.println("Sorry we don't have stock of those items");
        } else {
            System.out.println(message);
        }
    }

}
