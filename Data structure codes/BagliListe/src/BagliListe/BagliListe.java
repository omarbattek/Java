package BagliListe;

public class BagliListe {

    public static void main(String[] args) {
        Liste t = new Liste();
        t.basaEkle(new Eleman(7));

        t.sonEkle(new Eleman(156));
        t.arayaEkle(new Eleman(8), 7);

        t.basaEkle(new Eleman(46));
        t.sonEkle(new Eleman(15));
        t.sonEkle(new Eleman(176));
        t.arayaSilme(7);
        t.arayaSilme(15);

        t.goster();

    }

}
