/*
Escriu un programa que llig dos nombres i l'operació a realitzar amb ells, i després
presenta el resultat de l'operació.

Els símbols que defineixen les operacions són els caràcters ‘+’, ’-‘, ‘*’, ‘/’, ‘%’, i l'operació a
realitzar és l'operació aritmètica corresponent. Si s'introdueix altre símbol, es visualitza
un missatge d'error. Per a la suma i la multiplicació es mostra un únic resultat, per a la
resta, la divisió i el mòdul es mostren dos resultats (intercanviant la posició dels
operands). Si es llig 5, 3, +, llavors es mostra 5 + 3 = 8, si es llig 5, 3, -, llavors es mostra 5 -
3 = 2 i 3 - 5 = -2

 */
package fesoperacio;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Fesoperacio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("A = ");
        int A = lector.nextInt();
        System.out.print("B = ");
        int B = lector.nextInt();
        System.out.print("Introduce la operacion deseada");
        String operacion = lector.nextLine();
        
        if () {
            
        } else {
        }

        
    }
    
}
