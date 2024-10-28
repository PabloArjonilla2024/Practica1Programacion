package Ej1_10;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// 3.- Realizar un programa que calcule la media aritmética de
		// tres valores que se han leído de teclado, y muestre el resultado por pantalla
		// Definimos las variables
		int num1, num2, num3, suma, division;

		// Creamos el escaner
		Scanner sc = new Scanner(System.in);

		// Escribimos por consola el primer valor
		System.out.print("Escribe el primer valor: ");

		// Hacemos que el primer valor sea el número que se ha escrito
		num1 = sc.nextInt();

		// Escribimos por consola el segundo valor
		System.out.print("Escribe el segundo valor: ");

		// Hacemos que el segundo valor sea el número que se ha escrito
		num2 = sc.nextInt();

		// Escribimos por consola el tercer valor
		System.out.print("Escribe el tercer valor: ");

		// Hacemos que el tercer valor sea el número que se ha escrito
		num3 = sc.nextInt();

		// Hacemos la media aritmética
		suma = num1 + num2 + num3;
		division = suma / 3;

		// Enviamos el resultado por consola
		System.out.println("La media aritmética es: " + division);

		// Cerramos el escáner
		sc.close();

	}

}
