package odev5;

public class Dugum {

    int SehirNo;
    String SehirAdi;
    double SehirEnlem;
    double SehirBoylam;
    Dugum sol;
    Dugum sag;

    Dugum(int SehirNo, String SehirAdi, double SehirEnlem, double SehirBoylam) {
        this.SehirNo = SehirNo;
        this.SehirAdi = SehirAdi;
        this.SehirEnlem = SehirEnlem;
        this.SehirBoylam = SehirBoylam;
        sol = null;
        sag = null;
    }
}
