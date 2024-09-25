package unidade2.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Exercício 3
		Scanner sc = new Scanner(System.in);
		
		int inicio, fim, total, duracao;
		
		total = 24;
		inicio = sc.nextInt();
		fim = sc.nextInt();
		
		if (inicio < fim) {
			duracao = fim + inicio;
		}
		else {
			duracao = total - inicio + fim;
		}
		System.out.println("O JOGO DUROU " + duracao + " HORAS");
		
		sc.close();

	}

}
