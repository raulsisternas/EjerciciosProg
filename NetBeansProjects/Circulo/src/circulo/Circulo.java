package circulo;

import java.util.Scanner;

public class Circulo {

    public static void main(String[] args) {

        double radio;
        Scanner teclado = new Scanner(System.in);
        System.out.print("El rádio del círculo es = ");
        radio = teclado.nextDouble();
        double area = (radio * radio) * Math.PI;
        System.out.println("El área del círculo es = " + area);
        double perimetro = 2 * Math.PI * radio;
        System.out.println("El perímetro del círculo es = " + perimetro);

    }
}
