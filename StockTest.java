package StockWork;

import java.util.ArrayList;
import java.util.Scanner;

public class StockTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerArray = new ArrayList<Customer>();
		Item[] itemArray = new Item[10];

		int cCounter = 0;
		int iCounter = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. Create a new Customer");
			System.out.println("2. Create a new Item");
			System.out.println("3. Initiate a Trade");
			System.out.println("4. Display all customers");
			System.out.println("5. Display all items");
			System.out.println("0. Exit");
			int choice = sc.nextInt();

			System.out.println();

			if (choice == 1) {
				System.out.println("Enter customer Id : ");
				customerArray.add(cCounter++, new Customer(sc.nextInt()));
				System.out.println();
			} else if (choice == 2) {
				System.out.println("1. Create a new Stock");
				System.out.println("2. Create a new Unrated Stock");
				System.out.println("3. Create a new MoneyPair");
				choice = sc.nextInt();

				System.out.println();

				if (choice == 1) {
					itemArray[iCounter++] = new Stock();
					System.out.println();
				} else if (choice == 2) {
					itemArray[iCounter++] = new Stock("CCC");
					System.out.println();
				} else if (choice == 3) {
					itemArray[iCounter++] = new MoneyPair();
					System.out.println();
				}
			} else if (choice == 3) {
				System.out.print("Please enter a customer ID: ");
				int cID = sc.nextInt();
				System.out.print("Please enter an item ID: ");
				int sID = sc.nextInt();
				int i, j;
				for (i = 0; i < cCounter; i++) {
					if (cID == customerArray.get(i).getId()) {
						break;
					}
				}
				for (j = 0; j < iCounter; j++) {
					if (sID == itemArray[j].getID()) {
						break;
					}
				}
				if (i != cCounter && j != iCounter) {
					Trade tmp = new Trade(itemArray[j]);
					customerArray.get(i).setOpenTrade(tmp);
				} else {
					System.out.println("Given Customer ID or Stock ID is not found!");
				}
				System.out.println();
			} else if (choice == 4) {
				for (int i = 0; i < cCounter; i++) {
					customerArray.get(i).displayCustomerInfo();
					System.out.println();
				}
			} else if (choice == 5) {
				for (int j = 0; j < iCounter; j++) {
					itemArray[j].displayInformation();
					System.out.println();
				}
			} else {
				break;
			}

		}
	}

}
