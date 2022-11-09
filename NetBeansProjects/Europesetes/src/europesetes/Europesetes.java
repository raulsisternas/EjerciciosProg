package europesetes;

import java.util.Scanner;

public class Europesetes {

    public static void main(String[] args) {

        int dinero;

        Scanner teclado = new Scanner(System.in);
        System.out.print("dinero = ");
        dinero = teclado.nextInt();
        dinero = (double)(dinero *166'386);
        System.out.print("dinero a pesetas = " + dinero + " Pts");

    }

}
