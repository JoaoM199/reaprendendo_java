package unidade2;

import java.util.Locale;
import java.util.Scanner;

public class AtribuicaoCumulativa {

	public static void main(String[] args) {
		// Atribuição cumulativa
		// Sintaxe opcional
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		double conta;
		minutos = sc.nextInt();
		conta = 50.00;
		
		if (minutos > 100) {
			conta += (minutos - 100) * 2; // Atribuição cumulativa +=
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
		sc.close();

	}

}
