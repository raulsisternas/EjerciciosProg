/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validadni;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Validadni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Entra el DNI");
        String dni = lector.nextLine();
        System.out.println(validaDNI(dni)? "Es correcte" : "NO és correcte");
    }

    private static boolean validaDNI(String dni) {
        if (dni.length() == 9) {
             String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
             String numeros = dni.substring(0, 8);
             String letra = dni.substring(9, 9);
             letra = letra.toUpperCase();
             int numero = Integer.parseInt(numeros);
             int pos = numero%23;
             String letraX = letras.substring(pos, pos);
             if (letra.equals(letraX)) {
                return true; 
             }
             return false;
             
        }
        return false;
        
    }
    
}
 
