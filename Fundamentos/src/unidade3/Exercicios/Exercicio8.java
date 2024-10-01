package unidade3.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// Exercício 8
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i += 1) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
