package BagliListe;

public class Liste {

    Eleman bas;
    Eleman son;

    public Liste() {
        bas = null;
        son = null;

    }

    public void basaEkle(Eleman yeni) {
        if (son == null) {
            bas = yeni;
            son = yeni;
        } else {
            yeni.ileri = bas;
            bas = yeni;
        }
    }

    public void sonEkle(Eleman yeni) {
        if (bas == null) {
            bas = yeni;
            son = yeni;
        } else {
            son.ileri = yeni;
            son = yeni;
        }
    }

    public void arayaEkle(Eleman yeni, int aranan) {

        if (bas == null && son == null) {
            basaEkle(yeni);
        } else if (son == bas) {
            basaEkle(yeni);
        } else {
            Eleman tmp = bas;
            while (tmp != null && tmp.icerik != aranan) {
                tmp = tmp.ileri;

            }
            if (tmp != null) {
                yeni.ileri = tmp.ileri;
                tmp.ileri = yeni;
            }
        }
    }

    public void bul(int aranan) {
        Eleman ara = bas;
        while (aranan != ara.icerik && ara.ileri != null) {
            ara = ara.ileri;
        }
        if (ara.icerik == aranan) {
            System.out.println("Eleman bulundu");
        } else {
            System.out.println("Eleman listede yok");
        }
    }

    public void basSil() {
        if (bas == null) {
            System.out.println("listede Eleman olmadigi icin silmeye gerek yok");
            son = null;
        } else {
            bas = bas.ileri;
        }
    }

    public void sonuSilme() {
        Eleman tmp = bas;
        Eleman once = null;
        while (tmp != son) {
            once = tmp;
            tmp = tmp.ileri;
        }
        if (once == null) {
            bas = null;
            son = null;
        } else {
            once.ileri = null;
            son = once;
        }
    }

    public void arayaSilme(int silenen) {
        Eleman tmp = bas;
        Eleman once = null;

        while (tmp.icerik != silenen && tmp.ileri != null) {
            once = tmp;
            tmp = tmp.ileri;
        }
        if (tmp.ileri == null) {
            System.out.println("silinen eleman bulunmadi");
        } else {
            once.ileri = tmp.ileri;
            tmp = null;
        }
    }

    public void goster() {
        Eleman bul;
        Eleman sonra;
        if (bas == null) {
            System.out.println("Listede Eleman yok");
        } else {
            bul = bas;
            System.out.println(bul.icerik);
            while (bul.ileri != null) {
                sonra = bul.ileri;
                bul = sonra;
                System.out.println(bul.icerik);
            }
        }
    }

}
