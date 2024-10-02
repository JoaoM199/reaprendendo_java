package dadosFuncionario;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Aplicativo {

	public static void main(String[] args) {
		// Exercício 2 - Módulo 4
		/*
		 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em 
		seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o 
		salário do funcionário com base em uma porcentagem dada (somente o salário bruto é 
		afetado pela porcentagem) e mostrar novamente os dados do funcionário. 
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Insert data");
		System.out.print("Name: ");
		employee.Name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.GrossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.Tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.IncreaseSalary(percentage);
		
		sc.close();
		
		System.out.println("Updated data: " + employee);
			
		}

	}