package toniapp;

public class Keyboard {

    double altura;
    double anchura;
    int peso;
    String marca;

    public Keyboard(double altura, double anchura, int peso, String marca) {

        this.altura = altura;
        this.anchura = anchura;
        this.peso = peso;
        this.marca = marca;
    
    
    }
    public void mostrarDatos() {

        System.out.println("La altura del teclado es de: " + altura + "cm");
        System.out.println("La anchura del teclado es de: " + anchura + "cm");
        System.out.println("El peso del teclado es de: " + peso + "g");
        System.out.println("La marca del teclado es: " + marca);

    }

}


