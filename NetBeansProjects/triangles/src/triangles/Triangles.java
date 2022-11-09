/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triangles;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Triangles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = lligNumEntre(3, 10);
        String triangle ="";
        
        System.out.println(triangle);
    }
    
    private static int lligNumEntre(int inf, int sup) {
        if (inf>sup) {
            return lligNumEntre(sup, inf);
        }
    
    
}
