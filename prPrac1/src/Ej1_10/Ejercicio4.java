package Ej1_10;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// 4.- Diseñar una aplicación que calcule la longitud y el área de una
		// circunferencia.
		// Para ello el usuario debe introducir el radio (que puede contender
		// decimales).
		// Definimos el radio
		int radio;
		double area, longitud;

		// Abremos el escaner
		Scanner sc = new Scanner(System.in);

		// Solicitamos el radio
		System.out.print("Escribe el radio: ");
		radio = sc.nextInt();

		// Calculamos el area y la longitud
		area = Math.PI * Math.pow(radio, 2);
		longitud = 2 * Math.PI * radio;

		// Mandamos por consola los resultados
		System.out
				.print("Si el radio es " + radio + ", la longitud será " + longitud + " y el area será " + area + ".");

		// Cerramos el escáner
		sc.close();
	}

}
