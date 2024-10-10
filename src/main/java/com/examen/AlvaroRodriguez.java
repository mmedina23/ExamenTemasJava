package com.examen;

import java.util.Scanner;

public class AlvaroRodriguez {
    /**
     * 
     * Llamar los metodos ejercicio1 y ejercicio2 desde el main
     */
    public static void main(String[] args) {

        ejercicio1();
        ejercicio2();

    }

    /**
     *
     * Escribe un programa que muestre por consola (con un print) los
     * números de 1 a 100 (ambos incluidos y con un salto de línea entre
     * cada impresión), sustituyendo los siguientes:
     * - Múltiplos de 3 por la palabra "fizz".
     * - Múltiplos de 5 por la palabra "buzz".
     * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
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
     * Crea un programa que calcule quien gana más partidas al piedra,
     * papel, tijera.
     * - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
     * - La función recibe un listado que contiene pares, representando cada jugada.
     * - El par puede contener combinaciones de "R" (piedra), "P" (papel)
     * o "S" (tijera).
     * - Ejemplo. Entrada: [("R","S"), ("S","R"), ("P","S")]. Resultado: "Player 2".
     * 
     * el emtodo debe devolver un string indicando el ganador.
     */
    public static void ejercicio2() {

		 System.out.println("\n\nejercicio2");
		 
	        Scanner sc = new Scanner(System.in);

	        int jugador1 = 0;
	        int jugador2 = 0;
	        int empate = 0;
	        String[] jugadas = {"R", "S", "P"};

	        
	        String jugada1 = null;
	        String jugada2 = null;
	        
	        System.out.println("Jugaremos 4 rondas");
	        
	        for(int i = 0; i<4 ;i++){
	            
	            
	            System.out.println("ingrese la jugada del jugador 1");
	            jugada1=sc.nextLine().toUpperCase();
	            System.out.println("ingrese la jugada del jugador 2");
	            jugada2=sc.nextLine().toUpperCase();
	            
	            if (jugada1.equals(jugada2)){
	                System.out.println("Empate");
	                empate++;
	            } else if(jugada1.equals("R") && jugada2.equals("S") || jugada1.equals("S") && jugada2.equals("P") || jugada1.equals("P") && jugada2.equals("R")) {
	                System.out.println("Ganó jugador 1");
	                jugador1++;
	            }
	            else{
	                System.out.println("Ganó jugador 2");
	                jugador2++;
	                
	            }
	            
}
	            
	            
	        if (jugador1 > jugador2) {
	            System.out.println("Ganó jugador 1 con: "+jugador1+ " victorias");
	            
	        } else if (jugador2 > jugador1) {
	            System.out.println("Ganó jugador 2" +jugador2+ " victorias");
	        } else {
	            System.out.println("Empataron");
	        }
	 
	 

	    }//comprimir y subir a carpeta
}
