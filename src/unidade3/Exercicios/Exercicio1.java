package unidade3.Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Exercício 1
		Scanner sc = new Scanner(System.in);
		int x, y;
		
		System.out.println("Insira os valores das cordenadas X e Y: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
				
		}

	}
