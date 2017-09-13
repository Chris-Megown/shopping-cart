import java.text.NumberFormat;

public class Item {

	String name;
	double price;
	int quantity;

	public Item(String itemName, double itemPrice, int itemQuantity) {
		name = itemName;
		price = itemPrice;
		quantity = itemQuantity;
	}

	public String toString() {
		// Item: Shoes Price: 25.0 Quantity: 2
		// Total Price: $50.00
		NumberFormat monies = NumberFormat.getCurrencyInstance();
		return ("Item: " + name + "\t" + "Price: " + monies.format(price) + "\t" + "Quantity: " + quantity
				+ "\nTotal Price: " + monies.format(price * quantity));
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public String nameOfItem() {
		return "Enter the name of the item: ";
	}

	public String nameOfPrice() {
		return "Enter the unit price: ";
	}

	public String nameOfQuantity() {
		return "Enter the quantity: ";
	}

}
