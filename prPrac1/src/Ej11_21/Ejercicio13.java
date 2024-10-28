package Ej11_21;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        // Definimos
        int segundosTotales,
                minutos,
                segundos;
        // Crear un objeto Scanner para leer los datos del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario el número de segundos
        System.out.print("Introduce el número de segundos: ");
        segundosTotales = sc.nextInt();

        // Calcular los minutos y segundos
        minutos = segundosTotales / 60; // 1 minuto = 60 segundos
        segundos = segundosTotales % 60; // Los segundos restantes

        // Mostrar el resultado
        System.out.println(
                segundosTotales + " segundos son equivalentes a " + minutos + " minutos y " + segundos + " segundos.");

        // Cerrar el scanner
        sc.close();
    }
}
