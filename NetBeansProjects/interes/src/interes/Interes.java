/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interes;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Interes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Cantidad de dinero depositada: ");
        double dinero = lector.nextDouble();
        System.out.println("Numero de años del deposito: ");
        int años = lector.nextInt();
        System.out.println("Porcentaje de interes anual: ");
        int porcentaje = lector.nextInt();
        while (años > 0) {
        double InteresAnual = dinero * porcentaje / 100; 
        dinero += InteresAnual;
        años --;
            System.out.println("Dinero: " + dinero); 
    }
       
   }
        
}
