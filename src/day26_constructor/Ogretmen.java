package day26_constructor;

public class Ogretmen {

    String isim="Isim belirtilmedi";
    String soyisim="Soyisim belirtilmedi";
    String dogumTarihi="Tarih girilmedi";
    String brans="Brans girilmedi";
    String yanBras="Yan brans girilmedi";

    public Ogretmen() {
    }

    public Ogretmen(String isim, String soyisim, String dogumTarihi, String brans, String yanBras) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanBras = yanBras;
    }

    public Ogretmen(String isim, String soyisim, String dogumTarihi) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return
                "\n isim : " + isim +
                "\n soyisim : " + soyisim  +
                "\n dogumTarihi : " + dogumTarihi  +
                "\n brans : " + brans  +
                "\n yanBras : " + yanBras ;
    }
}
