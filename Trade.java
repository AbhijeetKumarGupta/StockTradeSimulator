package StockWork;

import java.util.Date;

public class Trade {

	private Item item;
	private Date date;
	private int numberOfShares;

	public Trade(Item item) {
		this.item = item;
		date = new Date();
	}

	public void displayTradeInfo() {
		System.out.println("Trade Date:" + date);
		item.displayInformation();
	}

	public int getNumberOfShares() {
		return numberOfShares;
	}

	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	@Override
	public String toString() {
		return "Trade [item=" + item + ", date=" + date + ", numberOfShares=" + numberOfShares + "]";
	}

}
