package versiojdk;

public class VersioJDK {

    public static void VersioJDK(String[] args) {
        System.out.println("Versió JDK: " + System.getProperty("java.version"));
        System.out.println("Versió JRE: " + System.getProperty("java.runtime.version"));
        System.out.println("Carpeta de Java: " + System.getProperty("java.home"));
        System.out.println("Venedor de Java: " + System.getProperty("java.vendor"));
        System.out.println("Ruta d’aquesta classe: " + System.getProperty("java.class.path"));


    }

}
