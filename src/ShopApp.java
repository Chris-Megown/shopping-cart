import java.util.ArrayList;
import java.util.Scanner;

public class ShopApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Item metaItems = new Item();
		String name;
		double price;
		int quantity;

		System.out.print(metaItems.nameOfItem());
		name = input.next();
		System.out.print(metaItems.nameOfPrice());
		price = input.nextInt();
		System.out.print(metaItems.nameOfQuantity());
		quantity = input.nextInt();
		System.out.println(name);
		System.out.println(price);
		System.out.println(quantity);

		ArrayList<String> items = new ArrayList<String>();
		items.add(name);

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
}