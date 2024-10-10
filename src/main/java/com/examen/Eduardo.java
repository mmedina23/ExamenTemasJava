package com.examen;

public class Eduardo {

    /**
     * ESTUDIANTE: EDUARDO PEÑALOZA Llamar los metodos ejercicio1 y ejercicio2
     * desde el main
     */
    public static void main(String[] args) {

        char ej2[][] = {{'P', 'P'}, {'R', 'R'}, {'P', 'P'}, {'P', 'P'}};
        System.out.println("Ejercicio 1:");
        ejercicio1();
        System.out.println("\n\nEjercicio 2:");
        System.out.println(ejercicio2(ej2));
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
            if (i % 5 == 0 && i % 3 == 0) {
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
    public static String ejercicio2(char[][] pares) {
        int victorias1 = 0;
        int victorias2 = 0;

        for (int i = 0; i < pares.length; i++) {
            if (pares[i].length != 2) {
                return "Error: Se debe trabajar con pares";
            }
            if ((pares[i][0] != 'R' && pares[i][0] != 'P' && pares[i][0] != 'S')
                    || (pares[i][1] != 'R' && pares[i][1] != 'P' && pares[i][1] != 'S')) {
                return "Error: caracter inválido. Caracteres permitidos: 'R', 'P', 'S'";
            }
            if (pares[i][0] == 'R') {
                if (pares[i][1] == 'S') {
                    victorias1++;
                } else if (pares[i][1] == 'P') {
                    victorias2++;
                }
            } else if (pares[i][0] == 'S') {
                if (pares[i][1] == 'P') {
                    victorias1++;
                } else if (pares[i][1] == 'R') {
                    victorias2++;
                }
            } else if (pares[i][0] == 'P') {
                if (pares[i][1] == 'R') {
                    victorias1++;
                } else if (pares[i][1] == 'S') {
                    victorias2++;
                }
            }
        }
        if (victorias1 > victorias2) {
            return "Player 1";
        } else if (victorias1 < victorias2) {
            return "Player 2";
        } else {
            return "Tie";
        }

    }
}
