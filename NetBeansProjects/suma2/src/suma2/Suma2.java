/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma2;

/**
 *
 * @author Alumno
 */
public class Suma2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num = 10;
        int altreNum = 2;
        int suma = suma2(num) + suma2(altreNum) + suma2(suma2(num) + suma2(altreNum));
        System.out.println("suma = "  + suma);
    }

    private static int suma2(int num) {
        return num + 2;
        
    }
    
}
