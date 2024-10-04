package entities;

public class Car {
	public String model;
	public int year;
	public double price;
	
	public double depreciate(double percentage) {
		return price - (price * (percentage/100));
	}
	
	public String toString() {
		return model
				+ ", Year: "
				+ year
				+ ", Prince $ "
				+ price;
	}

}
