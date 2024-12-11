//PEDRA-PAPER-TISORA (millorat) Escriu un programa que jugui a pedra-paper-tisora. El programa genera un número 0, 1 o 2 representant pedra, paper o tisora. El programa demana un número a l’usuari 0, 1 o 2 i mostra un missatge indicant si l’usuari o l’ordinador guanyen, perden o empaten. Revisa el programa per permetre a l’usuari jugar contínuament fins que o bé l’ordinador o bé l’usuari guanyi tres partides.
//Joc Millorat

package planasPol_Estructures_repeticio_2;

import java.util.Scanner;
import java.util.Random;

public class EstructuresRepeticio3_1 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generadorAleatori = new Random();
        
        int contadorMaquina = 0;
        int contadorUsuari = 0;
        
        while (contadorMaquina !=3 & contadorUsuari !=3) {
	       
        	System.out.print("Introdueix un numero, pedra (0), paper (1), tisores (2): ");
	        int num = in.nextInt();
	
	        int ordinador = generadorAleatori.nextInt(3);
	
	        if (num == 0 & ordinador == 0) {
	            System.out.println("Tu has tret pedra i la maquina ha tret pedra, per tant hi ha hagut empat.");
	            System.out.printf("El marcador ara mateix esta: MAQUINA: %s a TU: %s", contadorMaquina, contadorUsuari);
	            System.out.println("");
	        } else if (num == 1 & ordinador == 1){
	            System.out.println("Tu has tret paper i la maquina ha tret paper, per tant hi ha hagut empat.");
	            System.out.printf("El marcador ara mateix esta: MAQUINA: %s a TU: %s", contadorMaquina, contadorUsuari);
	            System.out.println("");
	        } else if (num == 2 & ordinador == 2){
	            System.out.println("Tu has tret tisores i la maquina ha tret tisores, per tant hi ha hagut empat.");
	            System.out.printf("El marcador ara mateix esta: MAQUINA: %s a TU: %s", contadorMaquina, contadorUsuari);
	            System.out.println("");
	        } else if (num == 0 & ordinador == 1){
	            System.out.println("Tu has tret pedra i la maquina ha tret paper, per tant la maquina ha guanyat.");
	            contadorMaquina++;
	            System.out.printf("El marcador ara mateix esta: MAQUINA: %s a TU: %s", contadorMaquina, contadorUsuari);
	            System.out.println("");
	        } else if (num == 0 & ordinador == 2){
	            System.out.println("Tu has tret pedra i la maquina ha tret tisores, per tant tu has guanyat a la maquina.");
	            contadorUsuari++;
	            System.out.printf("El marcador ara mateix esta: MAQUINA: %s a TU: %s", contadorMaquina, contadorUsuari);
	            System.out.println("");
	        } else if (num == 1 & ordinador == 0){
	            System.out.println("Tu has tret paper i la maquina ha tret pedra, per tant tu has guanyat a la maquina.");
	            contadorUsuari++;
	            System.out.printf("El marcador ara mateix esta: MAQUINA: %s a TU: %s", contadorMaquina, contadorUsuari);
	            System.out.println("");
	        } else if (num == 1 & ordinador == 2){
	            System.out.println("Tu has tret paper i la maquina ha tret tisores, per tant la maquina ha guanyat.");
	            contadorMaquina++;
	            System.out.printf("El marcador ara mateix esta: MAQUINA: %s a TU: %s", contadorMaquina, contadorUsuari);
	            System.out.println("");
	        } else if (num == 2 & ordinador == 0){
	            System.out.println("Tu has tret tisores i la maquina ha tret pedra, per tant la maquina ha guanyat.");
	            contadorMaquina++;
	            System.out.printf("El marcador ara mateix esta: MAQUINA: %s a TU: %s", contadorMaquina, contadorUsuari);
	            System.out.println("");
	        } else if (num == 2 & ordinador == 1){
	            System.out.println("Tu has tret tisores i la maquina ha tret paper, per tant tu has guanyat a la maquina.");
	            contadorUsuari++;
	            System.out.printf("El marcador ara mateix esta: MAQUINA: %s a TU: %s", contadorMaquina, contadorUsuari);
	            System.out.println("");
	        } else {
	            System.out.println("El numero que has introduit no es correcte");
	        }
        }
        
        if (contadorMaquina == 3) {
        	System.out.println("");
            System.out.printf("La maquina t'ha guanyat %s a %s", contadorMaquina, contadorUsuari);
        } else if (contadorUsuari == 3){
        	System.out.println("");
        	System.out.printf("Has guanyat a la maquina %s a %s", contadorUsuari, contadorMaquina);
        } else {
        	System.out.print("ERROR");
        }
        
        in.close();
    }
}

