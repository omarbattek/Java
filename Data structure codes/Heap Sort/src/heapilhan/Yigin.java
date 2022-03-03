package heapilhan;

public class Yigin {

    Nokta dizi[];
    int tane;

    public Yigin(int N) {
        dizi = new Nokta[N];
        tane = 0;
    }

    boolean YiginBos() {
        if (tane == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void Ekle(Nokta yeni) {
        tane++;
        dizi[tane - 1] = yeni;
        yukaricik(tane - 1);

    }

    public void yukaricik(int no) {
        int ustdal;
        ustdal = (no - 1) / 2;
        while (ustdal >= 0 && dizi[ustdal].icerik < dizi[no].icerik) {
            int ara = dizi[ustdal].icerik;
            dizi[ustdal].icerik = dizi[no].icerik;
            dizi[no].icerik = ara;
            no = ustdal;
            ustdal = (no - 1) / 2;
        }
    }

    public void goster() {
        for (int i = 0; i < tane; i++) {
            System.out.println(dizi[i].icerik);
        }

    }
}
