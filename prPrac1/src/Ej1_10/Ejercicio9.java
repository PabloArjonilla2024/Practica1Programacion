package Ej1_10;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// 9.- a) Observar el siguiente programa, que guarda en dos variables de tipo
		// byte,
		// las edades de dos personas, y en otras dos de tipo short su sueldo base.
		byte edadJuan = 20;
		byte edadPedro = 42;
		int sueldoBase = 1980;
		short complementos = 400;

		// Aparecen warnings porque esas variables no se están usando en el código

		// En el caso de que la variable esté por encima de su capacidad, pongdrá un
		// error indicando que no se ha podido convertir

		// c) Modificar el programa para que muestre por pantalla un mensaje similar al
		// siguiente:
		// El sueldo real del empleado de XX años es: XXXX euros.
		// El sueldo real del empleado de XX años es: XXXX euros.
		// Sabiendo que el sueldo real se obtiene de sumar al sueldo base los
		// complementos,
		// y 30 euros si su edad es inferior a 25, 60 euros si su edad es inferior a 35,
		// y 100 euros si su edad es inferior o igual a 65, y después deducirle un 15%
		// de IRPF
		// y un 9% de Seguridad Social.

		// Definimos el escaner para iniciarlo
		Scanner sc = new Scanner(System.in);
		int sueldoJuan = 0, sueldoPedro = 0;
		sueldoBase = sueldoBase + complementos;

		if (edadJuan < 25) {
			sueldoJuan = sueldoBase + 30;

		} else if (edadJuan < 35) {
			sueldoJuan = sueldoBase + 60;
		} else if (edadJuan <= 65) {
			sueldoJuan = sueldoBase + 100;

		}

		sueldoJuan = (int) (sueldoJuan * 0.15 * 0.9);

		if (edadPedro < 25) {
			sueldoPedro = sueldoBase + 30;

		} else if (edadPedro < 35) {
			sueldoPedro = sueldoBase + 60;
		} else if (edadPedro <= 65) {
			sueldoPedro = sueldoBase + 100;
		}

		sueldoPedro = (int) (sueldoPedro * 0.15 * 0.9);

		System.out.println("El sueldo real del empleado de " + edadJuan + " años es: " + sueldoJuan + " euros.");
		System.out.println("El sueldo real del empleado de " + edadPedro + " años es: " + sueldoPedro + " euros.");
		// Cerramos el escáner
		sc.close();

	}

}
