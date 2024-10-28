package Ej11_21;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// 18.- Diseñar un programa que, a partir de los tres puntos extremos (P1, P2 y
		// P3)
		// de un triángulo, calcule el área del mismo, de acuerdo con la siguiente
		// fórmula:
		// area = T*(T-S1)*(T-S2)*(T-S3)
		// donde T = (S1+S2+S3)/2 y S1,S2,S3 son las longitudes de los lados del
		// triángulo.
		// La distancia entre dos puntos p(x1,y1) y q(x2,y2) es: √(x1− x2)^2 + ( y1−
		// y2)^2
		//Definimos
		double x1,
			   y1,
			   x2,
			   y2,
			   x3,
			   y3,
			   S1,
			   S2,
			   S3,
			   T,
			   area;
		// Crear un objeto Scanner para leer los datos del usuario
		Scanner sc = new Scanner(System.in);

		// Solicitar al usuario las coordenadas de los tres puntos P1, P2, P3
		System.out.print("Introduce la coordenada x1 de P1: ");
		x1 = sc.nextDouble();
		System.out.print("Introduce la coordenada y1 de P1: ");
		y1 = sc.nextDouble();

		System.out.print("Introduce la coordenada x2 de P2: ");
		x2 = sc.nextDouble();
		System.out.print("Introduce la coordenada y2 de P2: ");
		y2 = sc.nextDouble();

		System.out.print("Introduce la coordenada x3 de P3: ");
		x3 = sc.nextDouble();
		System.out.print("Introduce la coordenada y3 de P3: ");
		y3 = sc.nextDouble();

		// Calcular las longitudes de los lados S1, S2, S3
		S1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		S2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		S3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

		// Calcular el semiperímetro T
		T = (S1 + S2 + S3) / 2;

		// Calcular el área del triángulo utilizando la fórmula de Herón
		area = Math.sqrt(T * (T - S1) * (T - S2) * (T - S3));

		// Mostrar el resultado
		System.out.println("El área del triángulo es: " + area);

		// Cerrar el scanner
		sc.close();

	}

}
