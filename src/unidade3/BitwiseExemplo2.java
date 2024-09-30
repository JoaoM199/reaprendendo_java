package unidade3;

import java.util.Scanner;

public class BitwiseExemplo2 {

	public static void main(String[] args) {
		// Teste de bits em rede
		
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b00100000; // 0b = indica para o java que este valor possui base binária
		int n = sc.nextInt();
		
		if ((n & mask) != 0) { // Compara a máscara com o valor digitado
			System.out.println("6th bit is true!");
		}
		else {
			System.out.println("6th bit is false!");
		}
		
		sc.close();

	}

}
