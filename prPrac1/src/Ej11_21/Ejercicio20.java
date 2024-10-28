package Ej11_21;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		// 20.- Un biólogo está realizando un estudio de distintas especies de
		// invertebrados y necesita
		// una aplicación que le ayude a contabilizar el número de patas que tienen en
		// total todos
		// los animales capturados durante una jornada de trabajo. Para ello, nos ha
		// solicitado una
		// aplicación a la que hay que proporcionar:
		// • El número de hormigas capturadas (6 patas).
		// • El número de arañas capturadas (8 patas).
		// • El número de cochinillas capturadas (14 patas).
		// La aplicación debe mostrar el número total de patas.
		
		//Definimos
		int hormigas,
			aranas,
			cochinillas,
			totalPatas;
		// Crear un objeto Scanner para leer los datos del usuario
		Scanner sc = new Scanner(System.in);

		// Solicitar al usuario el número de hormigas, arañas y cochinillas
		System.out.print("Introduce el número de hormigas capturadas: ");
		hormigas = sc.nextInt();
		        
		System.out.print("Introduce el número de arañas capturadas: ");
		aranas = sc.nextInt();
		        
		System.out.print("Introduce el número de cochinillas capturadas: ");
		cochinillas = sc.nextInt();

		// Calcular el total de patas
		totalPatas = (hormigas * 6) + (aranas * 8) + (cochinillas * 14);

		// Mostrar el resultado
		System.out.println("El número total de patas es: " + totalPatas);

		// Cerrar el scanner
		sc.close();

	}

}
