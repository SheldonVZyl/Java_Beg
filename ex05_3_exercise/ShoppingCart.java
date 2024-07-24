package ex05_3_exercise;

//Exercise 5-3
//
//1. Create a for loop that iterates through the items array,
//     displaying each element. Precede the list of elements with 
//     the message, "Items purchased: ".
public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message;
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;

        String items[];
        items = new String[4];
        items[0] = "Shirt";
        items[1] = "Belt";
        items[2] = "Scarf";
        items[3] = "Hat";

        message = custName + " wants to purchase " + items.length + " items.";
        System.out.println(message);

        // Iterate through and print out the items from the items array
        System.out.println("Items purchased : ");
        for (String item : items) {
            System.out.println(item);
        }
    }
}
