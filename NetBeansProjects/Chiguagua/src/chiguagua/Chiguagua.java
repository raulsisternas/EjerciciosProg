package chiguagua;

public class Chiguagua {

    public static void main(String[] args) {

        Integer a = 13;
        System.out.println("a= " + a + " idhc=" + System.identityHashCode(a));
        a = a + 3;
        System.out.println("a= " + a + " idhc=" + System.identityHashCode(a));

    }

}
