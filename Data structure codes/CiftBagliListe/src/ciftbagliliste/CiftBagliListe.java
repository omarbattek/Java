package ciftbagliliste;

public class CiftBagliListe {

    public static void main(String[] args) {
        // Bu projede Cift bagli kiste ve Dairesel bagli liste  gosteriyor
        CListe cl = new CListe();
        cl.basaEkle(new CiftEleman(99));
        System.out.println("Cift Bagli liste elemanlari: ");
        cl.goster();
        
        DaireselBagliListe db = new DaireselBagliListe();
        System.out.println("Dairesel bagli liste elemanlari");
        db.basaEkle(new CiftEleman(8));
        db.basaEkle(new CiftEleman(56));
        db.basaEkle(new CiftEleman(77));
        db.goster();
        // Bağlı liste vasıtasıyla polinom gösteriyor her dugumde değişkenin kat sayısı ve derecesi ekleniyor
        Polinom p = new Polinom();
        p.sonaEkle(new Dugum(3, 2));
        p.sonaEkle(new Dugum(5, 1));
        p.sonaEkle(new Dugum(2, 0));
        p.goster();
        
    }

}
