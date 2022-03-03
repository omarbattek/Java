package odev5;

public class Odev5 {

    public static void main(String[] args) {
        // built BFS tree from array
        Plaka p = new Plaka();
       p.indisleme(30); // start BFS tree from root 
      // p.guncelle(1); to refresh binary tree
        p.printLevelOrder();
        System.out.println(p.AgacIkiliMi());
// the secones big number in binary tree

        Quiz q = new Quiz();

        q.Ekle(new Dugum1(5));
        q.Ekle(new Dugum1(4));
        q.Ekle(new Dugum1(15));
        q.Ekle(new Dugum1(9));
        q.Ekle(new Dugum1(11));
        q.Ekle(new Dugum1(12));

        System.out.println(q.EnBuyukIkinci1());
    }

}
