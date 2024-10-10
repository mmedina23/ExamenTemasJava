package com.examen;

import java.util.List;

public class JoseAbreu {
    /**
     * Llamar los metodos ejercicio1 y ejercicio2 desde el main
     */
    public static void main(String[] args) {
        JoseAbreu examen = new JoseAbreu();
        examen.ejercicio1();
        List<String[]> jugadas = List.of(
                new String[]{"S", "S"},
                new String[]{"S", "S"},
                new String[]{"P", "P"}
        );
        examen.ejercicio2(jugadas);


    }

    /**
     * Escribe un programa que muestre por consola (con un print) los
     * números de 1 a 100 (ambos incluidos y con un salto de línea entre
     * cada impresión), sustituyendo los siguientes:
     * - Múltiplos de 3 por la palabra "fizz".
     * - Múltiplos de 5 por la palabra "buzz".
     * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
     */
    public void ejercicio1() {
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
    public String ejercicio2(List<String[]> jugadas) {
        int p1wins = 0;
        int p2wins = 0;

        for (String[] jugada : jugadas) {
            String p1moves = jugada[0];
            String p2moves = jugada[1];
            if (p1moves.equals(p2moves)) {

            } else if (p1moves.equals("R") && p2moves.equals("S") || p1moves.equals("S") && p2moves.equals("P") || p1moves.equals("P") && p2moves.equals("R")) {
                p1wins++;
            } else {
                p2wins++;
            }
        }
        /*
        * No sé por qué tamaño de la lista se pone por defecto en 3, entonces
        * el bucle for siempre termina con que el player 1 tiene 1 victoria y el player 2
        * siempre gana con 2 victorias, y no sé como
        *
        * */
        if (p1wins > p2wins) {
            System.out.println("Player 1");
        } else if (p2wins > p1wins) {
            System.out.println("Player 2");
        } else {
            System.out.println("Tie");
        }

        return null;
    }
}
