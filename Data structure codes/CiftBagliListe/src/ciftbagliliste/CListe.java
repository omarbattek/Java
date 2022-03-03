package ciftbagliliste;

public class CListe {

    CiftEleman bas;
    CiftEleman son;

    public CListe() {
        bas = null;
        son = null;
    }

    public void basaEkle(CiftEleman yeni) {
        if (son == null) {
            bas = yeni;
            son = yeni;
        } else {
            yeni.ileri = bas;
            bas.geri = yeni;
            bas = yeni;
        }

    }

    public void sonaEkle(CiftEleman yeni) {
        if (bas == null) {
            son = yeni;
            bas = yeni;
        } else {
            son.ileri = yeni;
            yeni.geri = son;
            son = son.ileri;
        }

    }

    public void arayaEkle(CiftEleman yeni, int aranan) {
        if (bas == null) {
            bas = yeni;
            son = yeni;
        } else {
            CiftEleman tmp = bas;
            while (tmp.icerik != aranan && tmp.ileri != null) {
                tmp = tmp.ileri;
            }
            if (tmp.ileri == null) {
                basaEkle(yeni);
            } else {
                yeni.ileri = tmp.ileri;
                yeni.geri = tmp;
                tmp.ileri.geri = yeni;
                tmp.ileri = yeni;
            }
        }
    }

    public void bastanSil() {
        bas = bas.ileri;
        if (bas == null) {
            son = null;
        } else {
            bas.geri = null;
        }
    }

    public void sondanSil() {

        if (bas == son) {
            bas = null;
            son = null;
        } else {
            son = son.geri;
            son.ileri = null;
        }
    }

    public void arayaSil(int silenen) {
        CiftEleman tmp = bas;
        while (tmp.icerik != silenen && tmp.ileri != null) {
            tmp = tmp.ileri;
        }
        if (tmp.ileri == null) {
            System.out.println("listede aranan eleman yok ya da son elemandir");
        } else {
            tmp.ileri.geri = tmp.geri;
            tmp.geri.ileri = tmp.ileri;
        }
    }

    public void goster() {
        CiftEleman bul;

        if (bas == null) {
            System.out.println("Listede Eleman yok");
        } else {
            bul = bas;
            System.out.println(bul.icerik);
            while (bul.ileri != null) {
                bul = bul.ileri;

                System.out.println(bul.icerik);
            }
        }
    }
}
