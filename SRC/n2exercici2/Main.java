package n2exercici2;


public class Main {

    public static void main (String[] args) {
        Unicycle unycicle = new Unicycle();
        Bycicle bycicle = new Bycicle();
        Tricycle tricycle = new Tricycle();
        ride(unycicle);
        ride(bycicle);
        ride(tricycle);
    }

    public static void ride(Cycle c){
        System.out.println("Nmber of wheels = " + c.wheels());
    }

}
