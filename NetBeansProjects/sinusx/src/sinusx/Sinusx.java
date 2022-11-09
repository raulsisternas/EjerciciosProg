/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sinusx;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Sinusx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el angulo requerido");
        int num = lector.nextInt();
        
        while (num <= 0) {            
            System.out.println("¿Cuál es el angulo?");
            num = lector.nextInt();
        }
        double sinus = getSinus(num);
        double radiant = getRadiant(num);
    }

    private static double getSinus(int radiant) {
        
        double sinus = 0;
        for (int i = 0; i < 84; i++) {
        int elevat = 3;
        sinus = radiant + Math.pow(radiant, elevat) / elevat;
        elevat += 2;
    }
        return sinus;
        
    }

    private static double getRadiant(int num) {

        return 0;  

    }
        
}
