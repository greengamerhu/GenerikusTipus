package hu.petrik.generikustipus.Halmaz;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        /*
        try {
            Buszatszallas buszatszallas =  new Buszatszallas("files/102.txt", "files/105.txt");
            Halmaz<String> kozosmegallok_102_105 = buszatszallas.kozosMegallok();
            System.out.printf("%d megálló van, ahol a 102-es buszról a 105-ös buszra átszálhatunk.\n Ezek a megállók: %s",
                    kozosmegallok_102_105.getSize(), kozosmegallok_102_105);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        */

        try {
            Lotto lotto = new Lotto("files/lottosz.dat");
            System.out.printf("%s olyan lottoszam amit még nem húztak ki: ", lotto.vanENemKihuzott() ? "van" : "nincs");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
