package StockWork;

public class Customer {
	
	private int id;
	private Trade trade;
	
	public Customer(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int customerId) {
		this.id = customerId;
	}
	public Trade getOpenTrade() {
		return trade;
	}
	public void setOpenTrade(Trade trade) {
		this.trade = trade;
	}
	public void displayCustomerInfo() {
		System.out.println("Customer [id=" + id + ", trade=" + trade.toString() + "]");
	}

}
