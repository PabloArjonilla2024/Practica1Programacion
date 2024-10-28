package Ej1_10;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// 1.- Hacer un programa que pida al usuario su edad,
		// y muestre la edad que tendrá el próximo año.
		// Definimos edad
		byte edad;

		// Creamos el escaner
		Scanner sc = new Scanner(System.in);

		// Escribimos por consola la edad
		System.out.print("Escribe tu edad: ");

		// Hacemos que edad sea el número que se ha escrito
		edad = sc.nextByte();

		// Decimos la edad que tendrá el año que vine
		byte suma = (byte) (edad + 1);

		// Enviamos los datos
		System.out.println("Tu edad el año que viene será: " + suma);

		// Cerramos el escáner
		sc.close();

	}

}
