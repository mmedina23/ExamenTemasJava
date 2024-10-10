package com.examen;

import java.util.Scanner;

public class AlejandroGarcia {

    public static void main(String[] args) {
        ejercicio1();     
        System.out.println("\nEjercicio 2\n===========");
        ejercicio2();
    }
    

    public static void ejercicio1(){
       for (int i = 1 ;i <= 100;i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("fizzbuzz");
            } else if(i % 5== 0){
                System.out.println("buzz");

            } else if(i % 3 == 0 ){
                System.out.println("fizz");

            }else{
                System.out.println(i);
            }
        }
    }

    public static void ejercicio2() {
        System.out.println("\t-Juego de Piedra, Papel y Tijera.");
        Scanner sc = new Scanner(System.in);

        int player1Wins = 0;
        int player2wins = 0;
        int tie = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("\nRonda " + i);
            char player1 = ' ';
            char player2 = ' ';

            while ((player1 != 'R' && player1 != 'P' && player1 != 'S') || (player2 != 'R' && player2 != 'P' && player2 != 'S')) {
                System.out.println("Elige Rock, Paper, Scissor: [R], [P], [S]");
                
                System.out.print("Jugador 1, elige: ");
                player1 = sc.nextLine().toUpperCase().charAt(0);  
                System.out.print("Jugador 2, elige: ");
                player2 = sc.nextLine().toUpperCase().charAt(0);  

                if ((player1 != 'R' && player1 != 'P' && player1 != 'S') || (player2 != 'R' && player2 != 'P' && player2 != 'S')) {
                    System.out.println("Entrada errónea. Ambos jugadores deben elegir entre [R], [P], [S]. Repita la elección.");
                }
            }

            if (player1 == player2) {
                System.out.println("Empate en esta ronda.");
                tie++;
            } else if ((player1 == 'R' && player2 == 'S') || (player1 == 'P' && player2 == 'R') || (player1 == 'S' && player2 == 'P')) {
                System.out.println("El ganador de esta ronda es Player 1");
                player1Wins++;
            } else {
                System.out.println("El ganador de esta ronda es Player 2");
                player2wins++;
            }
        }




        if (player1Wins > player2wins) {
            System.out.println("Player 1 ha ganado.");
        } else if (player2wins > player1Wins) {
            System.out.println("Player 2 ha ganado la serie!");
        } else {
            System.out.println("Hubo empate");
        }

        sc.close();  
    }
}
