package reaprendendo;

import java.util.Scanner;

public class FuncoesMatematicas2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b, c;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		System.out.printf("a = %f %nb = %f %nc = %f %n", a, b, c);
		
		double delta = (Math.pow(b, 2.0)) - (4 * a * c);
		
		double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.printf("x1 = %.2f %nx2 = %.2f %ndelta = %.2f", x1, x2, delta);
		sc.close();

	}

}
