package Ej11_21;

public class Ejercicio11 {

	public static void main(String[] args) {
		// 11.- Al igual que ocurría con los long, puede ocurrir con los decimales
		// (float y double). En el siguiente ejemplo establecemos el precio de una pieza
		// de pan en 0.87 euros y el del Kilo de queso en 5.93 euros, la letra “f” con
		// la que terminamos las declaraciones le indica al compilador que los literales
		// numéricos (0.87 y 5.93) son de tipo float; si no pusiéramos esta indicación,
		// el compilador los tomaría (por defecto) como double, con lo que la asignación
		// float = double resultaría fallida. En el ejemplo estamos calculando
		// el precio de un bocadillo de 150 gramos de queso. Hacer la prueba.
		float piezaPan = 0.87f;
		float kiloQueso = 5.93f;
		float bocadillo = piezaPan + (kiloQueso * 0.15f);
		System.out.println("El bocadillo vale: " + bocadillo + " euros");

	}

}
