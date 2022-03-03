package yigiti;

public class Yigit {

    Dugum[] d;
    int ust;
    int N;

    public Yigit(int N) {
        this.N = N;
        d = new Dugum[N];
        ust = -1;

    }

    Dugum ustDondur() {
        if (ust != -1) {
            return d[ust];
        } else {
            return null;
        }
    }

    boolean dolumu() {
        if (ust == N - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean bosmu() {
        if (ust == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void Ekle(Dugum yeni) {
        if (!dolumu()) {
            ust = ust + 1;
            d[ust] = yeni;
        }
    }

    Dugum sil() {
        if (!bosmu()) {
            ust = ust - 1;
            return d[ust + 1];
        } else {
            return null;
        }

    }
}
