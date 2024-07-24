package ex08_2_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        Item item1 = new Item();

        // Call the 3-arg setItemFields method and then call displayItem.
        item1.setItemFields("Shoes", 1, 54.99);
        item1.displayItem();

        // Call the 4-arg setItemFields method, checking the return value.
        int retcode = item1.setItemFields("Jacket", 1, 64.99, ' ');
        if (retcode < 0) {
            System.out.println("Invalid color code. Item is not added.");
        } else {
            item1.displayItem();
        }
        // Test your code for both valid and invalid values
    }
}
