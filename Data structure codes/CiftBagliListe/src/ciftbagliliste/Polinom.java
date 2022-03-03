package ciftbagliliste;

public class Polinom {

    Dugum bas, son;

    public Polinom() {
        bas = null;
        son = null;
    }

    public void sonaEkle(Dugum yeni) {
        if (bas == null) {
            bas = yeni;
            son = yeni;
        } else {
            son.ileri = yeni;
            yeni.geri = son;
            son = yeni;
        }
    }

    public void goster() {
        Dugum tmp = bas;
        while (tmp != null) {
            System.out.print(tmp.kat + "X^" + tmp.us + " OP  ");
            tmp = tmp.ileri;
        }
    }
}
