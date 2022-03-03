package odev1;

public class yeniden {

    Eleman bas;
    Eleman son;

    public yeniden() {
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

    public void arayaEkle(Eleman yeni, int indix) {

        if (bas == null && son == null) {
            basaEkle(yeni);
        } else if (son == bas) {
            basaEkle(yeni);
        } else {
            Eleman tmp = bas;
            int don = 1;
            while (tmp != son && don != indix) {
                tmp = tmp.ileri;
                don++;
            }
            if (tmp != son && don == indix) {
                yeni.ileri = tmp.ileri;
                tmp.ileri = yeni;
            }
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

    public void arayaSilme(int indix) {
        if (bas == null) {
            System.out.println("liste bos");
        } else if (bas == son) {
            System.out.println("arada eleman yok");
        } else {
            Eleman tmp = bas;
            Eleman once = null;
            int don = 0;
            while (tmp != son && don != indix) {
                once = tmp;
                tmp = tmp.ileri;
                don++;
            }
            if (tmp == son) {
                System.out.println("istedigin indix arada degil sonunda bulundu");
            } else {
                once.ileri = tmp.ileri;
            }
        }
    }

    public yeniden cevir(int sayi) {

        int add;
        int ekle;
        String Sayistr = "";
        int sayi1;
        sayi1 = sayi;

        while (sayi != 1) {

            sayi = sayi1;
            sayi1 = sayi / 2;
            if (sayi % 2 != 0) {
                add = 1;
                Sayistr = Sayistr + String.valueOf(add);
            } else {
                add = 0;
                Sayistr = Sayistr + String.valueOf(add);

            }
        }

        char mertebe;

        for (int i = 0; i < Sayistr.length(); i++) {
            if (i == 0) {
                mertebe = Sayistr.charAt(i);

                ekle = Character.getNumericValue(mertebe);
                basaEkle(new Eleman(ekle));

            } else if (i != 0 && i != Sayistr.length()) {
                mertebe = Sayistr.charAt(i);
                ekle = Character.getNumericValue(mertebe);
                sonEkle(new Eleman(ekle));

            }

        }
        return this;
    }

    public void goster() {
        Eleman bul;
        Eleman sonra;
        if (bas == null) {
            System.out.println("Listede Eleman yok");
        } else {
            bul = bas;
            System.out.print(bul.icerik + " ");
            while (bul.ileri != null) {
                sonra = bul.ileri;
                bul = sonra;
                System.out.print(bul.icerik + " ");
            }
        }
    }
//quiz sum two binary numbers in two linked list

    public yeniden topla() {
        int test = 0;
        yeniden List1 = new yeniden(); //linked list 1
        yeniden List2 = new yeniden(); //linked list 2
        yeniden ListToplam = new yeniden(); // the result linked list
        List1.basaEkle(new Eleman(1));
        List1.sonEkle(new Eleman(1));
        List1.sonEkle(new Eleman(1));

        List2.basaEkle(new Eleman(1));
        List2.sonEkle(new Eleman(1));
        List2.sonEkle(new Eleman(1));

        Eleman gec;
        Eleman gec1;

        gec = List1.bas;
        gec1 = List2.bas;

        while (gec != null) {

            test = test + gec.icerik + gec1.icerik;
            if (test == 0) {
                ListToplam.basaEkle(new Eleman(0));
                gec = gec.ileri;
                gec1 = gec1.ileri;
                test = 0;  //eldeki kalan
            } else if (test == 1) {
                ListToplam.basaEkle(new Eleman(1));
                gec = gec.ileri;
                gec1 = gec1.ileri;
                test = 0; //eldeki kalan
            } else if (test == 2) {
                ListToplam.basaEkle(new Eleman(0));
                if (gec.ileri == null) {
                    ListToplam.basaEkle(new Eleman(1));
                }
                test = 1;
                gec = gec.ileri;
                gec1 = gec1.ileri;
            } else if (test == 3) {
                ListToplam.basaEkle(new Eleman(1));
                if (gec.ileri == null) {
                    ListToplam.basaEkle(new Eleman(1));
                }
                gec = gec.ileri;
                gec1 = gec1.ileri;
                test = 1; //eldeki kalan
            }

        }
        return ListToplam;
    }

    public int onlukcevir(yeniden l) {
        Eleman head;
        head = l.bas;
        Eleman finish;
        finish = l.son;
        Eleman gec;
        gec = l.bas;
        int say = 1;
        int ikiliktabn = 1;
        int topla = 0;
        if (head.icerik == 1) {
            topla = 1;
        } else if (head.icerik == 0) {
            topla = 0;
        }
        gec = gec.ileri;
        while (gec != null) {
            if (gec.icerik == 1) {
                for (int i = 1; i <= say; i++) {
                    ikiliktabn = ikiliktabn * 2;
                }
                topla = topla + ikiliktabn;
                ikiliktabn = 1;
                say = say + 1;
                gec = gec.ileri;
            } else {
                say = say + 1;
                gec = gec.ileri;
            }
        }

        return topla;
    }
}
