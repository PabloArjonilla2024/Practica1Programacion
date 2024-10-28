package Ej11_21;

import java.util.Scanner;

public class Ejercicio19 {
	public static void main(String[] args) {
		// 19.- Convertir un tiempo expresado en segundos a un formato que lo represente
		// a horas, minutos y segundos.
		//Definimos
		int segundosTotales,
			horas,
			minutos,
			segundos;
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario el tiempo en segundos
        System.out.print("Introduce el tiempo en segundos: ");
        segundosTotales = sc.nextInt();

        // Calcular horas, minutos y segundos
        horas = segundosTotales / 3600;               // 1 hora = 3600 segundos
        minutos = (segundosTotales % 3600) / 60;      // Restar las horas y calcular los minutos
        segundos = segundosTotales % 60;              // Restar las horas y minutos para obtener los segundos restantes

        // Mostrar el resultado
        System.out.println(segundosTotales + " segundos equivalen a:");
        System.out.println(horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");

        // Cerrar el scanner
        sc.close();
	}
}
