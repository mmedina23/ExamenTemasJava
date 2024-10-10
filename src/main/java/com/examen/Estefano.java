package com.examen;

public class Estefano {
	/**
	 * 
	 * Llamar los metodos ejercicio1 y ejercicio2 desde el main
	 */
	public static void main(String[] args) {

		ejercicio1();
		ejercicio2("S", "R");

	}

	/**
	 *
	 * Escribe un programa que muestre por consola (con un print) los números de 1 a
	 * 100 (ambos incluidos y con un salto de línea entre cada impresión),
	 * sustituyendo los siguientes: - Múltiplos de 3 por la palabra "fizz". -
	 * Múltiplos de 5 por la palabra "buzz". - Múltiplos de 3 y de 5 a la vez por la
	 * palabra "fizzbuzz".
	 */
	static void ejercicio1() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("fizzbuzz");
			} else if (i % 3 == 0) {
				System.out.println("fizz");
			} else if (i % 5 == 0) {
				System.out.println("buzz");
			}
		}
	}

	/**
	 * Crea un programa que calcule quien gana más partidas al piedra, papel,
	 * tijera. - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate) - La
	 * función recibe un listado que contiene pares, representando cada jugada. - El
	 * par puede contener combinaciones de "R" (piedra), "P" (papel) o "S" (tijera).
	 * - Ejemplo. Entrada: [("R","S"), ("S","R"), ("P","S")]. Resultado: "Player 2".
	 * 
	 * el emtodo debe devolver un string indicando el ganador.
	 */
	static void ejercicio2(String player1, String player2) {

		int cont1 = 0;
		int cont2 = 0;
		for (int i = 0; i < 3; i++) {

			if (player1.equals("R") && player2.equals("S") || player1.equals("S") && player2.equals("P")
					|| player1.equals("P") && player2.equals("R")) {
				cont1++;
			} else if (player2.equals("R") && player1.equals("S") || player2.equals("S") && player1.equals("P")
					|| player2.equals("P") && player1.equals("R")) {
				cont2++;
			}

			if (cont1 > cont2) {
				System.out.println("Player1");
			} else if (cont2 > cont1) {
				System.out.println("Player2");
			} else {
				System.out.println("Tie");
			}
		}
	}
}