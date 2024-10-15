package com.examen;

import java.util.Scanner;

public class Yinari2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Yinari2 e = new Yinari2();
        System.out.println("Bucle");
        e.ejercicio1();

        String[][] resultados = e.obtenerResultados(sc);
        String ganador = e.ejercicio2(resultados);
        System.out.println("El ganador es: " + ganador);
    }

    /**
     *
     * Escribe un programa que muestre por consola (con un print) los números de
     * 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión),
     * sustituyendo los siguientes: - Múltiplos de 3 por la palabra "fizz". -
     * Múltiplos de 5 por la palabra "buzz". - Múltiplos de 3 y de 5 a la vez
     * por la palabra "fizzbuzz".
     */
    public void ejercicio1() {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }
        }

    }

    /** 4.0 Error de un print cuando no se ha introducido datos
     * 
     * Crea un programa que calcule quien gana más partidas al piedra, papel,
     * tijera. - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
     * - La función recibe un listado que contiene pares, representando cada
     * jugada. - El par puede contener combinaciones de "R" (piedra), "P"
     * (papel) o "S" (tijera). - Ejemplo. Entrada: [("R","S"), ("S","R"),
     * ("P","S")]. Resultado: "Player 2".
     *
     * el emtodo debe devolver un string indicando el ganador.
     */
    public String ejercicio2(String[][] resultado) {
        int player1Gana = 0;
        int player2Gana = 0;
        for (int i = 0; i < resultado.length; i++) {
            String player1 = resultado[i][0];
            String player2 = resultado[i][1];

            if (player1.equals(player2)) {
                continue;
            }
            if ((player1.equals("R") && player2.equals("S")) || (player1.equals("S") && player2.equals("P"))
                    || (player1.equals("P") && player2.equals("R"))) {
                player1Gana++;
            } else {
                player2Gana++;
            }
        }

        if (player1Gana > player2Gana) {
            return "Player 1";
        } else if (player2Gana > player1Gana) {
            return "Player 2";
        } else {
            return "Tie";

        }

    }

    /**
     * Método para obtener las jugadas de los jugadores por consola. - Se valida
     * que solo puedan ingresar "R", "P" o "S".
     */
    public String[][] obtenerResultados(Scanner sc) {
        int numeroRondas = 0;
        System.out.println("Ingrese el numero de rondas que desee");
        numeroRondas = sc.nextInt();
        String[][] resultados = new String[numeroRondas][2];
        for (int i = 0; i < numeroRondas; i++) {
            // Jugada del primer jugador
            System.out.println("Ronda " + (i + 1) + ":");
            resultados[i][0] = obtenerJugada(sc, 1);
            // Jugada del segundo
            resultados[i][1] = obtenerJugada(sc, 2);
        }
        return resultados;

    }

    /**
     * Método para obtener y validar una jugada de un jugador. Solo permite
     * ingresar "R", "P" o "S".
     */
    public String obtenerJugada(Scanner sc, int jugador) {
        String jugada;
        boolean jugadaValida = false;
        do {
            System.out.print("Player " + jugador + " (R = Piedra, P = Papel, S = Tijera): ");
            jugada = sc.nextLine().toUpperCase();
            if (jugada.equals("R") || jugada.equals("P") || jugada.equals("S")) {
                jugadaValida = true;
            } else {
                System.out.println("Entrada inválida. Solo se permite 'R', 'P', o 'S'. Intente de nuevo.");
            }
        } while (!jugadaValida);

        return jugada;
    }

}
