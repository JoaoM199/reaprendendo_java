package bookInfo;

import java.util.Locale;
import java.util.Scanner;

import entities.Book;

public class Application {

	public static void main(String[] args) {
		// Exercício extra 1 - Unidade 4
		/*
Crie uma classe Book que contenha os atributos title, author e price. A classe deve ter métodos para aplicar
um desconto ao preço (applyDiscount) e exibir os dados do livro (toString). Em seguida, crie um programa
para ler os dados de um livro, aplicar um desconto e mostrar os dados atualizados.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Book book = new Book();
		
		System.out.println("Insert book data");
		System.out.print("Book title: ");
		book.title = sc.nextLine();
		
		System.out.print("Book author: ");
		book.author = sc.nextLine();
		
		System.out.print("Price $: ");
		book.price = sc.nextDouble();
		
		System.out.println();
		System.out.println(book);
		
		System.out.println();
		System.out.print("Discount to apply $: ");
		double discount = sc.nextDouble();
		book.price = book.applyDiscount(discount);
		
		System.out.println();
		System.out.println(book);
		
		sc.close();

	}

}
