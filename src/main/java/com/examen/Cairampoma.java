package com.examen;

import java.util.Scanner;
import java.security.SecureRandom;

public class Cairampoma {

    public static Scanner sc = new Scanner(System.in);

    //Escribe un programa que muestre por consola (con un print) los 
    //números de 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los siguientes:
    //- Múltiplos de 3 por la palabra "fizz".
    //- Múltiplos de 5 por la palabra "buzz".
    //- Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz". [15, 30, 45, 60, 75, 90]
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

    //Crea un programa que calcule quien gana más partidas al piedra, papel, tijera.
    //El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
    //La función recibe un listado que contiene pares, representando cada jugada.
    //El par puede contener combinaciones de "R" (piedra), "P" (papel) o "S" (tijera).
    //- Ejemplo. Entrada: [("R","S"), ("S","R"), ("P","S")]. Resultado: "Player 2". el emtodo debe devolver un string 
    //indicando el ganador.
    public static void ejercicio2(String[][] pares) {
        int contadorPlayer1 = 0;
        int contadorPlayer2 = 0;
        int gameover = 3;

        int i = 0; // índice para recorrer las jugadas

        while (gameover > 0 && i < pares.length) {
            String player1 = pares[i][0]; // Jugada del jugador 1
            String player2 = pares[i][1]; // Jugada del jugador 2

            if (player1.equalsIgnoreCase("r") && player2.equalsIgnoreCase("s")) {
                System.out.println("PIEDRA chanca TIJERAS. Gana PLAYER 1");
                contadorPlayer1++;
            } else if (player1.equalsIgnoreCase("s") && player2.equalsIgnoreCase("r")) {
                System.out.println("PIEDRA chanca TIJERAS. Gana PLAYER 2");
                contadorPlayer2++;
            } else if (player1.equalsIgnoreCase("p") && player2.equalsIgnoreCase("r")) {
                System.out.println("PAPEL cubre a PIEDRA. Gana PLAYER 1");
                contadorPlayer1++;
            } else if (player1.equalsIgnoreCase("r") && player2.equalsIgnoreCase("p")) {
                System.out.println("PAPEL cubre a PIEDRA. Gana PLAYER 2");
                contadorPlayer2++;
            } else if (player1.equalsIgnoreCase("s") && player2.equalsIgnoreCase("p")) {
                System.out.println("TIJERAS corta a PAPEL. Gana PLAYER 1");
                contadorPlayer1++;
            } else if (player1.equalsIgnoreCase("p") && player2.equalsIgnoreCase("s")) {
                System.out.println("TIJERAS corta a PAPEL. Gana PLAYER 2");
                contadorPlayer2++;
            } else {
                System.out.println("Empate");
            }

            gameover--;
            i++;
            System.out.println("Quedan " + gameover + " juegos.");
        }

        //para ver ganador final
        if (contadorPlayer1 > contadorPlayer2) {
            System.out.println("Gana PLAYER 1 con " + contadorPlayer1 + " puntos.");
        } else if (contadorPlayer2 > contadorPlayer1) {
            System.out.println("Gana PLAYER 2 con " + contadorPlayer2 + " puntos.");
        } else {
            System.out.println("Empate final");
        }
    }

    //Escribe un programa en Java, que sea capaz de generar contraseñas de forma aleatoria. 
    //Podrás configurar generar contraseñas con los siguientes parámetros: 
    //- Longitud: Entre 8 y 16. 
    //- Con o sin letras mayúsculas. 
    //- Con o sin números. 
    //- Con o sin símbolos. 
    //(Pudiendo combinar todos estos parámetros entre ellos)
    private static final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMEROS = "0123456789";
    private static final String SIMBOLOS = "!@#$%^&*()-_=+[]{}|;:,.<>?";
    private static SecureRandom random = new SecureRandom();

    public static String generarContrasena(int longitud, boolean mayus, boolean numeros, boolean simbolos) {
        String caracteres = MINUSCULAS + (mayus ? MAYUSCULAS : "") + (numeros ? NUMEROS : "") + (simbolos ? SIMBOLOS : "");
        StringBuilder contrasena = new StringBuilder(longitud);
        for (int i = 0; i < longitud; i++) {
            contrasena.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }
        return contrasena.toString();
    }

    public static void main(String[] args) {
        ejercicio1(); //Llamo al ejercicio uno (Fizz, Buzz, FizzBuzz)

        String[][] jugadas = {
            {
                "s",
                "s"
            },
            {
                "p",
                "p"
            },
            {
                "p",
                "p"
            },
            {
                "r",
                "r"
            }
        };

        //Ejecución del ejercicio2
        ejercicio2(jugadas);

        //Ejecución del ejercicio3
        System.out.print("Intgresa la longitud de la contraseña (entre 8 y 16 caracteres): ");
        int longitud = sc.nextInt();
        System.out.print("¿Deseas usar letras mayúsculas? (true/false): ");
        boolean mayus = sc.nextBoolean();
        System.out.print("¿Quieres agregar números? (true/false): ");
        boolean numeros = sc.nextBoolean();
        System.out.print("¿Finalmente añadimos símbolos? (true/false): ");
        boolean simbolos = sc.nextBoolean();
        System.out.println("Contraseña generada: " + generarContrasena(longitud, mayus, numeros, simbolos));
        sc.close();

    }
}
