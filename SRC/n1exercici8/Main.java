package n1exercici8;

public class Main {

    public static void main (String[] args) {
        Frog frog = new Frog();
        Amphibian amphibian = frog;
        amphibian.menjar();
        amphibian.moure();
        amphibian.respirar();
    }

}
