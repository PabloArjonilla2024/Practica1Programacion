package Ej11_21;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		// 21.- Una empresa que gestiona un parque acuático nos solicita una aplicación
		// que les ayude
		// a calcular el importe que hay que cobrar en la taquilla por la compra de una
		// serie de entradas
		// (cuyo número será introducido por el usuario). Existen dos tipos de entradas:
		// infantiles,
		// que cuestan 15.50€, y de adultos que cuestan 20€. En el caso de que el
		// importe total sea igual
		// o superior a 100€, se aplicará automáticamente un bono descuento del 5%
		 // Crear un objeto Scanner para leer los datos del usuario
		//Definimos
        double precioEntradaInfantil = 15.50,
        	   precioEntradaAdulto = 20.00,
        	   total;

        // Definición de variables
        int entradasInfantiles,
        	entradasAdultos;
        // Crear un objeto Scanner para leer los datos del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario el número de entradas
        System.out.print("Introduce el número de entradas infantiles: ");
        entradasInfantiles = sc.nextInt();

        System.out.print("Introduce el número de entradas de adultos: ");
        entradasAdultos = sc.nextInt();

        // Calcular el importe total
        total = (entradasInfantiles * precioEntradaInfantil) + (entradasAdultos * precioEntradaAdulto);

        // Aplicar el descuento si el total es igual o mayor a 100€
        total = total * (1 - (total >= 100 ? 0.05 : 0.0));

        // Mostrar el resultado
        System.out.printf("El importe total a cobrar es: %.2f€%n", total);

        // Cerrar el scanner
        sc.close();
	}

}
