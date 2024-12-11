//Repàs de xarxes2: Fes un programa que et demani una adreça IP en format decimal (Ex: 192.164.0.4)  El programa cal que et retorni si l’adreça és de classe A, B, C, D o E. Cal comprovar que la IP té el format correcte (4 números de 0 a 255 separats per punts) i anar demanant fins que sigui correcte

package planasPol_Estructures_repeticio_2;

import java.util.Scanner;

public class EstructuresRepeticio3_3 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int contador = 0;
        String ip = "";
        char clas = ' ';
        
        System.out.print("Escriu els primers numeros de l'ip: ");
        int nums = in.nextInt();
        
        
        
        while (contador != 4) {
        	if (contador == 0) {
        		if (nums >=1 & nums <=127) {
                	clas = 'A';
                	ip = "" + nums;
                	contador++;
                } else if (nums >=128 & nums <=191) {
                	clas = 'B';
                	ip = "" + nums;
                	contador++;
                } else if (nums >=192 & nums <=223) {
                	clas = 'C';
                	ip = "" + nums;
                	contador++;
                } else if (nums >=224 & nums <=239) {
                	clas = 'D';
                	ip = "" + nums;
                	contador++;
                } else if (nums >=240 & nums <=255) {
                	clas = 'E';
                	ip = "" + nums;
                	contador++;
                } else {
                	System.out.println("El numero no es valid, torna a insertar un altre numero dintre el rang (0 - 255): ");
                	nums = in.nextInt();
                }
        	} else {
        	System.out.print("Escriu els seguents numeros de l'ip: ");
            nums = in.nextInt();
            if (nums >= 0 & nums <= 255) {
            	ip = ip + "." + nums;
            	contador++;
            } else {
            	System.out.println("El numero no es valid.");
            }
        	}
        }
        
        System.out.printf("La ip %s esta correctament dintre el rang i es de classe %s", ip, clas);
	
        in.close();
	}
}
