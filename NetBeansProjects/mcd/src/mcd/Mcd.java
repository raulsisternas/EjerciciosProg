/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mcd;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Mcd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num1 = lector.nextInt();
        if (num1 < 0) {
            num1 *= 1;
        }
        int num2 = lector.nextInt();
        if (num2 < 0) {
            num2 *= 1;
            
        }
        int menor;
        if (num1 < num2) {
            menor = num1;
        }
        int mayor; 
        if (num1 > num2) {
            menor = num2;
    }
        if (num1 > num2) {
            mayor = num2;
}
