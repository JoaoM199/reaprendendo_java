package unidade3;

public class OperadoresString2 {

	public static void main(String[] args) {
		// Operador split
		String s = "potato apple lemon orange mango";
		
		String[] vect = s.split(" "); // Divide a string "s" usando separador " ".
		
		System.out.println("A partir da string '" + s + "' posso dividir em: ");
		System.out.printf("palavra 1 = %s%npalavra 2 = %s%npalavra 3 = %s%npalavra 4 = %s%npalavra 5 = %s%n", vect[0], vect[1], vect[2], vect[3], vect[4]);	

	}

}
