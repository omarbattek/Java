package ikiliAgac;

public class IkiliAgac {

    public static void main(String[] args) {
        Agac c = new Agac();
        Dugum kok = new Dugum(10);
        c.Ekle(kok);
        c.Ekle(new Dugum(5));
        c.Ekle(new Dugum(7));
        c.Ekle(new Dugum(2));
        c.Ekle(new Dugum(6));
        c.Ekle(new Dugum(8));
        c.Ekle(new Dugum(1));
        c.Ekle(new Dugum(3));
        c.Ekle(new Dugum(15));
        c.Ekle(new Dugum(13));
        c.Ekle(new Dugum(12));
        c.Ekle(new Dugum(14));
        c.sil(6);
        c.sil(5);
        System.out.println("orta kok");
        c.ortakok(kok);
        
        System.out.println("sonra kok");
        c.sonrakok(kok);
        System.out.println("once kok");
        c.oncekok(kok);
        System.out.println("level Order");
        c.printLevelOrder();
       
        
       

    }

}
