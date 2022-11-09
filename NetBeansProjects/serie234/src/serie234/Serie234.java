/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serie234;

/**
 *
 * @author Alumno
 */
public class Serie234 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 1;
        int mul = 1;
        int suma = 0;
        String serie = "";
        while (num < 10000000) {
            suma += num;
            serie += num + " + ";
            mul ++;
            num *= mul;
            
        }
        serie = serie.substring(0, serie.length()-2) + "= " + suma;
        System.out.println(serie);
    }
    
}
