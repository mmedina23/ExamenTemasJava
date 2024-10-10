package com.examen;

public class Ayoub {
    /**
     * Este es el punto de entrada del programa, donde comenzamos a ejecutar el código.
     */
    public static void main(String[] args) {
        Ayoub examen = new Ayoub(); // Creamos una instancia de la clase Examen

        // Llamamos al ejercicio 1
        System.out.println("===== Ejercicio 1 =====");
        //examen.ejercicio1(); // Llamamos al método ejercicio1
        System.out.println("=======================");

        // Creamos un ejemplo de jugadas para el ejercicio 2
        String[][] jugadas = {{"P", "S"}, {"R", "R"}, {"S", "S"}};
        String resultado = examen.ejercicio2(jugadas); // Llamamos al método ejercicio2
        System.out.println("===== Ejercicio 2 =====");
        System.out.println("Ganador: " + resultado); // Mostramos el ganador
        System.out.println("=======================");
    }
    
    /**
     * Este método imprime los números del 1 al 100,
     * reemplazando ciertos números por palabras.
     */
    public void ejercicio1() {
        for (int i = 1; i <= 100; i++) { // Bucle que va del 1 al 100
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz"); // Si es múltiplo de 3 y 5, imprime "fizzbuzz"
            } else if (i % 3 == 0) {
                System.out.println("fizz"); // Si es múltiplo de 3, imprime "fizz"
            } else if (i % 5 == 0) {
                System.out.println("buzz"); // Si es múltiplo de 5, imprime "buzz"
            } else {
                System.out.println(i); // Si no, imprime el número
            }
        }
    }
    
    /**
     * Este método evalúa quién gana más partidas de piedra, papel o tijera.
     */
    public String ejercicio2(String[][] jugadas) {
        int player1Wins = 0; // Contador para las victorias del jugador 1
        int player2Wins = 0; // Contador para las victorias del jugador 2

        // Recorremos todas las jugadas
        for (String[] jugada : jugadas) {
            String player1 = jugada[0]; // Jugada del jugador 1
            String player2 = jugada[1]; // Jugada del jugador 2
            
            // Mostramos las jugadas
            System.out.println("Jugadas: Player 1: " + player1 + ", Player 2: " + player2);
            
            // Comparamos las jugadas
            if (player1.equals(player2)) {
                System.out.println("Resultado: Empate\n"); // Si son iguales, es un empate
                continue; // Pasamos a la siguiente jugada
            } else if (gana(player1, player2)) {
                player1Wins++; // Si el jugador 1 gana, aumentamos su contador
                System.out.println("Resultado: Player 1 gana\n");
            } else {
                player2Wins++; // Si el jugador 2 gana, aumentamos su contador
                System.out.println("Resultado: Player 2 gana\n");
            }
        }

        // Determinamos quién ganó más partidas
        if (player1Wins > player2Wins) {
            return "Player 1"; // Retornamos el ganador
        } else if (player2Wins > player1Wins) {
            return "Player 2"; // Retornamos el ganador
        } else {
            return "Tie"; // Si hay un empate, retornamos "Tie"
        }
    }

    /**
     * Este método determina si el jugador 1 gana sobre el jugador 2.
     */
    private boolean gana(String player1, String player2) {
        return (player1.equals("R") && player2.equals("S")) || // Piedra gana a Tijera
               (player1.equals("S") && player2.equals("P")) || // Tijera gana a Papel
               (player1.equals("P") && player2.equals("R"));   // Papel gana a Piedra
    }
}

