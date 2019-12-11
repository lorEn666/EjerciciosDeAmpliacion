package ejerciciosAmpliacion;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 * @author borjaLoren
 * @version 0.0
 * @date 11-12-2019
 *
 */
public class Ejercicios {

	/**
	 * M�todo que dir� si un a�o es bisiesto o no.
	 * 
	 * @return
	 * @param
	 */
	public static void ejercicio2() {
		Scanner leer = new Scanner(System.in);
		int a�o = 0;
		boolean datosCorrectos = true;

		System.out.println("Introduzca a�o:");

		do {
			try {
				leer = new Scanner(System.in);
				datosCorrectos = true;
				a�o = leer.nextInt();
			} catch (java.util.InputMismatchException e) {
				System.out.println("Introduzca datos v�lidos.");
				datosCorrectos = false;
			} catch (Exception e) {
				System.out.println("Introduzca datos v�lidos.");
				datosCorrectos = false;
			}

		} while (datosCorrectos);

		if ((a�o % 4 == 0) && (a�o % 100 != 0) && (a�o % 400 != 0)) {
			System.out.println("A�o bisiesto.");
		} else {
			System.out.println("A�o no bisiesto");
		}
	}

	/**
	 * M�todo que dado un n�mero entero formatea una fecha
	 * 
	 * @return
	 * @param
	 * 
	 */
	public static void ejercicio3() {
		Scanner leer = new Scanner(System.in);
		int fecha = 0;

		System.out.println("Escriba una fecha con un formato de 8 cifras (aaaammdd):");

	}

	/**
	 * M�todo que convierte un n�mero en base decimal a binario
	 * 
	 * @return
	 * @param
	 */
	public static void ejercicio5() {
		Scanner leer = new Scanner(System.in);
		int numeroDecimal = 0;
		String numeroBinario = "";
		boolean datosCorrectos = true;

		System.out.println("Inserte n�mero en base decimal:");

		do {
			try {
				leer = new Scanner(System.in);
				datosCorrectos = true;
				numeroDecimal = leer.nextInt();
			} catch (java.util.InputMismatchException e) {
				System.out.println("Inserte datos v�lidos.");
				datosCorrectos = false;
			} catch (Exception e) {
				System.out.println("Inserte datos v�lidos.");
				datosCorrectos = false;
			}
		} while (!datosCorrectos);

		while (numeroDecimal >= 1) {
			numeroBinario += numeroDecimal % 2;
			numeroDecimal = numeroDecimal / 2;
		}

		for (int i = numeroBinario.length() - 1; i >= 0; i--) {
			System.out.print(numeroBinario.charAt(i));
		}
	}

	/**
	 * 
	 * @return
	 * @param
	 */
	public static void ejercicio6() {
		Scanner leer = new Scanner(System.in);
		int numero = 0, mayor = -999999999;
		boolean datosCorrectos = true;

		System.out.println("Inserte n�mero:");

		do {
			try {
				leer = new Scanner(System.in);
				datosCorrectos = true;
				numero = leer.nextInt();
			} catch (java.util.InputMismatchException e) {
				System.out.println("Inserte datos v�lidos.");
				datosCorrectos = false;
			} catch (Exception e) {
				System.out.println("Inserte datos v�lidos.");
				datosCorrectos = false;
			}
		} while (!datosCorrectos);
	}
}
