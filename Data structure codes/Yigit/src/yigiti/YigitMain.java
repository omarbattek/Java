package yigiti;

public class YigitMain {

    public static void main(String[] args) {
        // Yiğit temel amacı ilk giren son çıkan
        // aşağıdaki yığıt Duğum değişken ile dolduruluyor
        Yigit y = new Yigit(5);
        Dugum o1 = new Dugum(9, "Ali");
        y.Ekle(o1);
        y.Ekle(new Dugum(1, "Ayse"));
        y.Ekle(new Dugum(3, "omer"));
        y.Ekle(new Dugum(7, "muhamed"));
        // tepedeki eleman sil
        Dugum s = y.sil();
        // silinen eleman yaz
        System.out.println(s.isim + " " + s.No);
        //Tepedeki eleman yaz
        System.out.println(y.ustDondur().isim);
       //Aşağıdaki yığıt Bağlı liste vasıtasıyla yığıtta depolanıor
        YigitBagli b = new YigitBagli();
        b.Ekle(new Eleman(45));
        b.Ekle(new Eleman(435));
        b.sil();
        b.goster();

    }
}
