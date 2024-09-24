package unidade1;

import java.util.Scanner;

public class EntradaDados2 {

	public static void main(String[] args) {
		// Entrada de dados tipo Int
		Scanner sc = new Scanner(System.in);
		
		int valor1;
		valor1 = sc.nextInt();
		System.out.println("Você digitou o valor: " + valor1);
		
		// Entrada de dados tipo Double
		double valor2;
		valor2 = sc.nextDouble(); // User vírgula, caso esteja em PT-BR. Para US tem que configurar
		System.out.printf("Você digitou o valor: %.2f%n", valor2);
		
		sc.close();
	}

}
