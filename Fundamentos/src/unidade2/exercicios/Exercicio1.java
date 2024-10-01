package unidade2.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Exercício 1
		Scanner sc = new Scanner(System.in);
		int input, output;
		input = sc.nextInt();
		
		output = input % 2;
		
		if (output == 0) {
			System.out.println("PAR");
		} 
		else {
			System.out.println("IMPAR");
		}
		
		sc.close();

	}

}
