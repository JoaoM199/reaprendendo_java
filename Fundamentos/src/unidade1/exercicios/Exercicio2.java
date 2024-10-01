package unidade1.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Exercício 2
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
		
			double raio, area, pi = 3.14159;
		raio = sc.nextDouble();
		area = pi * Math.pow(raio, 2.0);
		
		System.out.printf("pi=%.2f %n___________________%n", raio);
		System.out.printf("A=%.4f%n", area);
		
		sc.close();
	}

}
