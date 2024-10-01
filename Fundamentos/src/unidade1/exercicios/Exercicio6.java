package unidade1.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Exercício 6
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, pi;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		pi = 3.14159;
		
		double triangulo, circulo, trapezio, quadrado, retangulo;
		triangulo = (A * C) / 2.0;
		circulo = pi * Math.pow(C, 2.0);
		trapezio = (A + B) / 2 * C;
		quadrado = Math.pow(B, 2);
		retangulo = A * B;
		
		System.out.printf("Triângulo = %.3f%n", triangulo);
		System.out.printf("Círculo = %.3f%n", circulo);
		System.out.printf("Trapézio = %.3f%n", trapezio);
		System.out.printf("Quadrado = %.3f%n", quadrado);
		System.out.printf("Retângulo = %.3f%n", retangulo);
		
		sc.close();
		
	}

}
