// Encriptació de missatges: Fes un programa que demani una frase i encripti aquesta frase d’acord amb la següent norma:

package planasPol_Estructures_repeticio_2;

import java.util.Scanner;

public class EstructuresRepeticio3_2 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Escriu la frase que vols encriptar: ");
        String frase = in.nextLine();
        
        char lletra;
        String fraseEncriptada = "";
        for (int contador = 0; contador < frase.length(); contador++) {
        	lletra = frase.charAt(contador);
        	if (lletra == 'e') {
        		lletra = ' ';
        		fraseEncriptada = fraseEncriptada + "" + lletra + "";
        	} else if (lletra == ' ') {
        		lletra = 'e';
        		fraseEncriptada = fraseEncriptada + "" + lletra + "";
        	} else {
        		int lletraACSII = ((int)lletra + 1);
                lletra = (char)lletraACSII;
                fraseEncriptada = fraseEncriptada + "" + lletra + "";
        	}
        }
        
        System.out.printf("La frase encriptada es: %s", fraseEncriptada);
        
        in.close();
	}
}