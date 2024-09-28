package unidade3.Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Exercício 3
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();		
		
		for(int Y = 0; Y < X; Y += 1) {
			if (Y % 2 == 1) {
				System.out.println(Y);
			}
		}
		
		sc.close();

	}

}
