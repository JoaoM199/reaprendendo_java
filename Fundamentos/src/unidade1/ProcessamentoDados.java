package unidade1;

public class ProcessamentoDados {

	public static void main(String[] args) {
		// Exemplo 1
		int x1,y1;
		x1 = 5;
		y1 = 12 * x1;
		
		System.out.println(x1);
		System.out.println(y1);
		
		// Exemplo 2
		int x2;
		double y2;
		
		x2 = 9;
		y2 = 2.1 * x2;
		
		System.out.println(x2);
		System.out.println(y2);
		
		// Exemplo 3
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B)/2.0 * h;
		
		System.out.println(area);
		
		// Exemplo 4
		int x3, y3;
		// Obs. Os números inteiros não geram decimais, por isso é necessário uma conversão
		double resultado3;
		x3 = 7;
		y3 = 2;
		
		resultado3 = (double) x3/y3; // conversão
		
		System.out.println(resultado3);
		
		// Exemplo 5
			// Compilador pensa que há perda de informação
		double x4;
		int y4;
		
		x4 = 5.0;
		// y4 = x4; é considerado um erro!
		y4 = (int) x4; // indicar que a variável é um int
		
		System.out.println(y4);

	}

}
