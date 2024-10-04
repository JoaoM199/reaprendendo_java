package electricityBill;

import java.util.Locale;
import java.util.Scanner;

import entities.ElectricityBill;

public class Application {

	public static void main(String[] args) {
		// Exercício extra 2 - Unidade 4
		/*
Crie uma classe ElectricityBill que contenha os atributos customerName, unitsConsumed e ratePerUnit. A
classe deve ter métodos para calcular o valor total da conta (calculateTotal) e exibir os dados da conta
(toString). Em seguida, crie um programa para ler os dados de uma conta de luz e mostrar o valor total.
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ElectricityBill bill = new ElectricityBill();
		
		System.out.println("Insert customer data:");
		System.out.print("Customer name: ");
		bill.customerName = sc.nextLine();
		
		System.out.print("Units consumed: ");
		bill.unitsConsumed = sc.nextInt();
		
		System.out.print("Rate per unit: ");
		bill.ratePerUnit = sc.nextDouble();
		
		System.out.println();
		System.out.println(bill);
		
		sc.close();

	}

}
