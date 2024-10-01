package unidade3.Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Exercício 4
		
		Scanner sc = new Scanner(System.in);
		
		int N, in, out;
		N = sc.nextInt();
		in = 0;
		out = 0;
		
		for (int i = 0; i < N; i +=1) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in += 1;
			}
			else {
				out += 1;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();

	}

}
