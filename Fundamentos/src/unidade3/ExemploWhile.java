package unidade3;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		// Exmplo While
		
		Scanner sc = new Scanner(System.in);
		int x, soma;
		
		x = sc.nextInt();
		soma = 0;
		
		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		
		sc.close();
		System.out.println(soma);

	}

}
