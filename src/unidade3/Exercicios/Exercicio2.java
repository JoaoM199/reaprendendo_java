package unidade3.Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Exercício 2
		Scanner sc = new Scanner(System.in);
		
		int entrada, alcool, gasolina, diesel;
		
		alcool = 0;
		gasolina = 0;
		diesel = 0;
		
		entrada = sc.nextInt();
		
		while (entrada != 4) {
				
			if (entrada == 1) {
				alcool += 1;
			}
			else if (entrada == 2) {
				gasolina += 1;
			}
			else if (entrada == 3) {
				diesel += 1;
			}
			
			entrada = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d%nGasolina: %d%nDiesel: %d%n", alcool, gasolina, diesel);

	}

}
