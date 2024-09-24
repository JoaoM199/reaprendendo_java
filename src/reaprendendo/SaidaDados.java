package reaprendendo;

import java.util.Locale;

public class SaidaDados {

	public static void main(String[] args) {
		
		int y = 64;
		double x = 10.1053;
		double comprimento = 31.57896;
		
		Locale.setDefault(Locale.US); // Imprime números decimais no formato americano
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x); // Imprime variável x com 2 casas decimais
			// printf -> Imprimir formatado
			// %.2f -> Duas casas decimais
			// %n -> Quebra de linha
		System.out.println("Resultado = " + comprimento + " metros");
		System.out.printf("Resultado = %.2f metros%n", comprimento); // Mais prático
		
		//////////////////////////////////
		String nome = "Carla";
		int idade = 28;
		double renda = 8325.80;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		/*
		 * 		%f = ponto flutuante
		 * 		%d = inteiro
		 * 		%s = texto
		 * 		%n = quebra de linha
		 * */

	}

}
