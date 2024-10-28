package Ej1_10;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// 6.- Diseña un programa que solicite al usuario su edad,
		// y a continuación indique si es mayor o menor de edad,
		// os podéis ayudar del operador condicional, no se puede utilizar
		// la sentencia condicional if.
		// Definimos la variable
		byte edad;

		// Comenzamos con el escáner
		Scanner sc = new Scanner(System.in);

		// Solicitamos la edad
		System.out.print("Esribe tu edad actual: ");

		// Recogemos la edad y la guardamos en una variable
		edad = sc.nextByte();

		// Enviamos si es menor o mayor dependiendo de la edad que ponga
		System.out.print("Eres " + (edad < 18 ? "menor" : "mayor") + ".");

		// Cerramos el escáner
		sc.close();
	}

}
