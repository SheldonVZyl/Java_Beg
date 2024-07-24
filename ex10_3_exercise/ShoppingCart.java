
package ex10_3_exercise;

//Exercise 10-3
//
//In the Order class:
//1. Rewrite the calcDiscount code using a switch statement.  
//     Use a ternary expression to replace the nested if logic.
//     For better performance, use a break statement in each case block.
//     Include a default block to handle invalid custType values.
//
//2. Run the ShoppingCart class again to test your logic.

public class ShoppingCart {
    public static void main(String args[]){
        Order order = new Order("Rick Grimes", 910.00, "VA", Order.PRIVATE);
        System.out.println("Discount is: "+ order.getDiscount());
    }
}
