package entities;

public class Employee {
	public String Name;
	public double GrossSalary;
	public double Tax;
	
	public double NetSalary() {
		return GrossSalary - Tax;
	}
	
	public double IncreaseSalary(double percentage) {
		return GrossSalary += GrossSalary * percentage /100.0;
	}
	
	// Employee: Joao Silva, $ 5000.00
	public String toString() {
		return Name
				+ ", $ "
				+ String.format("%.2f", NetSalary());
	}

}
