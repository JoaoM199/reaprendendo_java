package mediaNotaAlunos;

import java.util.Scanner;
import java.util.Locale;

import entities.Student;

public class Application {

	public static void main(String[] args) {
		// Exercícios 3 - Unidade 4
		/*
		 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano 
		(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no 
		ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam 
		para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Studentpara 
		resolver este problema.
		 * */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student grades = new Student();
		
		System.out.println("Insert student data");
		System.out.print("Name: ");
		grades.name = sc.nextLine();
		
		System.out.print("First grade: ");
		grades.n1 = sc.nextDouble();
		
		System.out.print("Secound grade: ");
		grades.n2 = sc.nextDouble();
		
		System.out.print("Third grade: ");
		grades.n3 = sc.nextDouble();
		
		System.out.println();
		System.out.println(grades);
		
		sc.close();

	}

}
