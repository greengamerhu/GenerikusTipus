package hu.petrik.generikustipus.Halmaz;

import java.util.ArrayList;
import java.util.List;

public class Halmaz<T> {
    private List<T> elemek;

    public Halmaz() {
        this.elemek = new ArrayList<>();
    }
    public boolean add(T elem) {
        boolean hozzaAdva = false;
        if (!this.elemek.contains(elem)) {
            hozzaAdva = true;
            this.elemek.add(elem);
        }
        return hozzaAdva;
    }
    public boolean remove(T elem) {
        boolean eltavolitva = false;
        if (this.elemek.contains(elem)) {
            this.remove(elem);
            eltavolitva = true;
        }
        return eltavolitva;
    }
    public int getSize() {
        return  this.elemek.size();
    }
    public void clear() {
        this.elemek.clear();
    }
    public boolean isElement(T elem) {
        return this.elemek.contains(elem);
    }
    public boolean isEmpty() {
        return this.elemek.isEmpty();
    }
    public boolean isEquals(Halmaz<T> masikhalmaz) {
        boolean megegyezik = true;
        if (this.getSize() == masikhalmaz.getSize()) {
            int i = 0;
            while (i < this.getSize() && megegyezik) {
                if (masikhalmaz.elemek.contains(this.elemek.get(i))) {
                    i++;
                } else {
                    megegyezik = false;
                }
            }
        } else {
            megegyezik = false;
        }
        return megegyezik;
    }
    public boolean isPartof(Halmaz<T> masikhalmaz) {
        boolean reszhalmaza = true;
        if (this.getSize() <= masikhalmaz.getSize()) {
            int i = 0;
            while (i < this.getSize() && reszhalmaza) {
                if (masikhalmaz.elemek.contains(this.elemek.get(i))) {
                    i++;
                } else {
                    reszhalmaza = false;
                }
            }
        } else {
            reszhalmaza = false;
        }
        return reszhalmaza;
    }
    public Halmaz<T> unio(Halmaz<T> masikHalmaz) {
        Halmaz<T> unio = new Halmaz<>();
        for (T elem: this.elemek) {
            unio.add(elem);
        }
        for (T elem: masikHalmaz.elemek) {
            unio.add(elem);
        }
        return unio;
    }
    public  Halmaz<T> interSection(Halmaz<T> masikHalmaz) {
        Halmaz<T> intersection = new Halmaz<>();
        for (T elem: this.elemek) {
            if (masikHalmaz.isElement(elem)) {
                intersection.add(elem);
            }
        }
        return intersection;
    }
    public  Halmaz<T> different(Halmaz<T> masikHalmaz) {
        Halmaz<T> dif= new Halmaz<>();
        for (T elem : this.elemek) {
            if (!masikHalmaz.isElement(elem)) {
                dif.add(elem);
            }
        }
        return dif;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(this.elemek.get(0).toString());
        for (int i = 0; i < this.getSize(); i++) {
            sb.append(", ").append(this.elemek.get(i));

        }
        return sb.toString();
    }
}
