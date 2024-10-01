package orientacaoObjetos;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle; // classe importada

public class Aplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Cálculo de medidas de um triangulo com orientação à objetos
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Insira as medidas do triângulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Insira as medidas do triângulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		System.out.println("Triangulo X = " + areaX);
		System.out.println("Triangulo Y = " + areaY);
		
		sc.close();
		
		if (areaX > areaY) {
			System.out.println("Maior: Triangulo X");
		}
		else {
			System.out.println("Maior: Triangulo Y");
		}

	}

}
