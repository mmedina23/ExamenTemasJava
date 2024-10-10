package com.examen;

import java.util.List;

public class VictorAntolin {
    
    public static void main(String[] args) {
        VictorAntolin examen = new VictorAntolin();
        examen.ejercicio1();
        
        // Para probar ejercicio2
        List<String[]> jugadas = List.of(new String[]{"R", "S"}, new String[]{"S", "R"}, new String[]{"P", "S"});
        String resultado = examen.ejercicio2(jugadas);
        System.out.println("Resultado de Piedra, Papel o Tijera: " + resultado);
    }
    
    // Ejercicio 1: FizzBuzz
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

    // Ejercicio 2: Piedra, Papel o Tijera
    public String ejercicio2(List<String[]> jugadas) {
        int player1Victorias = 0;
        int player2Victorias = 0;

        for (String[] jugada : jugadas) {
            String p1 = jugada[0];
            String p2 = jugada[1];

            if (p1.equals(p2)) {
                continue; // Empate, no suma puntos
            }

            if (ganaJugador1(p1, p2)) {
                player1Victorias++;
            } else {
                player2Victorias++;
            }
        }

        if (player1Victorias > player2Victorias) {
            return "Player 1";
        } else if (player2Victorias > player1Victorias) {
            return "Player 2";
        } else {
            return "Empate";
        }
    }

    // Función auxiliar para determinar si gana el jugador 1
    private boolean ganaJugador1(String p1, String p2) {
        return (p1.equals("R") && p2.equals("S")) || 
               (p1.equals("P") && p2.equals("R")) || 
               (p1.equals("S") && p2.equals("P"));
    }
}

