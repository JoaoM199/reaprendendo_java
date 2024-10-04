package entities;

public class Book {
	public String title;
	public String author;
	public double price;
	
	public double applyDiscount(double discount) {
		return price - (price * (discount/100));
	}
	
	public String toString() {
		return title 
				+ " by " 
				+ author
				+ ", "
				+ "$ "
				+ String.format("%.2f", price);
	}

}
