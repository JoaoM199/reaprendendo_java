package unidade3.Exercicios;

import java.util.Scanner;

public class Exercicio0 {

	public static void main(String[] args) {
		// Exercício 0
		
		Scanner sc = new Scanner(System.in);
		int senha;
		
		System.out.println("Insira a senha. Dica: Quatro digitos numericos: ");
		senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		System.out.println("Acesso permitido");
		
		sc.close();
	}

}
