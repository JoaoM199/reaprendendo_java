package unidade2;

import java.util.Scanner;
import java.util.Locale;

public class Desconto {

	public static void main(String[] args) {
		// Exemplo de Expressão condicional ternária
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco, desconto;
		preco = sc.nextDouble();
		
		desconto = (preco < 20.00) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
		
		sc.close();

	}

}
