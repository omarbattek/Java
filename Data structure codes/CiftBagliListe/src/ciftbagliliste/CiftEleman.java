package ciftbagliliste;

public class CiftEleman {

    int icerik;
    CiftEleman ileri;
    CiftEleman geri;

    CiftEleman(int icerik) {
        this.icerik = icerik;
        ileri = null;
        geri = null;

    }
}
