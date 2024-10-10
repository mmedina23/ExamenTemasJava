package com.examen;

import java.util.Scanner;

public class RubenGarcia {

    /**
     *
     * Llamar los metodos ejercicio1 y ejercicio2 desde el main
     */
    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime que ejercicio quieres ver");
        System.out.println("1");
        System.out.println("2");
        op = sc.nextInt();
        if (op == 1) {
            ejercicio1();
        } else if (op == 2) {
            System.out.println(ejercicio2());
        } else {
            System.out.println("opcion no valida");
        }

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
     * Crea un programa que calcule quien gana más partidas al piedra, papel,
     * tijera. - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
     * - La función recibe un listado que contiene pares, representando cada
     * jugada. - El par puede contener combinaciones de "R" (piedra), "P"
     * (papel) o "S" (tijera). - Ejemplo. Entrada: [("R","S"), ("S","R"),
     * ("P","S")]. Resultado: "Player 2".
     *
     * el emtodo debe devolver un string indicando el ganador.
     */
    public static String ejercicio2() {
        char opcionj1;
        char opcionj2;
        int jugador1gana = 0;
        int jugador2gana = 0;
        int empate = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Player 1: ");
        System.out.println("Dime que has sacado");
        opcionj1 = sc.next().charAt(0);
        System.out.println("Player 2: ");
        System.out.println("Dime que has sacado");
        opcionj2 = sc.next().charAt(0);
        if (opcionj1 == 'R' && opcionj2 == 'P') {
            jugador2gana++;
        } else if (opcionj1 == 'P' && opcionj2 == 'S') {
            jugador2gana++;
        } else if (opcionj1 == 'S' && opcionj2 == 'R') {
            jugador2gana++;
        } else if (opcionj1 == 'P' && opcionj2 == 'R') {
            jugador1gana++;
        } else if (opcionj1 == 'S' && opcionj2 == 'P') {
            jugador1gana++;
        } else if (opcionj1 == 'R' && opcionj2 == 'S') {
            jugador1gana++;
        } else if (opcionj1 == opcionj2) {
            empate++;
        }
        if (jugador1gana > jugador2gana) {
            return "Player 1 gano";
        } else if (jugador2gana > jugador1gana) {
            return "Player 2 gano";
        } else {
            return "empate";
        }

    }
}
