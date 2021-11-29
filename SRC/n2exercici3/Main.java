package n2exercici3;


public class Main {

    public static void main (String[] args) {
        Unicycle unicycle = new Unicycle();
        Bycicle bycicle = new Bycicle();
        Tricycle tricycle = new Tricycle();
        Cycle[] cycles = new Cycle[3];
        cycles[0] = unicycle;
        cycles[1] = bycicle;
        cycles[2] = tricycle;
        for (int i = 0; i < cycles.length; i++) {
            if (cycles[i] instanceof Unicycle)
                ((Unicycle) cycles[i]).balance();
            else if (cycles[i] instanceof Bycicle)
                ((Bycicle) cycles[i]).balance();
            else if (cycles[i] instanceof Tricycle) {
                //    Comentat per a que compili la resta del projecte
                //    ((Tricycle) cycles[i]).balance();
            }
        }
    }

    public static void ride(Cycle c){
        System.out.println("Nmber of wheels = " + c.wheels());
    }

}
