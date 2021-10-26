package buildo;

public class EmlakciV2 {

    public static void main(String[] args) {

        Ev degisikEv = EvBuilder.startBuild().setIl("istanbul").setIlce("Uskudar").setMahalle("Aziz Mahmut Hudayi").setEsyali(true).build();
        // Ev eklendi: Ev{il='istanbul', ilce='Uskudar', mahalle='Aziz Mahmut Hudayi', binaYili=0, balkonSayisi=0,
        // odaSayisi=0, banyoSayisi=0, tuvaletSayisi=0, isDublex=false, isEsyali=true, hasOtopark=false, hasCocukParki=false, hasKlima=false, hasHavuz=false}

        printEv(degisikEv);

        Ev havuzluEv = EvBuilder.startBuild().buildHavuzluEv();

        printEv(havuzluEv);

    }

    private static void printEv(Ev ev) {
        System.out.println();

        System.out.println("Ev eklendi: " + ev);
    }
}
