package com.examen;

import java.util.Random;

public class JuanShack {

    public static void main(String[] args) {
        JuanShack examen = new JuanShack();

        examen.Ejercicio1();
        examen.Ejercicio2();

    }

    public void Ejercicio1() {

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz Multiplos de 3 Y DE 5");
            } else if (i % 3 == 0) {
                System.out.println("Bizz Mulpitos de 3");
            } else if (i % 5 == 0) {
                System.out.println("Buzz  Multiplos de 5");
            } else {
                System.out.println(i);
            }
        }
    }

    public void Ejercicio2() {

        String[] opciones = {"Piedra", "Papel", "Tijeras"};

        Random random = new Random();
        int jugador1 = random.nextInt(3);
        int jugador2 = random.nextInt(3);

        System.out.println("Jugador 1 sacó: " + opciones[jugador1]);
        System.out.println("Jugador 2 sacó: " + opciones[jugador2]);
    }

}
