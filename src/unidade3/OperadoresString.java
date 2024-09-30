package unidade3;

public class OperadoresString {

	public static void main(String[] args) {
		// Uso de operadores para string
		
		String original = "abcde FGHIJ ABC abc DEFG      ";
		
		//Converter para letras minúsculas
		String s01 = original.toLowerCase();
		System.out.println("original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("_______________________________________________");
		
		//Converter para letras minúsculas
		String s02 = original.toUpperCase();
		System.out.println("original: -" + original + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("_______________________________________________");
		
		//Cortar excesso de espaços
		String s03 = original.trim();
		System.out.println("original: -" + original + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("_______________________________________________");
		
		// Cortar os dois primeiros caracteres
		String s04 = original.substring(2);
		System.out.println("original: -" + original + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("_______________________________________________");
		
		// Cortar os dois primeiros caracteres e 9 últimos
		String s05 = original.substring(2,9);
		System.out.println("original: -" + original + "-");
		System.out.println("substring(2,9): -" + s05 + "-");
		System.out.println("_______________________________________________");
		
		// Substituir um caractere específico
		String s06 = original.replace('a', 'x');
		System.out.println("original: -" + original + "-");
		System.out.println("replace char: -" + s06 + "-");
		System.out.println("_______________________________________________");
		
		// Substituir uma string específica
		String s07 = original.replace("abc", "xyz");
		System.out.println("original: -" + original + "-");
		System.out.println("replace string: -" + s07 + "-");
		System.out.println("_______________________________________________");
		
		// Índice do caractere/string
		int index = original.indexOf("bc"); // calcula a posição do caractere
		int lastIndex = original.lastIndexOf("bc"); // calcula a última ocorrência do caractere
		
		System.out.println("Index of 'bc': " + index);
		System.out.println("Last index of 'bc': " + lastIndex);
		System.out.println("_______________________________________________");

	}

}
