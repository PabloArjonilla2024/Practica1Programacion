package Ej11_21;

import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		// 15.- Diseñar un algoritmo que a partir de la base y la altura de un triángulo
        // muestre
        // como resultado su superficie. (superficie = b · h / 2)

        // Definimos
        double base,
        	   altura,
        	   superficie;
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario la base y la altura del triángulo
        System.out.print("Introduce la base del triángulo: ");
        base = sc.nextDouble();

        System.out.print("Introduce la altura del triángulo: ");
        altura = sc.nextDouble();

        // Calcular la superficie del triángulo
        superficie = (base * altura) / 2;

        // Mostrar el resultado
        System.out.println("La superficie del triángulo es: " + superficie);

        // Cerrar el scanner
        sc.close();
        }

}
