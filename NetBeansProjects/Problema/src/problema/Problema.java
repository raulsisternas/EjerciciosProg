package problema;

public class Problema {

    static int x, y;

    public static void main(String[] args) {
        {
            int x = 5;
        }
        x--;
        y = x++ + ++x;
        y += x + ++x;
        System.out.println(y);

        int a, b;

        a = 3;

        System.out.println("a = " + a);

        b = -3;
        a = a + 1;
        System.out.println("a = " + a);

        a = a + 2 * b;
        System.out.println("a = " + a);

        a = a - 2 * b - 2;
        System.out.println("a = " + a);

        a = a / b - 3;
        System.out.println("a = " + a);

        a = (a - b * 4) % a;

        System.out.println("a = " + a);

    }

}
