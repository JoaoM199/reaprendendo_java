package carDepreciate;

import java.util.Locale;
import java.util.Scanner;

import entities.Car;

public class Application {

	public static void main(String[] args) {
		// Exercício extra 3 - Unidade 4
		/*
Crie uma classe Car que contenha os atributos model, year e price. A classe deve ter métodos para depreciar o
valor do carro (depreciate) e exibir os dados do carro (toString). Em seguida, crie um programa para ler os
dados de um carro, depreciar seu valor e mostrar os dados atualizados.
		*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Car car = new Car();
		
		System.out.println("Insert car data:");
		System.out.print("Model: ");
		car.model = sc.nextLine();
		
		System.out.print("Year: ");
		car.year = sc.nextInt();
		
		System.out.print("Price: ");
		car.price = sc.nextDouble();
		
		System.out.println();
		System.out.println(car);
		
		System.out.println();
		System.out.print("Insert car depreciate: ");
		double percetage = sc.nextDouble();
		car.price = car.depreciate(percetage);
		
		System.out.println();
		System.out.println(car);
		
		sc.close();

	}

}
