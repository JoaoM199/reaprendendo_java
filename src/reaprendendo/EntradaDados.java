package reaprendendo;

import java.util.Scanner; // Para a entrada funcionar

public class EntradaDados {

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in); -> Teclado modo console
		// sc.close -> Encerrar recurso de entrada
		Scanner sc = new Scanner(System.in);
		
		String nome;
		nome = sc.next(); // Palavra digitada pelo usuário (entrada)
		
		System.out.println("Você digitou: " + nome);
		
		sc.close();
	}

}
