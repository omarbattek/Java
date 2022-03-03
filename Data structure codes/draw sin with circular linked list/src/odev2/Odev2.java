package odev2;

import java.awt.Color;
import javax.swing.JFrame;

public class Odev2 {

    public static void main(String[] args) {
        JFrame frames = new JFrame();
        DBL D = new DBL(frames);
        frames.setSize(2000, 1200);
        frames.setBackground(Color.WHITE);
        frames.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frames.setVisible(true);
        D.SinVeAciEkle();
        D.drawLine(-30); //  draw one sin wave and start with angle -30
        D.tekrarCiz(2); // repeat sin wave 2 times
        
 


    }

}
