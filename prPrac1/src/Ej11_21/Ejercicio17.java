package Ej11_21;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// 17.- Escribir un programa que reciba 4 números naturales a, b, c y d y que
		// calcule:
		// (a^b + c^d) * (a^c + b^d)
		//Definimos
		int a,
			b,
			c,
			d;
		double parte1,
			   parte2,
			   resultado;
		// Crear un objeto Scanner para leer los datos del usuario
		Scanner sc = new Scanner(System.in);

		// Solicitar al usuario los cuatro números naturales a, b, c y d
		System.out.print("Introduce el valor de a: ");
		a = sc.nextInt();

		System.out.print("Introduce el valor de b: ");
		b = sc.nextInt();

		System.out.print("Introduce el valor de c: ");
		c = sc.nextInt();

		System.out.print("Introduce el valor de d: ");
		d = sc.nextInt();

		// Calcular la expresión (a^b + c^d) * (a^c + b^d)
		parte1 = Math.pow(a, b) + Math.pow(c, d);  // a^b + c^d
		parte2 = Math.pow(a, c) + Math.pow(b, d);  // a^c + b^d
		resultado = parte1 * parte2;

		// Mostrar el resultado
		System.out.println("El resultado de la expresión es: " + resultado);

		// Cerrar el scanner
		sc.close();

	}

}
