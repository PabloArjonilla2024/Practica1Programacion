package Ej1_10;

public class Ejercicio8_3 {

	public static void main(String[] args) {
		// c) El siguiente programa convierte los días terrestres en años del planeta
		// Júpiter.
		// Puede que tenga algún error, si ese es el caso, corrígelo y haz que funcione.
		int diasTerrestres = Integer.parseInt(args[0]);

		System.out.print("El número de años de Jupiter sería "
				+ (float) diasTerrestres / (365 * 12));

	}

}
