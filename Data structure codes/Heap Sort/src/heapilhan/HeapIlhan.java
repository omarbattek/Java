package heapilhan;

public class HeapIlhan {

    public static void main(String[] args) {
        // bu kod max heap sort'a göre sıralıyor
        Yigin y = new Yigin(20);
        y.Ekle(new Nokta(5));
        y.Ekle(new Nokta(7));
        y.Ekle(new Nokta(1));
        y.Ekle(new Nokta(10));
        y.Ekle(new Nokta(100));
        y.Ekle(new Nokta(12));
        y.Ekle(new Nokta(1));
        y.Ekle(new Nokta(33));
        y.Ekle(new Nokta(200));
        y.Ekle(new Nokta(13));
        
        y.goster();

    }

}
