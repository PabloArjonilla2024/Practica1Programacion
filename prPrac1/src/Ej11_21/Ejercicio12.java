package Ej11_21;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        // 12.- Escribir un programa que calcule el salario semanal de un trabajador,
        // dada la tarifa horaria por horas y el número de horas trabajadas.
        // Además, hay que tener en cuenta que se le practica una retención del
        // 4% para la S.S. y del 7% para el IRPF. Es decir, solicitaremos por teclado,
        // cuánto cobra por hora (tarifa horaria), así como las horas trabajadas,
        // y mostraremos por pantalla el sueldo semanal del trabajador según los datos
        // proporcionados

        // Definimos
        double tarifaHoraria,
                horasTrabajadas,
                salarioBruto,
                deduccionSS,
                deduccionIRPF,
                salarioNeto;
        // Crear un objeto Scanner para leer los datos del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario la tarifa horaria y el número de horas trabajadas
        System.out.print("Introduce la tarifa horaria (en euros): ");
        tarifaHoraria = sc.nextDouble();

        System.out.print("Introduce el número de horas trabajadas: ");
        horasTrabajadas = sc.nextDouble();

        // Calcular el salario bruto
        salarioBruto = tarifaHoraria * horasTrabajadas;

        // Calcular las deducciones
        deduccionSS = salarioBruto * 0.04; // 4% para la S.S.
        deduccionIRPF = salarioBruto * 0.07; // 7% para el IRPF

        // Calcular el salario neto
        salarioNeto = salarioBruto - deduccionSS - deduccionIRPF;

        // Mostrar los resultados
        System.out.println("Salario bruto: " + salarioBruto + " euros");
        System.out.println("Deducción para S.S. (4%): " + deduccionSS + " euros");
        System.out.println("Deducción para IRPF (7%): " + deduccionIRPF + " euros");
        System.out.println("Salario neto: " + salarioNeto + " euros");

        // Cerrar el scanner
        sc.close();
    }

}
