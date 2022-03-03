package odev2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

//circular linked list
public class DBL {

    private JFrame form;

    CiftEleman Bas;
    CiftEleman gez;//eklemek icin
    CiftEleman al;//cizmek icin
    int acidegeri;
    int KaldiDevam;

    // yukari olmasi lazim
    public DBL(JFrame form) {
        this.form = form;
        Bas = null;
    }

    public void BasaEkle(CiftEleman yeni) {
        if (Bas == null) {
            yeni.ileri = yeni;
            yeni.geri = yeni;
        } else {
//            
            yeni.ileri = Bas;
            yeni.geri = Bas.geri;
            Bas.geri.ileri = yeni;
            Bas.geri = yeni;
        }
        Bas = yeni;
    }

    public void Ekle(CiftEleman yeni) {
        if (Bas == null) {
            BasaEkle(yeni);
            gez = Bas;
        } else {
            gez.ileri = yeni;
            yeni.geri = gez;
            yeni.ileri = Bas;
            Bas.geri = yeni;
            gez = yeni;

        }
    }

    public void gosterIleri() {
        CiftEleman gor;
        if (Bas == null) {
            System.out.println("Listede Eleman yok");
        } else {
            gor = Bas;
            System.out.print(gor.SinDegeri + "  ");
            System.out.println(gor.aci + "  ");
            while (gor.ileri != Bas) {
                gor = gor.ileri;
                System.out.print(gor.SinDegeri + " ");
                System.out.println(gor.aci + " ");
            }
        }
    }

    public void gostergeri() {
        CiftEleman gor;
        if (Bas == null) {
            System.out.println("Listede Eleman yok");
        } else {
            System.out.print(Bas.SinDegeri + "  ");
            System.out.println(Bas.aci);

            gor = Bas.geri;

            while (gor != Bas) {
                System.out.print(gor.SinDegeri + " ");
                System.out.println(gor.aci + " ");
                gor = gor.geri;
            }

        }
    }
// 360 derece ve karşısındaki sin değerleri ekliyor.Çizgi yaparken hazır olan değerler kullanmak için
    public void SinVeAciEkle() {

        for (int i = 0; i < 360; i++) {
            double SinDegeri = Math.sin(Math.toRadians(i));
            Ekle(new CiftEleman(SinDegeri, i));
        }

    }

    public void drawLine(int acidegeri) {
        al = Bas;
        this.acidegeri = acidegeri;
            // verilen açı değeri çizgi çizmesine o açı dan başlamak için onun duğumuna gitmek
        if (acidegeri >= 0) {
            
            for (int i = 0; i < acidegeri; i++) {
                al = al.ileri;
            }
            KaldiDevam = acidegeri + 360;
        } else {
            
            for (int i = 0; i > acidegeri; i--) {
                al = al.geri;
            }
            KaldiDevam = acidegeri - 360;
        }

        JPanel pln = new JPanel() {

            int i;

            @Override
            public void paintComponent(Graphics g) {

                Graphics2D g2 = (Graphics2D) g;

                g2.drawLine(30, 500, 1900, 500);    // x axis
                g2.drawLine(950, 30, 950, 1000); // y axis

                double sinDeger;
                int sinDegerInteger;

                g2.setColor(Color.blue);
                 // eğer açı 0 den büyük eşit ise sağ tarafta çiz
                if (acidegeri >= 0) {

                    for (i = acidegeri; i < acidegeri + 360; i++) {

                        sinDeger = al.SinDegeri;

                        sinDegerInteger = (int) (100 * sinDeger);

                        g2.drawLine((950) + (i), 500 - sinDegerInteger, (950) + ((i + 1)), 500 - sinDegerInteger);
                        al = al.ileri;
                    }
                  // eğer açı değeri sıfırdan küçük ise sol tarafta çiz
                } else {
                    for (i = acidegeri; i > acidegeri - 360; i--) {
                        sinDeger = al.SinDegeri;

                        sinDegerInteger = (int) (100 * sinDeger);

                        g2.drawLine((950 + acidegeri) + (i - acidegeri), 500 - (sinDegerInteger), (950 + acidegeri) + ((i + 1) - acidegeri), 500 - (sinDegerInteger));
                        al = al.geri;
                    }

                }
            }
        };
        pln.setBounds(0, 0, form.getWidth(), form.getHeight());
        form.add(pln);
        
        

    }

    public void tekrarCiz(int tekrar) {
        JPanel pln1 = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                int i;
                int don = 0;
                Graphics2D g2 = (Graphics2D) g;
                double sinDeger;

                int sinDegerInteger;

                g2.setColor(Color.red);
                // kaç defa tekrarlanacak while loop karar verir
                while (don < tekrar) {
                    //eğer açı pozetif ise sağ tarafta çiz
                    if (acidegeri >= 0) {
                        for (i = KaldiDevam; i < KaldiDevam + 360; i++) {

                            sinDeger = al.SinDegeri;

                            sinDegerInteger = (int) (100 * sinDeger);

                            g2.drawLine((950) + (i), 500 - sinDegerInteger, (950) + ((i)), 500 - sinDegerInteger);
                            al = al.ileri;
                        }
                        KaldiDevam = KaldiDevam + 360;
                        don++;
                      // eğer açı değeri negatif ise sol tarafta çiz
                    } else {
                        for (i = KaldiDevam; i > KaldiDevam - 360; i--) {

                            sinDeger = al.SinDegeri;

                            sinDegerInteger = (int) (100 * sinDeger);

                            g2.drawLine((950) + (i), 500 - sinDegerInteger, (950) + ((i + 1)), 500 - sinDegerInteger);
                            al = al.geri;
                        }
                        KaldiDevam = KaldiDevam - 360;
                        don++;
                    }

                }
            }
        };
        pln1.setBounds(0, 0, form.getWidth(), form.getHeight());
        form.add(pln1);
        

    }

  
}
