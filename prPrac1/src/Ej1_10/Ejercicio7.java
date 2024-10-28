package Ej1_10;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// 7.- Un agricultor que se dedica al cultivo ecológico de naranjas
		// y limones, quiere calcular los beneficios que obtiene anualmente por
		// la venta de los mismos. Por este motivo vamos a diseñar una aplicación
		// que solicite las ventas (en kilos) de cada semestre para cada fruta.
		// La aplicación mostrará el importe total sabiendo que el precio del kilo
		// de naranjas está fijado en 1.25€ y el kilo de limones en 1.90€
		// Definimos las variables y le damos su dato de € por kilo
		float nar = 1.25f,
				lim = 1.90f,
				knar,
				klim;

		// Abrimos el escáner
		Scanner sc = new Scanner(System.in);

		// Recogemos el dato de las naranjas vendidas
		System.out.print("Escribe cuántos kilos has vendido de naranjas: ");
		knar = sc.nextFloat();

		// Hacemos lo mismo pero con los limones
		System.out.print("Escribe cuántos kilos has vendido de limones: ");
		klim = sc.nextFloat();

		// Enviamos el resultado por consola
		System.out.print("Has tenido de ganancia en total: " + (klim * lim + knar * nar) + "€.");

		// Cerramos el escáner
		sc.close();

	}

}
