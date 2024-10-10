/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.examen;

import java.util.Scanner;

/**
 *
 * @author @mmedina
 */
public class JesusCobo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ejercicio1();
        jugar();
    }
    
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
    
    public static void jugar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¡Bienvenido a Piedra, Papel o Tijera!");
        
        int player1Wins = 0;
        int player2Wins = 0;
        int rounds = 3; 

        for (int i = 0; i < rounds; i++) {
            System.out.println("Ronda " + (i + 1));

        
            System.out.print("Jugador 1, elige R (Piedra), P (Papel) o T (Tijera): ");
            String player1 = scanner.nextLine().toUpperCase();

       
            System.out.print("Jugador 2, elige R (Piedra), P (Papel) o T (Tijera): ");
            String player2 = scanner.nextLine().toUpperCase();

           
            String resultado = verificarGanador(player1, player2);
            
            System.out.println("Ganador de la ronda: " + resultado);

            if (resultado.equals("Player 1")) {
                player1Wins++;
            } else if (resultado.equals("Player 2")) {
                player2Wins++;
            }
        }

    
        if (player1Wins > player2Wins) {
            System.out.println("Gana el jugador 1");
        } else if (player2Wins > player1Wins) {
            System.out.println("Gana el jugador 2");
        } else {
            System.out.println("Empate");
        }

        scanner.close();
    }

    public static String verificarGanador(String player1, String player2) {
        if (player1.equals(player2)) {
            return "Empate";
        }

        if ((player1.equals("R") && player2.equals("S")) || 
            (player1.equals("S") && player2.equals("P")) || 
            (player1.equals("P") && player2.equals("R"))) {
            return "Player 1";
        } else {
            return "Player 2";
        }
    }

}
