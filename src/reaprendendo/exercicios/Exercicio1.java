package reaprendendo.exercicios;

import java.util.Locale;

public class Exercicio1 {

	public static void main(String[] args) {
		// Variaveis
		String product1 = "Computer";
		String product2 = "DVD player";
		
		int age = 25;
		int code = 4235;
		char gender = 'F';
		
		double price1 = 700.64;
		double price2 = 31.25;
		double measure = 52.156845629;
		
		// Saída
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f %n", product1, price1);
		System.out.printf("%s, which price is $ %.2f %n", product2, price2);
		
		System.out.printf("Record: %d years old, code %d and gender: %s %n", age, code, gender);
		
		System.out.printf("Measure with eight decimal places: %f %n", measure);
		System.out.printf("Rounded (three decimal places): %.3f %n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f %n", measure);
	}

}
