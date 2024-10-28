package Ej11_21;

import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		// 14.- Realizar un programa que realiza y muestra las operaciones aritméticas
		// básicas de dos números
		// pasados a nuestro programa. Las operaciones aritméticas básicas son, suma,
		// resta, multiplicación y
		// división.
		// Definimos
		double numero1,
				numero2,
				suma,
				resta,
				multiplicacion,
				division;
		// Crear un objeto Scanner para leer los datos del usuario
		Scanner sc = new Scanner(System.in);

		// Solicitar al usuario los dos números
		System.out.print("Introduce el primer número: ");
		numero1 = sc.nextDouble();

		System.out.print("Introduce el segundo número: ");
		numero2 = sc.nextDouble();

		// Realizar las operaciones aritméticas básicas
		suma = numero1 + numero2;
		resta = numero1 - numero2;
		multiplicacion = numero1 * numero2;
		division = numero1 / numero2; // En caso de número2 = 0, generará una excepción

		// Mostrar los resultados de las operaciones
		System.out.println("Suma: " + numero1 + " + " + numero2 + " = " + suma);
		System.out.println("Resta: " + numero1 + " - " + numero2 + " = " + resta);
		System.out.println("Multiplicación: " + numero1 + " * " + numero2 + " = " + multiplicacion);
		System.out.println("División: " + numero1 + " / " + numero2 + " = " + division);

		// Cerrar el scanner
		sc.close();

	}
}
