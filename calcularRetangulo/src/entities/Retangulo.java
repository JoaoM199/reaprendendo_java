package entities;

public class Retangulo {
	
	public double b;
	public double h;
	
	public double area() {
		double A = b * h;
		return A;
	}
	
	public double perimetro() {
		double P = 2 * (b + h);
		return P;
	}
	
	public double diagonal() {
		double d = Math.sqrt((Math.pow(b, 2.0) + (Math.pow(h,2.0))));
		return d;
	}

}
