package n1exercici4;

public class Vehicle {

    public static String staticString;
    public static final String staticFinalString = "staticFinalString";
    public final String finalString;


    public Vehicle() {
        staticString = "staticString";
        finalString = "staticFinalString";
    }

    public void iniciar(){
        System.out.println("Funció iniciar.");
    }

    public static void parar(){
        System.out.println("Funció parar.");
    }

    public void accelerar(){
        System.out.println("Funció accelerar.");
    }
}
