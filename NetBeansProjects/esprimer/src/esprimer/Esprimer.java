/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package esprimer;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Esprimer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num = lector.nextInt();
        boolean primer = EsprimerMethod(num);
        if (primer == true) {
            System.out.println("Número primo");
        } else {
            System.out.println("Número no primo");
        }
    }

    private static boolean EsprimerMethod(int num) {
        int n = 2;
        boolean bl = false;
        while (n < num / 2) {
            if (num % n == 0) {
                bl = true;
               return true;
            }
            n++;
        }
        if (bl != false) {
            return false;
        }
        return true;
    }

}
