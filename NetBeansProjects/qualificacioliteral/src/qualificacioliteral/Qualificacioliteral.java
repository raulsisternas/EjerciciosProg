/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qualificacioliteral;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Qualificacioliteral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        lector.useLocale(Locale.UK);
        System.out.println("Introduce un numero");
        double num = lector.nextDouble();
        
        if (num >= 0 && num < 3.5){
        System.out.print("Molt deficient");
        } else if (num >= 3.5 && num < 5) {
        System.out.println("Insuficient");
        } else if (num >= 5 && num < 6) {
        System.out.println("Suficient");
        } else if (num >= 6 && num < 7) {
        System.out.println("Be"); 
        } else if (num >= 7 && num < 8.5) {
        System.out.println("Notable");
        } else if (num >= 8.5 && num <= 10) {
        System.out.println("Excel·lent");
        } else {
        System.out.println("Incorrecta");
        }

    }
    
}
j