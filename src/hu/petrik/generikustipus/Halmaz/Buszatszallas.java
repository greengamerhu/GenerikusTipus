package hu.petrik.generikustipus.Halmaz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public  class Buszatszallas {
    private Halmaz<String> egyikJarat ;
    private Halmaz<String> masikJarat ;

    public Buszatszallas(String egyikFajl, String masikfajl) throws FileNotFoundException {
        this.egyikJarat = beolvas(egyikFajl);
        this.masikJarat = beolvas(masikfajl);
    }

    private static Halmaz<String> beolvas(String fajlnev) throws FileNotFoundException {
        Halmaz<String> megallok = new Halmaz<>();
        Scanner sc = new Scanner(new File(fajlnev));
        while (sc.hasNext()) {
            megallok.add(sc.nextLine());
        }
        sc.close();
        return megallok;
    }
    public Halmaz<String> kozosMegallok() {
        return egyikJarat.interSection(masikJarat);
    }
}
