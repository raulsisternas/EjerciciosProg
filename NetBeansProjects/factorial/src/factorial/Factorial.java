/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n = Math.abs(lector.nextInt());
        double factorial = getFactorial(n);
        System.out.println("El factorial es: " + factorial);
        
    }

    private static double getFactorial(int n) {
        double fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact*i;
        }
        return fact;
        
    }
    
}
