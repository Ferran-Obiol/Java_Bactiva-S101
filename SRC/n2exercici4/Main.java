package n2exercici4;


public class Main {

    public static void main (String[] args) {
        Ratoli ratoli = new Ratoli();
        Jerbu jerbu = new Jerbu();
        Hamster hamster = new Hamster();
        Rossegador[] rossegadors = new Rossegador[3];
        rossegadors[0] = ratoli;
        rossegadors[1] = jerbu;
        rossegadors[2] = hamster;
        for (int i = 0; i< rossegadors.length; i++){
            rossegadors[i].correr();
            rossegadors[i].rossegar();
            rossegadors[i].ensumar();
        }
    }

}
