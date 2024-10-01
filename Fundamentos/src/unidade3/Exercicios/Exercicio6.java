package unidade3.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Exercício 6
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i += 1) {
			int x, y;
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("Divisão impossível");
			}
			else {
				double div = (double) x/y;
				System.out.printf("%.1f%n", div);
			}
		}
		
		sc.close();

	}

}
