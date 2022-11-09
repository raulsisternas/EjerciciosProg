package distancia2puntos;

import java.util.Scanner;

public class Distancia2puntos {

    public static void main(String[] args) {

        int x;
        int y;

        Scanner teclado = new Scanner(System.in);
        System.out.print("x = ");
        x = teclado.nextInt();
        System.out.print("y = ");
        y = teclado.nextInt();
        System.out.print("A = " + "(" + x + "," + y + ")");
        int distancia = Math.sqrt(Math.pow(x, y) + Math.pow(0, 0));

    }

}
