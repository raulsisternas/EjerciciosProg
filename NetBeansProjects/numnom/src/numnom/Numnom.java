/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numnom;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Numnom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in,  "ISO-8859-1");
        System.out.println("Escriu el teu nom");
        String nombre = lector.next().toUpperCase();
        
        int num = calculaNumAscii(nombre);
        int numReduit = calculaNumReduit(num);    
        
    }

    private static int calculaNumAscii(String nombre) {
        int num = 0;
        int charAt = 0;
        
        while (nombre.length() != charAt) {            
            char character = nombre.charAt(charAt);
            num += (int) character;
            charAt ++;
        }
        return num;

    }

    private static int calculaNumReduit(int num) {

        return 0;
 
    }
    
}

        


