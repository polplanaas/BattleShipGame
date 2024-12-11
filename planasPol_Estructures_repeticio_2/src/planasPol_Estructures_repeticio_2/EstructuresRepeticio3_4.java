// Joc d'enfonsar vaixells. Pinta un taulell de 4 x 4. Genera aleatòriament un vaixell en una de les caselles, però no l'ensenyis, i a continuació demana a l'usuari que entri una coordenada en el format B1, A4 ... Si encerta la casella on està el vaixell GUANYA: TOCAT i ENFONSAT i acaba el joc i mostra la posició del vaixell. sinó diu B1 = AIGUA i segueix jugant.

package planasPol_Estructures_repeticio_2;

import java.util.Random;
import java.util.Scanner;

public class EstructuresRepeticio3_4 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generadorAleatori = new Random();
        
        int numero = generadorAleatori.nextInt(4);
        numero++;
        int NumLletra = generadorAleatori.nextInt(4);
        NumLletra++;
        
        char lletra = ' ';
        int contador = 0;
        
        if (NumLletra == 1) {
        	lletra = 'A';
        } else if (NumLletra == 2) {
        	lletra = 'B';
        } else if (NumLletra == 3) {
        	lletra = 'C';
        } else if (NumLletra == 4) {
        	lletra = 'D';
        } else {
        	System.out.print("ERROR");
        }
        
        String cordenadasCorrectes = lletra + "" + numero;
        
        System.out.print("  A B C D");
        for (int contador1 = 0; contador1 != 4; contador1++) {
        	System.out.println();
        		System.out.print((contador1 + 1) + " ");
        	for (int contador2 = 0; contador2 != 4; contador2++) {
        			System.out.print("* ");
        	}
        }
        String cordenadas = "";
        while (!cordenadas.equals(cordenadasCorrectes)) {
        	System.out.println("");
        	System.out.print("Introdueix les cordenadas (ESCRIU-HO EN MAJUSCULES): ");
        	cordenadas = in.next();
        	if (cordenadas.equals(cordenadasCorrectes)) {
        		System.out.printf("%s = TOCAT I ENFONSAT. ENHORABONA HAS TROBAT EL VAIXELL EN %d jugades ", cordenadas, (contador + 1));
        		System.out.println("");
        	} else {
        		System.out.printf("%s = AIGUA", cordenadas);
        		System.out.println("");
        		contador++;        	
        	}
        }
        System.out.println("");
        System.out.print("  A B C D");
        for (int contador1 = 0; contador1 != 4; contador1++) {
        	System.out.println();
        		System.out.print((contador1 + 1) + " ");
        	for (int contador2 = 0; contador2 != 4; contador2++) {
        		if (NumLletra == (contador2 +1) && (numero == (contador1 +1))) {	
        			System.out.print("V ");
        		} else {
        			System.out.print("* ");
        		}
        	}
        }
        
        in.close();
	}
}
