package unidade1.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Exercício 4
		Scanner sc = new Scanner(System.in);
		
		double number, hours, sph, salary;
		
		number = sc.nextDouble();
		hours = sc.nextDouble();
		sph = sc.nextDouble();
		
		salary = sph * hours;
		
		System.out.println("NUMBER = " + number);
		System.out.println("SALARY = " + salary);
		
		sc.close();
	}

}
