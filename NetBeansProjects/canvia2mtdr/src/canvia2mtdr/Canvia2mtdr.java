/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package canvia2mtdr;

/**
 *
 * @author Alumno
 */
public class Canvia2mtdr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static String canvia(int num) {
    return num > 0 ? canvia(num / 2) + (num % 2) : "";
}

}
