package entities;

public class Student {
	private String name;
	private double[] grades;
	private double average;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double[] getGrade() {
		return grades;
	}
	
	public void setGrade(double[] grades) {
		this.grades = grades;
	}
	
	public double getAverage() {
		return average;
	}
	
	public void setAverage(double average) {
		this.average = average;
	}
	
    private double calculateAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
    
    private String resultAverage() {
    	if (calculateAverage() >= 7.0) {
    		return "Pass";
    	}
    	else {
    		return "Failed";
    	}
    }

    @Override
    public String toString() {
        StringBuilder gradesStr = new StringBuilder();
        for (double grade : grades) {
            gradesStr.append(grade).append(" ");
        }
        return "Name: " 
        		+ name 
        		+ ", Grades: " 
        		+ gradesStr.toString().trim() 
        		+ ", Average: " 
        		+ String.format("%.1f", calculateAverage())
        		+ ", Result: "
        		+ resultAverage();
    }
}
