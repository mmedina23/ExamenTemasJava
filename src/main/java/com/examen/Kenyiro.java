package com.examen;

public class Kenyiro {

    /**
     * Llamar los metodos ejercicio1 y ejercicio2 desde el main
     */
    public static void main(String[] args) {

        ejercicio1();

        System.out.println("-------------------------");
        System.out.println("--------------------------");

        char[][] jugadas = {
            {'R', 'S'},
            {'S', 'P'},
            {'P', 'R'},
            {'R', 'R'},};

        ejercicio2(jugadas);

    }

    public static String ejercicio1() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        return "";
    }

    public static String ejercicio2(char jugadas[][]) {
        int jugador1 = 0;
        int jugador2 = 0;
        int empate = 0;

        for (int i = 0; i < jugadas.length; i++) {

            if (jugadas[i][0] == 'R' && jugadas[i][1] == 'S') {
                jugador1++;

            } else if (jugadas[i][0] == 'S' && jugadas[i][1] == 'R') {
                jugador2++;
            } else if (jugadas[i][0] == 'P' && jugadas[i][1] == 'S') {
                jugador2++;
            } else if (jugadas[i][0] == 'R' && jugadas[i][1] == 'P') {
                jugador2++;

            } else if (jugadas[i][0] == 'S' && jugadas[i][1] == 'P') {
                jugador1++;
            } else if (jugadas[i][0] == 'P' && jugadas[i][1] == 'R') {
                jugador1++;
            } else {
                empate++;//para que esta variable empate
            }

        }

        if (jugador1 > jugador2) {
            System.out.println("El ganador es el jugador 1");
            return "El ganador es el " + jugador1;
        } else if (jugador2 > jugador1) {
            System.out.println("El ganador es el jugador 2");
            return "El ganador es el " + jugador2;
        } else {
            System.out.println("Hay un empate entre los dos jugadores");

        }

        return "";
    }

}
