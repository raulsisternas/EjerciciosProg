/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivina;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Adivina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int NumeroAdivinar = (int) (Math.random() * (9999 - 1000 + 1) + 1000);
        System.out.println("Numero a adivinar" + NumeroAdivinar);
        int num = lector.nextInt();

        while (num != NumeroAdivinar) {
            if (num < NumeroAdivinar) {
                System.out.println("El número es mayor, intentalo de nuevo");
                num = lector.nextInt();

            } else {
                System.out.println("El número es menor, intentalo de nuevo");
                num = lector.nextInt();
            }
        }
        System.out.println("Has ganado");
    }

}
