package unidade2.exercicios;

import java.util.Scanner;

public class Exercicio0 {

	public static void main(String[] args) {
		// Exercício 0
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		
		input = sc.nextInt();
		
		if (input < 0) {
			System.out.println("NEGATIVO");
		} 
		else {
			System.out.println("NÃO NEGATIVO");
		}
		
		sc.close();
		

	}

}
