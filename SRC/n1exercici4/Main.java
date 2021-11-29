package n1exercici4;

public class Main {

    public static void main(String[] args){
        Vehicle vehicle = new Vehicle();
        System.out.println("Static string value = " + Vehicle.staticString);
        Vehicle.staticString = "changeStaticBalue";
        System.out.println("Static string value = " + Vehicle.staticString);
    }
}
