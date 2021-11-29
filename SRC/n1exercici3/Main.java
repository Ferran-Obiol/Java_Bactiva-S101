package n1exercici3;

public class Main  {

    public static void main(String[] args){
        System.out.println("Inicialitzem un altra clase cridant un metode static. Veurem el missatge del bloc static.");
        Vehicle.parar();
        System.out.println("Creem una instancia de la clase. No hauriem de tornar a veure el missatge.");
        Vehicle vehicle = new Vehicle();
    }
}
