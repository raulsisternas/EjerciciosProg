package arearectangle;

import java.util.Scanner;

public class Arearectangle {

    public static void main(String[] args) {
        double base;
        double altura;
        Scanner teclado = new Scanner(System.in);
        System.out.print("base=");
        base = teclado.nextDouble();
        System.out.print("altura=");
        altura = teclado.nextDouble();
        double area = base * altura;
        System.out.print("area=" + area + "cm");

    }

}
