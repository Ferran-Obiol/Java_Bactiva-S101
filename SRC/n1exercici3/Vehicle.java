package n1exercici3;

public class Vehicle {
    static {
        System.out.println("Classe inicialitzada per primer cop");
    }
    public static String inicialitzacio = "incialització";

    public Vehicle() {

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
