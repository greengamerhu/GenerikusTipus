package hu.petrik.generikustipus.Halmaz;

import hu.petrik.generikustipus.verem.Verem;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static Scanner sc = new Scanner(System.in);
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
        Verem<Character> stack =  new Verem<>();
        Verem<Character> stackReverse = new Verem<>();
        String szo = sc.nextLine();
        String tukorszo = "";
        for (int i = 0; i < szo.length(); i++) {
            stack.push(szo.charAt(i));
        }
        int i = 0;
        while( i< szo.length()) {
            System.out.println(szo.charAt(i));
            i++;
        }
        System.out.println("------------------");
        while(!stack.isEmpty()) {
            System.out.println(stack.top());
            stack.pop();
        }
        System.out.println(tukorszo);


    }
}
