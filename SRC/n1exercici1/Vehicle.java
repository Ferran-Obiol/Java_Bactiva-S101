package n1exercici1;

public class Vehicle {

    public void iniciar(){
        System.out.println("Funció iniciar.");
    }

    public static void main(String[] args){
        System.out.println("Inici del programa.");
        Vehicle vehicle = new Vehicle();
        vehicle.iniciar();
    }
}
