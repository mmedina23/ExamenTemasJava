package com.examen;

public class SergioHurtado {

    /**
     * Llamar los metodos ejercicio1 y ejercicio2 desde el main
     */
    public static void main(String[] args) {

        ejercicio1();

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
     * El metodo debe devolver un string indicando el ganador.
     */
    /*  public void ejercicio2(char respuesta1, char respuesta2) {
    	char R ; 
    	char P; 
    	char S; 
    	String mensaje1 = "player1";
    	String mensaje2 = "player2";
    	String mensaje3 = "tie"; 
    	
    	if(respuesta1 == R && respuesta2 == P ) {
    		
    		System.out.println(mensaje1);
    		
    	}
    	else if (respuesta1 == P && respuesta2 == R) {
    		System.out.println(mensaje2);
    		}
    	else if (respuesta1 == S && respuesta2 == P) {
    		System.out.println(mensaje1);
    	}
    	else if (respuesta2 == S && respuesta2 == P) {
    		
    	}*/
}
