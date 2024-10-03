package entities;

public class Grades {
	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public double finalGrade() {
		return n1 + n2 + n3;
	}
	
	public boolean isAproved() {
		return finalGrade() >= 60;
	}
	
	public double missingPoints() {
		if (isAproved()) {
			return 0.0;
		}
		else {
			return 60.0 - finalGrade();
		}
	}
	
	public String toString() {
		return "FINAL GRADE = " 
				+ String.format("%.2f", finalGrade()) 
				+ "\n"
				+ (isAproved() ? "PASS" : "FAILED\nMissing " 
				+ String.format("%.2f", missingPoints()) 
				+ " points");
	}

}
