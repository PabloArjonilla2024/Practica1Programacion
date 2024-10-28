package Ej1_10;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// 5.- Realizar un programa para calcular el valor de la hipotenusa de un
		// triángulo
		// rectángulo aplicando el teorema de Pitágoras. Se pedirán por teclado los dos
		// catetos,
		// y se mostrará por pantalla el resultado de calcular la hipotenusa.
		// Definimos los catetos
		int cat1, cat2;
		double hipotenusa;
		Scanner sc = new Scanner(System.in);

		// Solicitamos los dos catetos y los guardamos en sus variables
		System.out.print("Escribe el cateto A: ");
		cat1 = sc.nextInt();

		System.out.print("Escribe el cateto B: ");
		cat2 = sc.nextInt();

		// Calculamos la hipotenusa
		hipotenusa = Math.hypot(cat1, cat2);

		// Enviamos los datos
		System.out.print("La hipotenusa teniendo en cuenta que el cateto A es " + cat1 + " y cateto B es " + cat2
				+ ", la hipotenusa tendrá un valor de " + hipotenusa + ".");

		// Cerramos el escáner
		sc.close();
	}

}
