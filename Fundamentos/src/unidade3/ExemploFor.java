package unidade3;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		// Exemplo de estrutura for
		
		Scanner sc = new Scanner(System.in);
		int N, soma;
		N = sc.nextInt();
		soma = 0;
		
		for(int i = 0; i < N; i += 1) {
			int x = sc.nextInt();
			soma += x;
		}
		System.out.println(soma);
		
		sc.close();

	}

}
