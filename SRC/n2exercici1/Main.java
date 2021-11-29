package n2exercici1;



public class Main {

    public static void main (String[] args) {
        Unicycle unicycle = new Unicycle();
        Bycicle bycicle = new Bycicle();
        Tricycle tricycle = new Tricycle();
        ride(unicycle);
        ride(bycicle);
        ride(tricycle);
    }

    public static void ride(Cycle c){
        System.out.println("Class type in ride method = " + c.getClass());
    }

}
