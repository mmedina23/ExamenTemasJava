package com.Examen;

//import java.util.Random;

public class JuanShack2 {

	public static void main(String[] args) {    
	JuanShack2 examen = new JuanShack2();
	
	examen.Ejercicio1();
	String[][] jugadas = {
            {"R", "S"},
            {"S", "R"},
            {"P", "S"}
        };
	examen.Ejercicio2(jugadas);
	
		
	}
    public void Ejercicio1() {
    	
        for (int i = 1; i <= 100; i++) {
             
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz Multiplos de 3 Y DE 5");
            } 
            
            else if (i % 3 == 0) {
                System.out.println("Bizz Mulpitos de 3");
            } 
            
            else if (i % 5 == 0) {
                System.out.println("Buzz  Multiplos de 5");
            } 
            
            else {
                System.out.println(i);
            }
        }
    }
    /*public void Ejercicio2() {
        
    	String[] opciones = {"Piedra", "Papel", "Tijeras"};

    	Random random = new Random();
    	int jugador1 = random.nextInt(3);
    	int jugador2 = random.nextInt(3);
    	    
    	System.out.println("Jugador 1 sacó: " + opciones[jugador1]);
    	System.out.println("Jugador 2 sacó: " + opciones[jugador2]);
    	    }
*/

    public void Ejercicio2(String[][] jugadas) {
    	
    	  	int PartidasGanadasJ1 = 0;
    	    int PartidasGanadasJ2 = 0;
    	    
    	    for (String[] par : jugadas) {
    	        String J1 = par[0].toUpperCase();
    	        String J2 = par[1].toUpperCase();

    	        if (J1.equals(J2)) {
    	            continue;
    	        } else if ((J1.equals("R") && J2.equals("S")) ||
    	                   (J1.equals("P") && J2.equals("R")) ||
    	                   (J1.equals("S") && J2.equals("P"))) { 
    	            PartidasGanadasJ1++;
    	        } else {
    	            PartidasGanadasJ2++;
    	        }
    	    }
    	    if (PartidasGanadasJ1 > PartidasGanadasJ2) {
    	        System.out.println("Gana el Jugador 1.");
    	    } else if (PartidasGanadasJ2 > PartidasGanadasJ1) {
    	        System.out.println("Gana el Jugador 2.");
    	    } else {
    	        System.out.println("Empate.");
    	    }
    }

}
