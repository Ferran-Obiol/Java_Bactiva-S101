package n2exercici2;

public class Vehicle {

    public void iniciar(){
        System.out.println("Funció iniciar.");
    }

    public static void parar(){
        System.out.println("Funció parar.");
    }

    public void accelerar(){
        System.out.println("Funció accelerar.");
    }

    public static void main(String[] args){
        Vehicle vehicle = new Vehicle();
        Vehicle.parar();
        vehicle.accelerar();
    }
}
