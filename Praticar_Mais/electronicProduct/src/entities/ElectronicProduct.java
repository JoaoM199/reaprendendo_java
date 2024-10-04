package entities;

public class ElectronicProduct {
	private String name;
	private String brand;
	private double price;
	
	// Encapsulamento
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public double increasePrice(double increase) {
		return price + (price * (increase/100));
	}
	
	public String toString() {
		return getName() 
				+ " by "
				+ getBrand()
				+ ", $ "
				+ String.format("%.2f", price);
	}

}
