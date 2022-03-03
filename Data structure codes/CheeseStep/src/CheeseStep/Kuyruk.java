package CheeseStep;

public class Kuyruk {

    int say;
    int kacdefa;
    int kacdefa1;
    int cevir;

    int matris[][] = new int[8][8];
    Eleman bas;
    Eleman son;
    int listeLeangth = 0;

    Kuyruk() {
        bas = null;
        son = null;
    }

    boolean bosmu() {
        return bas == null;
    }

    public void Ekle(Eleman yeni) {
        kacdefa++;
        listeLeangth++;
        if (bosmu()) {
            bas = yeni;
            son = yeni;
        } else {
            son.ileri = yeni;
            son = yeni;
        }

    }

    Eleman KuyrukSil() {
        kacdefa1 = kacdefa1 + kacdefa;

        kacdefa = 0;

        listeLeangth--;
        Eleman sonuc;
        sonuc = bas;
        if (!bosmu()) {
            bas = bas.ileri;
            if (bas == null) {
                son = null;
            }

        }
        return sonuc;

    }

    public void cheeseHareket(Eleman verilen) {

        int i = verilen.sayi1;

        int j = verilen.sayi2;

        if (i < 8 && i >= 0 && j < 8 && j >= 0) {

            if ((i + 1) < 8 && (j + 2) < 8) {

                Ekle(new Eleman((i + 1), (j + 2)));
            }
            if ((i + 1) < 8 && (j - 2) >= 0) {

                Ekle(new Eleman((i + 1), (j - 2)));
            }
            if ((i + 2) < 8 && (j + 1) < 8) {

                Ekle(new Eleman((i + 2), (j + 1)));
            }
            if ((i + 2) < 8 && (j - 1) >= 0) {

                Ekle(new Eleman((i + 2), (j - 1)));
            }

            if ((i - 1) >= 0 && (j + 2) < 8) {

                Ekle(new Eleman((i - 1), (j + 2)));
            }
            if ((i - 1) >= 0 && (j - 2) >= 0) {

                Ekle(new Eleman((i - 1), (j - 2)));
            }
            if ((i - 2) >= 0 && (j + 1) < 8) {

                Ekle(new Eleman((i - 2), (j + 1)));
            }
            if ((i - 2) >= 0 && (j - 1) >= 0) {

                Ekle(new Eleman((i - 2), (j - 1)));
            }
        }

    }

    public void BFS(Eleman bulunan, Eleman baslayan) {

        say++;
        Ekle(baslayan);

        cheeseHareket(KuyrukSil());

        cevir = kacdefa;

        int x = bas.sayi1;
        int x1 = bas.sayi2;

        while (bosmu() == false) {

            cevir--;

            if (cevir == 0) {

                cevir = kacdefa1;

                kacdefa1 = 0;
                say++;

            }

            cheeseHareket(KuyrukSil());
            x = bas.sayi1;
            x1 = bas.sayi2;

            if (x == bulunan.sayi1 && x1 == bulunan.sayi2) {
                break;
            }

        }

        System.out.println("Minimum adım sayısı " + say);
    }

    public void mesafe(Eleman ver) {
        int mesaf = 1;
        Kuyruk k1 = new Kuyruk();
        k1.Ekle(new Eleman(0, 0));

        int i = 0;
        int j = 1;
        while (k1.bosmu() == false) {
            mesaf++;

            k1.Ekle(new Eleman(i, j));
            k1.KuyrukSil();
            j++;
            if (j == 8) {
                j = 0;
                i++;
            }
            if (i == 8 && j == 0) {
                mesaf = 0;
                System.out.println("Eleman bulunmadi");
                break;
            }
            if (i == ver.sayi1 && j == ver.sayi2) {
                break;
            }
        }
        System.out.println(mesaf);

    }
}
