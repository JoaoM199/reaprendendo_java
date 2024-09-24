package reaprendendo.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Exercício 1
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.printf("Entrada: %na = %d %nb = %d %n______________________%n", a, b);
		
		int soma = a + b;
		System.out.printf("Soma = %d", soma);
		
		sc.close();

	}

}
