package reaprendendo.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Exercício 3
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		diferenca = (A * B - C * D);
		
		System.out.printf("Entrada: %nA = %d %nB = %d %nC = %d %nD = %d%n", A, B, C, D);
		System.out.println("_____________");
		System.out.printf("Saída: %nDIFERENÇA = %d", diferenca);
		
		sc.close();
	}

}
