package com.examen;

public class DeCastroEstefania2 {
	 public static void main(String[] args) {
	        DeCastroEstefania2 examen1 = new DeCastroEstefania2();
	        examen1.ejercicio1();
	        String[][] jugadas = {
	            {"R", "S"},
	            {"S", "R"},
	            {"P", "S"}
	        };
	        examen1.ejercicio2(jugadas);
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
	    * Crea un programa que calcule quién gana más partidas al piedra,
	    * papel, tijera.
	    * - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
	    * - La función recibe un listado que contiene pares, representando cada jugada.
	    * - El par puede contener combinaciones de "R" (piedra), "P" (papel)
	    *   o "S" (tijera).
	    * - Ejemplo. Entrada: [("R","S"), ("S","R"), ("P","S")]. Resultado: "Player 2".
	    * 
	    * El método debe devolver un string indicando el ganador.
	    */
	    public void ejercicio2(String[][] jugadas) {
	    	  	int victoriasP1 = 0;
	    	    int victoriasP2 = 0;
	    	    for (String[] par : jugadas) {
	    	        String p1 = par[0].toUpperCase();  // Jugador 1
	    	        String p2 = par[1].toUpperCase();  // Jugador 2

	    	        if (p1.equals(p2)) {
	    	            continue; // Por si empatan
	    	        } else if ((p1.equals("R") && p2.equals("S")) || //Piedra gana a tijeras
	    	                   (p1.equals("P") && p2.equals("R")) || //Papel gana a piedra
	    	                   (p1.equals("S") && p2.equals("P"))) { // Tijeras gana a papel,
	    	            victoriasP1++;
	    	        } else {
	    	            victoriasP2++;
	    	        }
	    	    }
	    	    if (victoriasP1 > victoriasP2) {
	    	        System.out.println("Gana el Jugador 1.");
	    	    } else if (victoriasP2 > victoriasP1) {
	    	        System.out.println("Gana el Jugador 2.");
	    	    } else {
	    	        System.out.println("Empate.");
	    	    }
	    }

}
