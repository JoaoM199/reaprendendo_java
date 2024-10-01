package unidade3.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// Exercício 7
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, fat;
		
		N = sc.nextInt();
		
		fat = 1;
		
		for (int i = 1; i <= N; i += 1) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		sc.close();

	}

}
