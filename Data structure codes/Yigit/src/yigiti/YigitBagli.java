package yigiti;

public class YigitBagli {

    int sayac = 0;
    Eleman ust;

    public YigitBagli() {
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
        } else {
            yeni.ileri = ust;
            ust = yeni;
        }
    }

    Eleman sil() {
        Eleman sonuc = ust;
        if (!bosmu()) {
            ust = ust.ileri;

        }
        return sonuc;
    }

    public void goster() {
        Eleman gor = ust;
        while (gor != null) {
            System.out.println(gor.icerik);
            gor = gor.ileri;
        }

    }
}
