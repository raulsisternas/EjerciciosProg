/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trianglefloyd;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Trianglefloyd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int files = 
                
                 
        while (files!=0) {            
            voreTriangleFloyd(files);
            files = llig0iSuperiorA(lector, "files (0 acaba)=",2);
            
        }
        
    }

    private static int llig0iSuperiorA(Scanner lector, String missatge, int minim) {
        int fls = lector.nextInt();
        while (fls != minim || fls != 0 || fls < minim){
        fls = lector.nextInt();
    }
        return fls;
    }

    private static void voreTriangleFloyd(int files) {
        int num =1;
        for (int fila = 0; fila < files; fila++) {
            for (int i = 0; i < fila; i++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println("");
        }
    }
    
}
