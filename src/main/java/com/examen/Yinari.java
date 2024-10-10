package com.examen;

public class Yinari {

    public static void main(String[] args) {

        ejercicio1();
        String[][] resultados = {
            {"R", "R"},
            {"R", "R"},
            {"R", "R"}
        };
        String ganador = ejercicio2(resultados);
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
    public static void ejercicio1() {
        for (int i = 0; i > 0; i++) {
            if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else {
                System.out.println(i);
            }
        }
    }

    /**
     * Crea un programa que calcule quien gana más partidas al piedra, papel,
     * tijera. - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
     * - La función recibe un listado que contiene pares, representando cada
     * jugada. - El par puede contener combinaciones de "R" (piedra), "P"
     * (papel) o "S" (tijera). - Ejemplo. Entrada: [("R","S"), ("S","R"),
     * ("P","S")]. Resultado: "Player 2".
     *
     * el emtodo debe devolver un string indicando el ganador.
     */
    public static String ejercicio2(String[][] resultado) {
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

}
