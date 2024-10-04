package entities;

public class ElectricityBill {
	public String customerName;
	public int unitsConsumed;
	public double ratePerUnit;
	
	
	public double calculateTotal() {
		return unitsConsumed * ratePerUnit;
	}
	
	public String toString() {
		return customerName
				+ ", Units: "
				+ unitsConsumed
				+ ", Rate: $ "
				+ ratePerUnit
				+ ", Total: $ "
				+ String.format("%.2f", calculateTotal());
	}
	

}
