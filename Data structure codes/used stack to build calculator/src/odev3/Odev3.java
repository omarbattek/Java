package odev3;

import java.util.Scanner;

public class Odev3 {

    public static void main(String[] args) {
        
        //Yıgıtaki olan en tepedeki iki sayı için işlem yapıyor
        int temp;

        String ters = "";
        int temp1;
        String yeni = "";
        Yigit y = new Yigit();

        Scanner k = new Scanner(System.in);

        boolean stop = true;
        System.out.println("input numbers after that input the operation(+ - * /) to operate two top numbers ");
        System.out.println("if you want see numbers in stack write ?");
        System.out.println("if you want delete number in stack write ^");
        System.out.println("if you want go out from programming  write !");
        while (stop) {
            String gir = k.next();
            if (gir.equals("+")) {
                y.topla();
            } else if (gir.equals("-")) {
                y.cikar();
            } else if (gir.equals("*")) {
                y.carp();
            } else if (gir.equals("/")) {
                y.bol();
            } else if (gir.equals("?")) {
                y.goster();
            } else if (gir.equals("^")) {
                System.out.println(y.sil().girilen);
            } else {
                try {
                    temp = Integer.parseInt(gir);
                    y.Ekle(new Eleman(temp));
                } catch (Exception e) {
                    if (gir.equals("!")) {
                        System.out.println("programdan cikarildi");
                    } else {
                        System.out.println("yanlis eleman ");
                    }
                }
                if (gir.equals("!")) {
                    stop = false;
                }
            }

        }

    }

}
