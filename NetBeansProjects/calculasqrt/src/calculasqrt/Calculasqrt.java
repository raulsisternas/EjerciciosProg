/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculasqrt;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Calculasqrt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un número del que quieras saber la raiz cuadrada");
        int num = lector.nextInt();
        
        while (num < 0) {            
            num = lector.nextInt();
        }
        
        double a = Calcularaiz(num);
        System.out.printf("La raiz cuadrada de %d es %f", num, a);
        
    }
    
    private static double Calcularaiz(int num) {
       double a = (double) num / 2;
       double a1 = 0;
       
        while (a != a1) {       
            a1 = a;
            a = (a1 + num / a1) /2;
        }
        return a;
    }
}
