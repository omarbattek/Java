package siralama;

public class Siralama {

    public static void main(String[] args) {
        QuickSort s = new QuickSort();
        int[] dizi = {2, 8, 33, 15, 3, 0, 6, 12, 15, 16, 7, 8};
        s.hizli(dizi, 0, dizi.length - 1);
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + "  ");
        }
    }

}
