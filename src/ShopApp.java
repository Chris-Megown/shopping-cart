import java.util.ArrayList;
import java.util.Scanner;

public class ShopApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<String> items = new ArrayList<String>();

		Item metaItem = new Item(null, 0, 0);
		String name;
		double price;
		int quantity;

		String keepShopping = "y";
		do
        {
          System.out.print ("Enter the name of the item: ");
          itemName = input.next();

          System.out.print ("Enter the unit price: ");
          itemPrice = input.nextDouble();

          System.out.print ("Enter the quantity: ");
          quantity = input.nextInt();

        //  cart1.addToCart(itemName, itemPrice, quantity);



     //     System.out.println(cart1);

          System.out.print ("Continue shopping (y/n)? ");
          keepShopping = input.next();
        }
    while (keepShopping.equals("y"));

  }
	System.out.println(metaItem.toString());
		
		
		

		// To Remove Items
		// for (int i = 0; i < cart.length; i++) {
		// Item remove = (Item) cart.get(i);
		// if (itemName.equals(remove.getName())) {
		// cart.remove(i);
		// System.out.println("\n" + "Item " + itemName + " wasn't found.");
		// System.out.println("Enter name of the item that you would like to remove: ");
		// choice = sc.next();
		// shoppingCart.remove(choice);
	
}