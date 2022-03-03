package ciftbagliliste;

public class DaireselBagliListe {

    CiftEleman bas;

    public DaireselBagliListe() {
        bas = null;
    }

    public void basaEkle(CiftEleman yeni) {
        if (bas == null) {
            yeni.ileri = yeni;
            yeni.geri = yeni;

        } else {
            yeni.ileri = bas;
            yeni.geri = bas.geri;
            bas.geri.ileri = yeni;
            bas.geri = yeni;
        }

        bas = yeni;

    }

    public void goster() {
        CiftEleman bul;

        if (bas == null) {
            System.out.println("Listede Eleman yok");
        } else {
            bul = bas;
            System.out.println(bul.icerik);
            while (bul.ileri != bas) {
                bul = bul.ileri;

                System.out.println(bul.icerik);
            }
        }
    }
}
