package StockWork;

import java.util.Scanner;

enum StockValue {
   AAA("Triple A (top-tier)"), AAB("Double A – B"), ABB("A – Double B"),
   BBB("Triple B (lowest recommended for credibility)"), BBC("Double B – C"), BCC("B – Double C"),
   CCC("Triple C (lowest quality)");

   private String str;

   StockValue(String str) {
       this.str = str;
   }

   public String getValue() {
       return str;
   }
}

public class Stock extends Item {

   private StockValue rating;
   private int numberOfShares;

   public Stock() {
       this(null);
   }

   public Stock(String unrated) {
       super();
       Scanner sc = new Scanner(System.in);
       System.out.print("Please enter company name: ");
       setName(sc.nextLine());
       if (unrated == null) {
           System.out.print("Please enter rating: ");
           rating = StockValue.valueOf(sc.nextLine());
       } else {
           rating = StockValue.valueOf(unrated);
       }
       System.out.print("Please enter stock price: ");
       setPrice(Double.parseDouble(sc.nextLine()));
       System.out.print("Please enter number of the shares: ");
       numberOfShares = Integer.parseInt(sc.nextLine());
       System.out.println();
       System.out.println("ID #" + getID() + " is given for Stock " + getName() + "!");
   }

   public void displayInformation() {
       super.displayInformation();
       System.out.println("Company name is: " + getName());
       System.out.println("Rating is: " + rating.getValue());
       System.out.println("Stock price is: " + getPrice());
       System.out.println("Number of shares is: " + numberOfShares);
   }

   public StockValue getRating() {
       return rating;
   }

   public void setRating(StockValue rating) {
       this.rating = rating;
   }
}