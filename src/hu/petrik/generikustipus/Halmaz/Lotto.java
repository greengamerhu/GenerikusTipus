package hu.petrik.generikustipus.Halmaz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lotto {
    private Halmaz<Integer> lottoszamok;

    public Lotto(String fajlnev) throws FileNotFoundException {
        this.lottoszamok = beolvas(fajlnev);
    }

    public boolean vanENemKihuzott() {
        boolean van = false;
        for (int i = 0; i < 91; i++) {
            if (!lottoszamok.isElement(i)) {
                van = true;
            }
        }
        return van;
    }
    private Halmaz<Integer> beolvas(String fajlnev) throws FileNotFoundException {
        lottoszamok = new Halmaz<>();
        Scanner sc = new Scanner(new File(fajlnev));

        while (sc.hasNext()) {
            String [] adatok = sc.nextLine().split(" ");
            lottoszamok.add( Integer.parseInt(adatok[0]));
            lottoszamok.add( Integer.parseInt(adatok[1]));
            lottoszamok.add( Integer.parseInt(adatok[2]));
            lottoszamok.add( Integer.parseInt(adatok[3]));
            lottoszamok.add( Integer.parseInt(adatok[4]));
        }

        sc.close();
        return lottoszamok;
    }
}
