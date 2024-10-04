package studentGrades;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Application {

	public static void main(String[] args) {
		// Exercício 5 - Unidade 4
		/*
Crie uma classe Student que contenha os atributos name, grades (um array de notas) e average. A classe deve
ter métodos para calcular a média das notas (calculateAverage) e exibir os dados do aluno (toString). Em
seguida, crie um programa para ler os dados de um aluno, calcular sua média e mostrar os dados.
		*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Enter student data: ");
		System.out.print("Name: ");
		student.setName(sc.nextLine());
		
		System.out.print("Number of grades: ");
		int numGrades = sc.nextInt();
		double[] grades = new double[numGrades];
		
		for (int i = 0; i < numGrades; i += 1) {
			System.out.print("Enter grade " + (i + 1) + ": ");
			grades[i] = sc.nextDouble();
		}
		
		student.setGrade(grades);
		
		System.out.println(student);
		sc.close();

	}

}
