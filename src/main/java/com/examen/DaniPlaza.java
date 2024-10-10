package com.examen;

import java.util.Random;
import java.util.Scanner;

public class DaniPlaza {
    /**
     * Llamar los metodos ejercicio1 y ejercicio2 desde el main
     */
    public static void main(String[] args) {
        DaniPlaza ex = new DaniPlaza();
        ejercicio1();
        ex.ejercicio2();
    }

    /**
     * Escribe un programa que muestre por consola (con un print) los
     * números de 1 a 100 (ambos incluidos y con un salto de línea entre
     * cada impresión), sustituyendo los siguientes:
     * - Múltiplos de 3 por la palabra "fizz".
     * - Múltiplos de 5 por la palabra "buzz".
     * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
     */
    public static void ejercicio1() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    /**
     * Crea un programa que calcule quien gana más partidas al piedra,
     * papel, tijera.
     * - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
     * - La función recibe un listado que contiene pares, representando cada jugada.
     * - El par puede contener combinaciones de "R" (piedra), "P" (papel)
     * o "S" (tijera).
     * - Ejemplo. Entrada: [("R","S"), ("S","R"), ("P","S")]. Resultado: "Player 2".
     * <p>
     * el emtodo debe devolver un string indicando el ganador.
     *
     * @return
     */
    public String ejercicio2() {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String[] opciones = {"piedra", "papel", "tijera"};
        int scorePlayer1 = 0;
        int scorePlayer2 = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Elige Piedra, Papel o Tijera:");
            String resultadoPlayer1 = sc.nextLine();


            while (!resultadoPlayer1.equals("piedra") && !resultadoPlayer1.equals("papel") && !resultadoPlayer1.equals("tijera")) {
                System.out.println("Entrada inválida. Elige Piedra, Papel o Tijera:");
                resultadoPlayer1 = sc.nextLine();
            }


            String resultadoPlayer2 = opciones[r.nextInt(opciones.length)];
            System.out.println("El jugador 2 ha sacado: " + resultadoPlayer2);


            if (resultadoPlayer1.equals(resultadoPlayer2)) {
                System.out.println("Empate");
            } else if ((resultadoPlayer1.equals("piedra") && resultadoPlayer2.equals("tijera")) ||
                    (resultadoPlayer1.equals("tijera") && resultadoPlayer2.equals("papel")) ||
                    (resultadoPlayer1.equals("papel") && resultadoPlayer2.equals("piedra"))) {
                System.out.println("¡Has ganado esta ronda!");
                scorePlayer1++;
            } else {
                System.out.println("El jugador 2 ha ganado esta ronda!");
                scorePlayer2++;
            }
        }


        System.out.println("Resultados finales:");
        System.out.println("Jugador 1 (tú): " + scorePlayer1);
        System.out.println("Jugador 2 (NPC): " + scorePlayer2);

        if (scorePlayer1 > scorePlayer2) {
            return "Has ganado el juego.";
        } else if (scorePlayer1 < scorePlayer2) {
            return "El jugador 2 ha ganado el juego.";
        } else {
            return "El juego ha terminado en empate.";
        }


    }
}


