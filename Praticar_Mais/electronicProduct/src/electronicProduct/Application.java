package electronicProduct;

import java.util.Locale;
import java.util.Scanner;

import entities.ElectronicProduct;

public class Application {

	public static void main(String[] args) {
		// Exercício 4 - Unidade 4
		/*
Crie uma classe ElectronicProduct que contenha os atributos name, brand e price. A classe deve ter métodos
para aplicar um aumento de preço (increasePrice) e exibir os dados do produto (toString). Em seguida, crie
um programa para ler os dados de um produto eletrônico, aplicar um aumento de preço e mostrar os dados
atualizados.
		*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ElectronicProduct electronic = new ElectronicProduct();
		
		System.out.println("Insert product data:");
		System.out.print("Product name: ");
		electronic.setName(sc.nextLine());
		
		System.out.print("Product brand: ");
		electronic.setBrand(sc.nextLine());
		
		System.out.print("Product price: ");
		electronic.setPrice(sc.nextDouble());
		
		System.out.println();
		System.out.println(electronic);
		
		System.out.println();
		System.out.print("Insert product increase: ");
		double increase = sc.nextDouble();
		electronic.setPrice(electronic.increasePrice(increase));
		System.out.println(electronic);
		
		sc.close();

	}

}
