package temperatura;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        double celsius;
        double temperatura;
        Scanner teclado = new Scanner(System.in);
        System.out.print("temperatura en fahrenheit = ");
        temperatura = teclado.nextDouble();
        celsius = ((temperatura - 32) * 5 / 9);
        System.out.printf("temperatura en celsius = %.2f", celsius);

    }

}
