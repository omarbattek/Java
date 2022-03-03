package odev2;

public class CiftEleman {

    double SinDegeri;
    int aci;
    CiftEleman ileri;
    CiftEleman geri;

    CiftEleman(double SinDegeri, int aci) {
        ileri = null;
        geri = null;
        this.SinDegeri = SinDegeri;
        this.aci = aci;
    }
}
