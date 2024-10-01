package calcularRetangulo;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Aplicativo {

	public static void main(String[] args) {
		// Unidade 4 - Exercício 1
		/* 
		 *  Fazer um programa para ler os valores da largura e altura 
			de um retângulo. Em seguida, mostrar na tela o valor de 
			sua área, perímetro e diagonal. Usar uma classe como 
			mostrado no projeto ao lado.
		 * */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Retangulo ret;
		ret = new Retangulo();
		
		System.out.print("Digite a largura do retângulo em cm: ");
		ret.b = sc.nextDouble();
		System.out.print("Digite a altura do retângulo em cm: ");
		ret.h = sc.nextDouble();
		
		System.out.printf("%n___________________________________%n");
		double A, P, d;
		A = ret.area();
		P = ret.perimetro();
		d = ret.diagonal();
		
		System.out.printf("Área: %.2f%nPerímetro: %.2f%nDiagonal: %.2f%n", A, P, d);

	}

}
