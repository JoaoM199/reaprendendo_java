package unidade3;

import java.util.Locale;
import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		// Exemplo Do While
		// °C para °F
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double C, F;
		char resp;
		
		resp = 's';
		do {
			System.out.print("Digite a temperatura em °C: ");
			C = sc.nextDouble();
			F = (9.0 * C)/5 + 32;
			System.out.printf("Equivalente em °F: %.1f%n", F);
			
			System.out.print("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		
		sc.close();

	}

}
