package entities;

public class Grades {
	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public String toString(double sum) {
		sum = n1 + n2 + n3;
		double missing = 60 - sum;
		if (sum >= 60) {
			return "FINAL GRADE = "
					+ sum
					+ "\n"
					+ "PASS";
		} 
		else {
			return "FINAL GRADE = "
					+ sum
					+ "\n"
					+ "FAILED"
					+ "\n"
					+ "MISSING" 
					+ missing
					+ " POINTS";
		}
		
	}

}
