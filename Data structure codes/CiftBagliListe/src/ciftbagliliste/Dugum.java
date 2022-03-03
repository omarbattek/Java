package ciftbagliliste;

public class Dugum {

    int kat;
    int us;
    Dugum ileri, geri;

    public Dugum(int kat, int us) {
        this.kat = kat;
        this.us = us;
        ileri = null;
        geri = null;

    }
}
