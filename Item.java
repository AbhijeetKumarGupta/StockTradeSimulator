package StockWork;

public class Item {

	private static int counter = 0;
	private int ID;
	private String name;
	private double price;

	public Item() {
		counter++;
		ID = counter;
	}

	public void displayInformation() {
		System.out.println("ID# is " + getID());
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Item.counter = counter;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [ID=" + ID + ", name=" + name + ", price=" + price + "]";
	}

}
