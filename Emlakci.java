package buildo;

public class Emlakci {

    public static void main(String[] args) {

        Ev ev1 = new Ev();
        ev1.setIl("il");
        ev1.setIlce("ilve");
        ev1.setMahalle("mahalle");
        ev1.setOdaSayisi(3);
        ev1.setBinaYili(2010);
        ev1.setHasKlima(true);

        Ev ev2 = new Ev("il_ev2", "ilce_ev2", "mahalle_ev2", 1, 2, 3, 4, 5, true, false, false, false, false, false);

        printEv(ev1);
        printEv(ev2);

    }

    private static void printEv(Ev ev) {
        System.out.println();

        System.out.println("Ev eklendi: " + ev);
    }
}
