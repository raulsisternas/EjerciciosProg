/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package password;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Alumno
 */
public class Password {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escribe la contraseña");
        
        String Password = lector.nextLine();
        while (Password.length() < 8 && Pattern.matches("[0-9]{2,}", Password) && Pattern.matches("[a-z]", Password) && Pattern.matches("[A-Z]", Password)) {            
            System.out.println("Escribe la contraseña");
            Password = lector.nextLine();
            
            } 
        }
    
    }
