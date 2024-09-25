package unidade2.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Exercicio 2
		Scanner sc = new Scanner(System.in);
		int A, B, mult;
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A > B) {
			mult = A % B;
		}
		else {
			mult = B % A;
		}
		
		if (mult == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
	}

}
