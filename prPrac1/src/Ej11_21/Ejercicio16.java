package Ej11_21;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// 16.- Un programa tiene como entrada dos números y los almacena en las
		// variables “u” y “v”.
		// ¿Qué hay que hacer par que al final del algoritmo los valores de las
		// variables estén
		// intercambiados? Diseña el algoritmo correspondiente.
		// Definimos
		int u,
			v,
			temp;
		// Crear un objeto Scanner para leer los datos del usuario
		Scanner sc = new Scanner(System.in);

		// Solicitar al usuario los valores de u y v
		System.out.print("Introduce el valor de u: ");
		u = sc.nextInt();

		System.out.print("Introduce el valor de v: ");
		v = sc.nextInt();

		// Mostrar valores originales
		System.out.println("Valores antes del intercambio: u = " + u + ", v = " + v);

		// Intercambiar los valores usando una variable temporal
		temp = u; // Guardar el valor de u en temp
		u = v; // Asignar el valor de v a u
		v = temp; // Asignar el valor de temp (que es el valor original de u) a v

		// Mostrar los valores intercambiados
		System.out.println("Valores después del intercambio: u = " + u + ", v = " + v);

		// Cerrar el scanner
		sc.close();

	}

}
