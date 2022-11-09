/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculapi;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Calculapi {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        Scanner lector = new Scanner (System.in);
//        System.out.println("Introduce la cantidad de divisiones");
//        int num = lector.nextInt();
//        if (num != 0) {
//        System.out.println("Pi = " + ( 4 * pi(num)));
//        } else {
//            System.out.println("Fin");
//    }
//    
//}
//    
//    private static double pi(int num) {
//    int veces = num;
//    int divisor = 1;
//    int dividendo = 1;
//    double resultado = 0;
//    while (veces >= 0) {
//        resultado += dividendo/divisor;
//        dividendo *= -1;
//        divisor += 2;
//        veces --;
//    }
//    return resultado; 
//    
//  }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Entra el nombre de termes");
        int numTermes = lector.nextInt();
        while (numTermes != 0) {
            numTermes = Math.abs(numTermes);
            System.out.printf("PI = %16f", getPI(numTermes));
            System.out.println("Entra el nombre de termes");
            numTermes = lector.nextInt();
            
        }
    }

    private static double getPI(int numTermes) {
        double suma = 1;
        int denominador = 3;
        boolean calSumar = false;
        for (int i = 0; i < numTermes; i++) {
            double terme = (calSumar?1:-1) * 1.0 / denominador;
            suma += terme;
            denominador += 2;
            calSumar = !calSumar;
        }
        return 4 * suma;
    }
    
}

