package com.examen;

import java.util.Scanner;

public class LuisHuillca {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejercicio1(); //Llamo al ejercicio uno (Fizz, Buzz, FizzBuzz)

        String[][] jugadas = {{"s", "s"}, {"p", "p"}, {"p", "p"}, {"r", "r"}};
        ejercicio2(jugadas);

    }

    /*
    - Escribe un programa que muestre por consola (con un print) los
        números de 1 a 100 (ambos incluidos y con un salto de línea entre
        cada impresión), sustituyendo los siguientes:
    - Múltiplos de 3 por la palabra "fizz".
    - Múltiplos de 5 por la palabra "buzz".
    - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz". [15, 30, 45, 60, 75, 90]
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

    /*
    - Crea un programa que calcule quien gana más partidas al piedra, papel, tijera.
    - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
    - La función recibe un listado que contiene pares, representando cada jugada.
    - El par puede contener combinaciones de "R" (piedra), "P" (papel) o "S" (tijera).
    - Ejemplo. Entrada: [("R","S"), ("S","R"), ("P","S")]. Resultado: "Player 2". 
        el emtodo debe devolver un string indicando el ganador.
     */
    public static void ejercicio2(String[][] pares) {
        int contadorPlayer1 = 0;
        int contadorPlayer2 = 0;
        int gameover = 3;

        /*
            Piedra gana Tijeras
            Papel gana Piedra
            Tijeras gana Papel
         */
        int i = 0; // índice para recorrer las jugadas

        while (gameover > 0 && i < pares.length) {
            String player1 = pares[i][0]; // Jugada del jugador 1
            String player2 = pares[i][1]; // Jugada del jugador 2

            if (player1.equalsIgnoreCase("r") && player2.equalsIgnoreCase("s")) {
                System.out.println("PIEDRA chanca TIJERAS. Gana PLAYER 1");
                contadorPlayer1++;
            } else if (player1.equalsIgnoreCase("s") && player2.equalsIgnoreCase("r")) {
                System.out.println("PIEDRA chanca TIJERAS. Gana PLAYER 2");
                contadorPlayer2++;
            } else if (player1.equalsIgnoreCase("p") && player2.equalsIgnoreCase("r")) {
                System.out.println("PAPEL cubre a PIEDRA. Gana PLAYER 1");
                contadorPlayer1++;
            } else if (player1.equalsIgnoreCase("r") && player2.equalsIgnoreCase("p")) {
                System.out.println("PAPEL cubre a PIEDRA. Gana PLAYER 2");
                contadorPlayer2++;
            } else if (player1.equalsIgnoreCase("s") && player2.equalsIgnoreCase("p")) {
                System.out.println("TIJERAS corta a PAPEL. Gana PLAYER 1");
                contadorPlayer1++;
            } else if (player1.equalsIgnoreCase("p") && player2.equalsIgnoreCase("s")) {
                System.out.println("TIJERAS corta a PAPEL. Gana PLAYER 2");
                contadorPlayer2++;
            } else {
                System.out.println("Empate");
            }

            gameover--;
            i++;
            System.out.println("Quedan " + gameover + " juegos.");
        }

        // para ver ganador final
        if (contadorPlayer1 > contadorPlayer2) {
            System.out.println("Gana PLAYER 1 con " + contadorPlayer1 + " puntos.");
        } else if (contadorPlayer2 > contadorPlayer1) {
            System.out.println("Gana PLAYER 2 con " + contadorPlayer2 + " puntos.");
        } else {
            System.out.println("Empate final");
        }
    }
}
