/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qualificacioliteralm;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class QualificacioliteralM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        lector.useLocale(Locale.UK);
        System.out.println("Introduce un numero");
        double num = lector.nextDouble();
        
        System.out.println("Corresponde a " +getNotaLiteral(num));
    }

    private static String getNotaLiteral(double num) {
        String res = null;
        if (num >= 0 && num < 3.5){
        return "Molt deficient";
        }
        if (num >= 3.5 && num < 5) {
        return "Insuficient";
        } 
        if (num >= 5 && num < 6) {
        return "Suficient";
        }
        if (num >= 6 && num < 7) {
        return "Bé"; 
        } 
        if (num >= 7 && num < 8.5) {
        return "Notable";
        } 
        if (num >= 8.5 && num <= 10) {
        res = "Excel·lent";
        }
        return res = "Incorrecta";
    }
 
}

