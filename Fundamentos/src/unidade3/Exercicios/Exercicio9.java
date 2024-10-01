package unidade3.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// Exercício 9
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i += 1) {
			int valor1, valor2, valor3;
			
			valor1 = i;
			valor2 = i * i;
			valor3 = i * i * i;
			
			System.out.printf("%d %d %d%n", valor1, valor2, valor3);
		}
		
		sc.close();

	}

}
