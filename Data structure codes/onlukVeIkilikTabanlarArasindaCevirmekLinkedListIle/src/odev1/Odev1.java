package odev1;

public class Odev1 {

    public static void main(String[] args) {
// convert from binary to decimal or from decimal to binary in linked list
        yeniden y = new yeniden();
        //onluk taban ikilik tabana donüştüren
        y.cevir(345);
        //ikilik tabanından onluk tabana dönüsturen
        System.out.println(y.onlukcevir(y));
        //show the number as binary
        y.goster();
        




    }

}
