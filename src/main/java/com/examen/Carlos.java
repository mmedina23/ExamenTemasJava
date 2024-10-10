package com.examen;

public class Carlos {
    /**
     * 
     *  Llamar los metodos ejercicio1 y ejercicio2 desde el main
     */
    public static void main(String[] args) {
        Carlos examen = new Carlos();
        examen.ejercicio1();  
        
        examen.ejercicio2();  
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
    *   o "S" (tijera).
    * - Ejemplo. Entrada: [("R","S"), ("S","R"), ("P","S")]. Resultado: "Player 2".
    * 
    * el emtodo debe devolver un string indicando el ganador.
    */
    public void ejercicio2(){
        
        String[][] jugadas = { {"R", "S"}, {"S", "R"}, {"P", "S"} };
        int victoriasJugador1 = 0;  
        int victoriasJugador2 = 0;

  /*  
    if (jugador1.equals(jugador2)) {
       
        //continue;  ??
    } else if (
        (jugador1.equals("R") && jugador2.equals("S")) ||  
        (jugador1.equals("S") && jugador2.equals("P")) || 
        (jugador1.equals("P") && jugador2.equals("R"))     
    ) {
        victoriasJugador1++;  
    } else {
        victoriasJugador2++;  
    }*/
    }
}
