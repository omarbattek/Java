package odev3;

public class Yigit {

    Eleman ust;
    int sayac;

    public Yigit() {
        ust = null;
        sayac = 0;
    }

    public boolean bosmu() {
        if (ust == null) {
            return true;
        } else {
            return false;
        }
    }

    public void Ekle(Eleman yeni) {
        if (bosmu()) {
            ust = yeni;
            sayac = sayac + 1;

        } else {
            yeni.ileri = ust;
            ust = yeni;
            sayac = sayac + 1;
        }
    }

    Eleman sil() {
        Eleman sonuc = ust;
        if (!bosmu()) {
            ust = ust.ileri;
            sayac = sayac - 1;
        }
        return sonuc;
    }

    public void topla() {
        if (sayac == 0) {
            System.out.println("Toplama islemi icin Listede  eleman yok");
        } else {
            Eleman sayi1 = ust;
            Eleman sayi2 = ust.ileri;

            if (sayac == 1) {
                System.out.println("Toplama islemi icin Listede  sadece bir eleman var");
            } else {
                int birincisayi = sayi1.girilen;
                int ikincisayi = sayi2.girilen;
                int topla = birincisayi + ikincisayi;
                sil();
                sil();
                Ekle(new Eleman(topla));
            }
        }
    }

    public void cikar() {
        if (sayac == 0) {
            System.out.println("cikarma islemi icin Listede  eleman yok");
        } else {
            Eleman sayi1 = ust;
            Eleman sayi2 = ust.ileri;
            if (sayac == 1) {
                System.out.println("cikarma islemi icin Listede  sadece bir eleman var");
            } else {
                int birincisayi = sayi1.girilen;
                int ikincisayi = sayi2.girilen;
                int topla = ikincisayi - birincisayi;
                sil();
                sil();
                Ekle(new Eleman(topla));
            }

        }
    }

    public void carp() {

        if (sayac == 0) {
            System.out.println("carpma islemi icin Listede  eleman yok");
        } else {
            Eleman sayi1 = ust;
            Eleman sayi2 = ust.ileri;

            if (sayac == 1) {
                System.out.println("carpma islemi icin Listede  sadece bir eleman var");
            } else {
                int birincisayi = sayi1.girilen;
                int ikincisayi = sayi2.girilen;
                int topla = birincisayi * ikincisayi;
                sil();
                sil();
                Ekle(new Eleman(topla));
            }
        }
    }

    public void bol() {
        if (sayac == 0) {
            System.out.println("Bolme islemi icin Listede  eleman yok");
        } else {
            Eleman sayi1 = ust;
            Eleman sayi2 = ust.ileri;

            if (sayac == 1) {
                System.out.println("Bolme islemi icin Listede  sadece bir eleman var");
            } else {
                int birincisayi = sayi1.girilen;
                int ikincisayi = sayi2.girilen;
                if (birincisayi == 0 && ikincisayi == 0) {
                    System.out.println("yanlis operasiyon");
                } else {
                    int topla = ikincisayi / birincisayi;
                    System.out.println(topla);
                    sil();
                    sil();
                    Ekle(new Eleman(topla));
                }
            }
        }
    }

    public void goster() {
        int son = 1;
        Eleman gor = ust;
        System.out.print("[");
        while (gor != null) {
            if (sayac == 1) {
                System.out.print(gor.girilen);
                son++;
                gor = gor.ileri;
            } else if (son == sayac) {
                System.out.print(gor.girilen);
                gor = gor.ileri;
            } else {
                System.out.print(gor.girilen + ",");
                son++;
                gor = gor.ileri;
            }
        }
        System.out.print("]");
        System.out.println();
    }
}
