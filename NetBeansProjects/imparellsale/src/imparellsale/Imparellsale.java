/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imparellsale;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Imparellsale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numrep = lector.nextInt();
        
        while (numrep <= 0){
        numrep = lector.nextInt();
        }
        while (numrep != 0) {
            
        int num = (int) (Math.random() * (22222 - 2222 + 1) + 2222);
        while (num % 2 == 0) {
            num = (int) (Math.random() * (22222 - 2222 + 1) + 2222);
            
        }
    }
    
  }
}
