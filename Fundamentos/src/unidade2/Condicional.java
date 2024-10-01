package unidade2;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		// Estruturas condicionais
		
		Scanner sc = new Scanner(System.in);
		
		int hora;
		System.out.println("que horas são?");
		hora = sc.nextInt();
		
		if (hora <= 12) {
			System.out.println("Bom dia");
		} 
		else {
			if (hora < 18) {
				System.out.println("Boa tarde");
			} 
			else {
				System.out.println("Boa noite");
			}
		}
	}

}
