package Ej1_10;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// 2.- Escribir un programa que pida el año actual
		// y el de nacimiento del usuario. Debe calcular su edad,
		// suponiendo que en el año en curso el usuario ya ha cumplido años.
		// Definimos las variables
		int ano_nacimiento;
		int ano_actual;
		int resta;

		// Creamos el escaner
		Scanner sc = new Scanner(System.in);

		// Escribimos por consola la edad
		System.out.print("Escribe tu año de nacimiento: ");

		// Hacemos que edad sea el número que se ha escrito
		ano_nacimiento = sc.nextInt();

		// Solicitamos el año actual
		System.out.print("Escribe el año actual: ");

		// Hacemos que edad sea el número que se ha escrito
		ano_actual = sc.nextInt();
		resta = ano_actual - ano_nacimiento;

		// Decimos la edad que tendrá el año que vine
		System.out.println("Tu edad es: " + resta);

		// Cerramos el escáner
		sc.close();

	}

}
