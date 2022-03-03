package odev5;

public class Quiz {
// the secones big number in binary tree
    Dugum1 kok;

    Quiz() {
        kok = null;
    }

    public int EnBuyukIkinci() {
        boolean tekrar = true;
        int sayi = 0;
        Dugum1 tmp = kok;
        Dugum1 once = null;
        while (tmp.sag != null) {
            once = tmp;
            tmp = tmp.sag;

            if (tmp.sag != null) {
                tekrar = true;
            } else if (tmp.sol != null) {
                tmp = tmp.sol;
                tekrar = true;
                sayi++;
                if (sayi == 1) {
                    tekrar = false;
                }
            } else {
                tekrar = false;
            }
        }

        if (tmp.icerik > once.icerik && once.sag.icerik == tmp.icerik) {
            return once.icerik;
        } else {
            return tmp.icerik;
        }

    }

    public void Ekle(Dugum1 yeni) {
        Dugum1 tmp = kok;
        Dugum1 once = null;
        while (tmp != null) {
            once = tmp;
            if (yeni.icerik < tmp.icerik) {
                tmp = tmp.sol;
            } else {
                tmp = tmp.sag;
            }

        }
        if (once == null) {
            kok = yeni;
        } else if (yeni.icerik < once.icerik) {
            once.sol = yeni;
        } else {
            once.sag = yeni;
        }
    }

    public int EnBuyukIkinci1() {

        int sayi = 0;
        Dugum1 tmp1 = null;
        Dugum1 tmp = kok;
        Dugum1 once = null;
        while (tmp.sag != null) {
            once = tmp;
            tmp = tmp.sag;

        }
        if (tmp.sol != null) {
            tmp1 = tmp.sol;
            while (tmp1.sag != null) {
                tmp1 = tmp1.sag;
            }
            return tmp1.icerik;
        } else {
            return once.icerik;
        }
    }
}
