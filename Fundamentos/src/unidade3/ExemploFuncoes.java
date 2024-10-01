package unidade3;

import java.util.Scanner;

public class ExemploFuncoes {
	
	// # Função principal #
	public static void main(String[] args) {
		// Exemplo de uso de funções
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		result(higher);
		
		sc.close();

	}
	
	public static int max(int x, int y, int z) { // Função tipada
		int aux = 0;
		
		if (x > y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		
		return aux;
	}
	
	public static void result(int resp) { // Função não tipada
		System.out.println("O maior valor é " + resp);
	}

}
