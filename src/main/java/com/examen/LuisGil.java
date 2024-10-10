package com.examen;

import java.util.Scanner;

public class LuisGil {

    /**
     *
     * Llamar los metodos ejercicio1 y ejercicio2 desde el main
     */

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //ejercicio1();
        ejercicio2();
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
        menu1();
        String opcion = sc.next();
        if (opcion.equalsIgnoreCase("fizz")) {
            for (int i = 0; i <= 100; i++) {
                if (i % 3 == 0) {
                    System.out.println(i);
                    System.out.println("");
                }

            }
        } else if (opcion.equalsIgnoreCase("buzz")) {
            for (int i = 0; i <= 100; i++) {
                if (i % 5 == 0) {
                    System.out.println(i);
                    System.out.println("");
                }
            }
        } else if (opcion.equalsIgnoreCase("fizzbuzz")) {
            for (int i = 0; i <= 100; i++) {
                if (i % 3 == 0) {
                    System.out.println(i);
                    System.out.println("");
                } else if (i % 5 == 0) {
                    System.out.println(i);
                    System.out.println("");
                }

            }
        } else {
            System.out.println("Opcion incorrecta");
        }
        System.out.println("Fin del Programa");

    }

    public static void menu1() {
        System.out.println("Introduzca una palalbra para ver las siguientes opciones");
        System.out.println("1. Multiplos de 3 - 'fizz'");
        System.out.println("2. Multiplos de 5 - 'buzz'");
        System.out.println("3. Multiplos de 3 y 5 - 'fizzbuzz'");
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
    public static void ejercicio2() {
        menu2();
        String opcionPlayer1;
        String opcionPlayer2;
        int vp1 = 0;
        int vp2 = 0;
        int bandera = 0;
        do {
            System.out.println("Jugador 1 : Introduzca su opción:");
            opcionPlayer1 = sc.next().substring(0);
            System.out.println("Jugador 2 : Introduzca su opción");
            opcionPlayer2 = sc.next().substring(0);
            if (opcionPlayer1.equalsIgnoreCase("S")) {
                if (opcionPlayer2.equalsIgnoreCase("S")) {
                    System.out.println("Empate");
                    bandera++;
                } else if (opcionPlayer2.equalsIgnoreCase("R")) {
                    System.out.println("Ronda ganada por Player 2!");
                    vp2++;
                    bandera++;
                } else if (opcionPlayer2.equalsIgnoreCase("P")) {
                    System.out.println("Ronda ganada por Player 1!");
                    vp1++;
                    bandera++;

                } else {
                    System.out.println("Opción incorrecta, combate nulo");
                }
            } else if (opcionPlayer1.equalsIgnoreCase("R")) {
                if (opcionPlayer2.equalsIgnoreCase("R")) {
                    System.out.println("Empate");
                    bandera++;
                } else if (opcionPlayer2.equalsIgnoreCase("P")) {
                    System.out.println("Ronda ganada por Player 2!");
                    vp2++;
                    bandera++;
                } else if (opcionPlayer2.equalsIgnoreCase("S")) {
                    System.out.println("Ronda ganada por Player 1!");
                    vp1++;
                    bandera++;
                } else {
                    System.out.println("Opción incorrecta, combate nulo");
                }
            } else if (opcionPlayer1.equalsIgnoreCase("P")) {
                if (opcionPlayer2.equalsIgnoreCase("P")) {
                    System.out.println("Empate");
                    bandera++;
                } else if (opcionPlayer2.equalsIgnoreCase("S")) {
                    System.out.println("Ronda ganada por Player 2!");
                    vp2++;
                    bandera++;
                } else if (opcionPlayer2.equalsIgnoreCase("R")) {
                    System.out.println("Ronda ganada por Player 1!");
                    {
                        vp1++;
                        bandera++;
                    }
                } else {
                    System.out.println("Opción incorrecta, combate nulo");
                }
            }

        } while (bandera < 3);

        if (vp1 > vp2) {
            System.out.println("Gana Player 1");
        } else if (vp1 < vp2) {
            System.out.println("Gana Player 2");
        } else {
            System.out.println("Empate");
        }

    }

    public static void menu2() {
        System.out.println("Juego de piedra papel y tijera");
        System.out.println("Introduzca la opcion que quiere hacer: ");
        System.out.println("R - Piedra");
        System.out.println("P - Papel");
        System.out.println("S - Tijeras");
    }
}
