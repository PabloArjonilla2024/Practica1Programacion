package Ej1_10;

public class Ejercicio8_2 {

	public static void main(String[] args) {
		// b) Dado el siguiente programa, traza su ejecución y
		// determina los resultados si los datos de entrada son: 7 y 11.
		// Constantes
		final int n = 10;
		// Variables
		int a, b, c = 0;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);

		c = a - b + n;
		c = c + c;
		b = a + b - c;
		a = a + b - c;
		a = n * a;
		System.out.println(a);
		// Dado que A es 7 y B es 11, el resultado es 10.
	}

}
