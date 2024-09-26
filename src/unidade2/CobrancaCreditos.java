package unidade2;

import java.util.Locale;
import java.util.Scanner;

public class CobrancaCreditos {

	public static void main(String[] args) {
		// Exercício extra condicionais
		// Cobrança de uma operadora - Plano básico
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		double conta;
		minutos = sc.nextInt();
		conta = 50.00;
		
		if (minutos > 100) {
			conta = conta + (minutos - 100) * 2;
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
		sc.close();

	}

}
