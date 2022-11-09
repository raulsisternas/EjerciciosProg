/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diasetmanam;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class DiasetmanaM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("entra el dia de la setmana (1-7)");
        int diaSetmana = entrada.nextInt();
    
        
        switch (diaSetmana) {
            case 1 -> System.out.println("Dilluns");
            case 2 -> System.out.println("Dimarts");
            case 3 -> System.out.println("Dimecres");
            case 4 -> System.out.println("Dijous");
            case 5 -> System.out.println("Divendres");
            case 6 -> System.out.println("Dissabte");
            case 7 -> System.out.println("Diumenge");
            default -> System.out.println("Error");

        }
    }
    
}
