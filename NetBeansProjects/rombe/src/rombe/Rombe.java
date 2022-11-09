/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rombe;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Rombe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = lector.nextInt();

        RomboPintado(num);
    }

    private static void RomboPintado(int num) {
        int numerofilaActual = 0;
        int numeroHashtag = 1;
        int numeroEspacio = num;
        while (numerofilaActual != num) {
            int numeroHashtagLinea = numeroHashtag;
            int numeroEspacioFila = numeroEspacio;
            while (Math.abs(numeroEspacioFila) > 0) {
                System.out.print(" ");
                numeroEspacioFila--;
            }
            while (numeroHashtagLinea > 0) {
                System.out.print("#");
                numeroHashtagLinea--;
            }
            System.out.println("");
            numeroHashtag += 2;
            numerofilaActual += 1;
            numeroEspacio -= 1;
        }
        while (numerofilaActual != -1) {
            int numeroHashtagLinea = numeroHashtag;
            int numeroEspacioFila = numeroEspacio;
            while (numeroEspacioFila < 0) {
                System.out.print(" ");
                numeroEspacioFila++;
            }
            while (numeroHashtagLinea > 0) {
                System.out.print("#");
                numeroHashtagLinea--;
            }
            System.out.println("");
            numeroHashtag -= 2;
            numerofilaActual -= 1;
            numeroEspacio -= 1;
        }
    }

}
